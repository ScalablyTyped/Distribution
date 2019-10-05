package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEventSnippet extends js.Object {
  var amountMicros: js.UndefOr[String] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var commentText: js.UndefOr[String] = js.undefined
  var createdAt: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var displayString: js.UndefOr[String] = js.undefined
  var isSuperChatForGood: js.UndefOr[Boolean] = js.undefined
  var isSuperStickerEvent: js.UndefOr[Boolean] = js.undefined
  var messageType: js.UndefOr[Double] = js.undefined
  var nonprofit: js.UndefOr[Nonprofit] = js.undefined
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}

object SuperChatEventSnippet {
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
    nonprofit: Nonprofit = null,
    superStickerMetadata: SuperStickerMetadata = null,
    supporterDetails: ChannelProfileDetails = null
  ): SuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (commentText != null) __obj.updateDynamic("commentText")(commentText)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (displayString != null) __obj.updateDynamic("displayString")(displayString)
    if (!js.isUndefined(isSuperChatForGood)) __obj.updateDynamic("isSuperChatForGood")(isSuperChatForGood)
    if (!js.isUndefined(isSuperStickerEvent)) __obj.updateDynamic("isSuperStickerEvent")(isSuperStickerEvent)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (nonprofit != null) __obj.updateDynamic("nonprofit")(nonprofit)
    if (superStickerMetadata != null) __obj.updateDynamic("superStickerMetadata")(superStickerMetadata)
    if (supporterDetails != null) __obj.updateDynamic("supporterDetails")(supporterDetails)
    __obj.asInstanceOf[SuperChatEventSnippet]
  }
}

