package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Beta5 extends js.Object {
  /** Timestamp that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[String] = js.undefined
  /** Timestamp that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[String] = js.undefined
  /** API method name that initiated this operation. Example: google.appengine.v1beta5.Version.CreateVersion.@OutputOnly */
  var method: js.UndefOr[String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[String] = js.undefined
}

object OperationMetadataV1Beta5 {
  @scala.inline
  def apply(
    endTime: String = null,
    insertTime: String = null,
    method: String = null,
    target: String = null,
    user: String = null
  ): OperationMetadataV1Beta5 = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMetadataV1Beta5]
  }
}

