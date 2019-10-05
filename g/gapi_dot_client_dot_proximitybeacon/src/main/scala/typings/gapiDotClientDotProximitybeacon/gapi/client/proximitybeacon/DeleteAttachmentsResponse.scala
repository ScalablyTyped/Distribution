package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAttachmentsResponse extends js.Object {
  /** The number of attachments that were deleted. */
  var numDeleted: js.UndefOr[Double] = js.undefined
}

object DeleteAttachmentsResponse {
  @scala.inline
  def apply(numDeleted: Int | Double = null): DeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (numDeleted != null) __obj.updateDynamic("numDeleted")(numDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttachmentsResponse]
  }
}

