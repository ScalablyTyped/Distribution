package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatMessageRetractedDetails extends js.Object {
  var retractedMessageId: js.UndefOr[String] = js.native
}

object Schema$LiveChatMessageRetractedDetails {
  @scala.inline
  def apply(retractedMessageId: String = null): Schema$LiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    if (retractedMessageId != null) __obj.updateDynamic("retractedMessageId")(retractedMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatMessageRetractedDetails]
  }
}

