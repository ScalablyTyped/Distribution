package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Alpha extends js.Object {
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[String] = js.undefined
  /** Ephemeral message that may change every time the operation is polled. @OutputOnly */
  var ephemeralMessage: js.UndefOr[String] = js.undefined
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[String] = js.undefined
  /** API method that initiated this operation. Example: google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly */
  var method: js.UndefOr[String] = js.undefined
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[String] = js.undefined
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[String] = js.undefined
  /** Durable messages that persist on every operation poll. @OutputOnly */
  var warning: js.UndefOr[js.Array[String]] = js.undefined
}

object OperationMetadataV1Alpha {
  @scala.inline
  def apply(
    endTime: String = null,
    ephemeralMessage: String = null,
    insertTime: String = null,
    method: String = null,
    target: String = null,
    user: String = null,
    warning: js.Array[String] = null
  ): OperationMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ephemeralMessage != null) __obj.updateDynamic("ephemeralMessage")(ephemeralMessage.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMetadataV1Alpha]
  }
}

