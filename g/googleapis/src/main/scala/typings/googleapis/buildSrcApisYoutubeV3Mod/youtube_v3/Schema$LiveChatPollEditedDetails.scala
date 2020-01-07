package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatPollEditedDetails extends js.Object {
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Schema$LiveChatPollItem]] = js.native
  var prompt: js.UndefOr[String] = js.native
}

object Schema$LiveChatPollEditedDetails {
  @scala.inline
  def apply(id: String = null, items: js.Array[Schema$LiveChatPollItem] = null, prompt: String = null): Schema$LiveChatPollEditedDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatPollEditedDetails]
  }
}

