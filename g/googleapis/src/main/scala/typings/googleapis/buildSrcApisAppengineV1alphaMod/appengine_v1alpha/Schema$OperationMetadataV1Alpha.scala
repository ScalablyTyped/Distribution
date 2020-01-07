package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation.
  */
@js.native
trait Schema$OperationMetadataV1Alpha extends js.Object {
  var createVersionMetadata: js.UndefOr[Schema$CreateVersionMetadataV1Alpha] = js.native
  /**
    * Time that this operation completed.@OutputOnly
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Ephemeral message that may change every time the operation is polled.
    * @OutputOnly
    */
  var ephemeralMessage: js.UndefOr[String] = js.native
  /**
    * Time that this operation was created.@OutputOnly
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * API method that initiated this operation. Example:
    * google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Name of the resource that this operation is acting on. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var target: js.UndefOr[String] = js.native
  /**
    * User who requested this operation.@OutputOnly
    */
  var user: js.UndefOr[String] = js.native
  /**
    * Durable messages that persist on every operation poll. @OutputOnly
    */
  var warning: js.UndefOr[js.Array[String]] = js.native
}

object Schema$OperationMetadataV1Alpha {
  @scala.inline
  def apply(
    createVersionMetadata: Schema$CreateVersionMetadataV1Alpha = null,
    endTime: String = null,
    ephemeralMessage: String = null,
    insertTime: String = null,
    method: String = null,
    target: String = null,
    user: String = null,
    warning: js.Array[String] = null
  ): Schema$OperationMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    if (createVersionMetadata != null) __obj.updateDynamic("createVersionMetadata")(createVersionMetadata.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ephemeralMessage != null) __obj.updateDynamic("ephemeralMessage")(ephemeralMessage.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationMetadataV1Alpha]
  }
}

