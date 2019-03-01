package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Alpha extends js.Object {
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Ephemeral message that may change every time the operation is polled. @OutputOnly */
  var ephemeralMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** Durable messages that persist on every operation poll. @OutputOnly */
  var warning: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OperationMetadataV1Alpha {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    ephemeralMessage: java.lang.String = null,
    insertTime: java.lang.String = null,
    method: java.lang.String = null,
    target: java.lang.String = null,
    user: java.lang.String = null,
    warning: js.Array[java.lang.String] = null
  ): OperationMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (ephemeralMessage != null) __obj.updateDynamic("ephemeralMessage")(ephemeralMessage)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (method != null) __obj.updateDynamic("method")(method)
    if (target != null) __obj.updateDynamic("target")(target)
    if (user != null) __obj.updateDynamic("user")(user)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[OperationMetadataV1Alpha]
  }
}

