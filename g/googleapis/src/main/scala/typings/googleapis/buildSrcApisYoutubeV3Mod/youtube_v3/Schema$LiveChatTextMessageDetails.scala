package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatTextMessageDetails extends js.Object {
  /**
    * The user&#39;s message.
    */
  var messageText: js.UndefOr[String] = js.native
}

object Schema$LiveChatTextMessageDetails {
  @scala.inline
  def apply(messageText: String = null): Schema$LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatTextMessageDetails]
  }
}

