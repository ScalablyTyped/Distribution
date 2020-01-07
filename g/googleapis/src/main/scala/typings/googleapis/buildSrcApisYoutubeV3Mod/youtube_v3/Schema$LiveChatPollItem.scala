package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatPollItem extends js.Object {
  /**
    * Plain text description of the item.
    */
  var description: js.UndefOr[String] = js.native
  var itemId: js.UndefOr[String] = js.native
}

object Schema$LiveChatPollItem {
  @scala.inline
  def apply(description: String = null, itemId: String = null): Schema$LiveChatPollItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatPollItem]
  }
}

