package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[String] = js.native
}

object Schema$LiveChatMessageDeletedDetails {
  @scala.inline
  def apply(deletedMessageId: String = null): Schema$LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    if (deletedMessageId != null) __obj.updateDynamic("deletedMessageId")(deletedMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatMessageDeletedDetails]
  }
}

