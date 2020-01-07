package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatPollClosedDetails extends js.Object {
  /**
    * The id of the poll that was closed.
    */
  var pollId: js.UndefOr[String] = js.native
}

object Schema$LiveChatPollClosedDetails {
  @scala.inline
  def apply(pollId: String = null): Schema$LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    if (pollId != null) __obj.updateDynamic("pollId")(pollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatPollClosedDetails]
  }
}

