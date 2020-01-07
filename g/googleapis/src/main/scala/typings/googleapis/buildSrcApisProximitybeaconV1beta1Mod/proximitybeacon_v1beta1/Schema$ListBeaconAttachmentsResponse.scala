package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to `ListBeaconAttachments` that contains the requested
  * attachments.
  */
@js.native
trait Schema$ListBeaconAttachmentsResponse extends js.Object {
  /**
    * The attachments that corresponded to the request params.
    */
  var attachments: js.UndefOr[js.Array[Schema$BeaconAttachment]] = js.native
}

object Schema$ListBeaconAttachmentsResponse {
  @scala.inline
  def apply(attachments: js.Array[Schema$BeaconAttachment] = null): Schema$ListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListBeaconAttachmentsResponse]
  }
}

