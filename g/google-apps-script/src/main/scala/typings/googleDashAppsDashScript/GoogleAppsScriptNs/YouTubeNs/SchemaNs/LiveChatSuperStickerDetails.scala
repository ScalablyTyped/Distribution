package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperStickerDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.undefined
  var amountMicros: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
  var tier: js.UndefOr[Double] = js.undefined
}

object LiveChatSuperStickerDetails {
  @scala.inline
  def apply(
    amountDisplayString: String = null,
    amountMicros: String = null,
    currency: String = null,
    superStickerMetadata: SuperStickerMetadata = null,
    tier: Int | Double = null
  ): LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString)
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (superStickerMetadata != null) __obj.updateDynamic("superStickerMetadata")(superStickerMetadata)
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatSuperStickerDetails]
  }
}

