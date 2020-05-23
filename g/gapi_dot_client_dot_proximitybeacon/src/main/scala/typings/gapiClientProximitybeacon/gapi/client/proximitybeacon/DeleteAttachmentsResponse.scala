package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAttachmentsResponse extends js.Object {
  /** The number of attachments that were deleted. */
  var numDeleted: js.UndefOr[Double] = js.undefined
}

object DeleteAttachmentsResponse {
  @scala.inline
  def apply(numDeleted: js.UndefOr[Double] = js.undefined): DeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numDeleted)) __obj.updateDynamic("numDeleted")(numDeleted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttachmentsResponse]
  }
}

