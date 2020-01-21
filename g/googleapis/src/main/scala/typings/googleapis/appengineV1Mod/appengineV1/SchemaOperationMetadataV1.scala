package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation.
  */
@js.native
trait SchemaOperationMetadataV1 extends js.Object {
  var createVersionMetadata: js.UndefOr[SchemaCreateVersionMetadataV1] = js.native
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
    * google.appengine.v1.Versions.CreateVersion.@OutputOnly
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

object SchemaOperationMetadataV1 {
  @scala.inline
  def apply(
    createVersionMetadata: SchemaCreateVersionMetadataV1 = null,
    endTime: String = null,
    ephemeralMessage: String = null,
    insertTime: String = null,
    method: String = null,
    target: String = null,
    user: String = null,
    warning: js.Array[String] = null
  ): SchemaOperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    if (createVersionMetadata != null) __obj.updateDynamic("createVersionMetadata")(createVersionMetadata.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (ephemeralMessage != null) __obj.updateDynamic("ephemeralMessage")(ephemeralMessage.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationMetadataV1]
  }
}

