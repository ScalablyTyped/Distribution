package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SuperChatEventSnippet extends js.Object {
  /**
    * The purchase amount, in micros of the purchase currency. e.g., 1 is
    * represented as 1000000.
    */
  var amountMicros: js.UndefOr[String] = js.native
  /**
    * Channel id where the event occurred.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The text contents of the comment left by the user.
    */
  var commentText: js.UndefOr[String] = js.native
  /**
    * The date and time when the event occurred. The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var createdAt: js.UndefOr[String] = js.native
  /**
    * The currency in which the purchase was made. ISO 4217.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * A rendered string that displays the purchase amount and currency (e.g.,
    * &quot;$1.00&quot;). The string is rendered for the given language.
    */
  var displayString: js.UndefOr[String] = js.native
  /**
    * True if this event is a Super Chat for Good purchase.
    */
  var isSuperChatForGood: js.UndefOr[Boolean] = js.native
  /**
    * True if this event is a Super Sticker event.
    */
  var isSuperStickerEvent: js.UndefOr[Boolean] = js.native
  /**
    * The tier for the paid message, which is based on the amount of money
    * spent to purchase the message.
    */
  var messageType: js.UndefOr[Double] = js.native
  /**
    * If this event is a Super Chat for Good purchase, this field will contain
    * information about the charity the purchase is donated to.
    */
  var nonprofit: js.UndefOr[Schema$Nonprofit] = js.native
  /**
    * If this event is a Super Sticker event, this field will contain metadata
    * about the Super Sticker.
    */
  var superStickerMetadata: js.UndefOr[Schema$SuperStickerMetadata] = js.native
  /**
    * Details about the supporter.
    */
  var supporterDetails: js.UndefOr[Schema$ChannelProfileDetails] = js.native
}

object Schema$SuperChatEventSnippet {
  @scala.inline
  def apply(
    amountMicros: String = null,
    channelId: String = null,
    commentText: String = null,
    createdAt: String = null,
    currency: String = null,
    displayString: String = null,
    isSuperChatForGood: js.UndefOr[Boolean] = js.undefined,
    isSuperStickerEvent: js.UndefOr[Boolean] = js.undefined,
    messageType: Int | Double = null,
    nonprofit: Schema$Nonprofit = null,
    superStickerMetadata: Schema$SuperStickerMetadata = null,
    supporterDetails: Schema$ChannelProfileDetails = null
  ): Schema$SuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (commentText != null) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (displayString != null) __obj.updateDynamic("displayString")(displayString.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuperChatForGood)) __obj.updateDynamic("isSuperChatForGood")(isSuperChatForGood.asInstanceOf[js.Any])
    if (!js.isUndefined(isSuperStickerEvent)) __obj.updateDynamic("isSuperStickerEvent")(isSuperStickerEvent.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (nonprofit != null) __obj.updateDynamic("nonprofit")(nonprofit.asInstanceOf[js.Any])
    if (superStickerMetadata != null) __obj.updateDynamic("superStickerMetadata")(superStickerMetadata.asInstanceOf[js.Any])
    if (supporterDetails != null) __obj.updateDynamic("supporterDetails")(supporterDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuperChatEventSnippet]
  }
}

