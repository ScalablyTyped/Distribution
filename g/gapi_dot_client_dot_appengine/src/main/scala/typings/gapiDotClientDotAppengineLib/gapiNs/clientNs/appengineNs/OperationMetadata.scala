package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadata extends js.Object {
  /** Timestamp that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.v1beta4.Version.CreateVersion.@OutputOnly */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this operation. Deprecated, use method field instead. Example: "create_version".@OutputOnly */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/modules/default.@OutputOnly */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object OperationMetadata {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    insertTime: java.lang.String = null,
    method: java.lang.String = null,
    operationType: java.lang.String = null,
    target: java.lang.String = null,
    user: java.lang.String = null
  ): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[OperationMetadata]
  }
}

