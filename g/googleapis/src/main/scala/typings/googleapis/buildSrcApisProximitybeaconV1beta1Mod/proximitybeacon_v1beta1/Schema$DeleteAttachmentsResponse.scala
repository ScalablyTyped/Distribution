package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for a request to delete attachments.
  */
@js.native
trait Schema$DeleteAttachmentsResponse extends js.Object {
  /**
    * The number of attachments that were deleted.
    */
  var numDeleted: js.UndefOr[Double] = js.native
}

object Schema$DeleteAttachmentsResponse {
  @scala.inline
  def apply(numDeleted: Int | Double = null): Schema$DeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (numDeleted != null) __obj.updateDynamic("numDeleted")(numDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteAttachmentsResponse]
  }
}

