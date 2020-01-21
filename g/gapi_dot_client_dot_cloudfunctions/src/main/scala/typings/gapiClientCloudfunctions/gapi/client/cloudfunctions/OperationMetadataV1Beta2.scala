package typings.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadataV1Beta2 extends js.Object {
  /** The original request that started the operation. */
  var request: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.undefined
  /** Type of operation. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Version id of the function created or updated by an API call.
    * This field is only pupulated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.undefined
}

object OperationMetadataV1Beta2 {
  @scala.inline
  def apply(
    request: Record[String, _] = null,
    target: String = null,
    `type`: String = null,
    versionId: String = null
  ): OperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMetadataV1Beta2]
  }
}

