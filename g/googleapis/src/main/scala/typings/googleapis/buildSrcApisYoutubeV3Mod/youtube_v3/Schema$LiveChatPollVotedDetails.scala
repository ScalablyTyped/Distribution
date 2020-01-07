package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatPollVotedDetails extends js.Object {
  /**
    * The poll item the user chose.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * The poll the user voted on.
    */
  var pollId: js.UndefOr[String] = js.native
}

object Schema$LiveChatPollVotedDetails {
  @scala.inline
  def apply(itemId: String = null, pollId: String = null): Schema$LiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (pollId != null) __obj.updateDynamic("pollId")(pollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatPollVotedDetails]
  }
}

