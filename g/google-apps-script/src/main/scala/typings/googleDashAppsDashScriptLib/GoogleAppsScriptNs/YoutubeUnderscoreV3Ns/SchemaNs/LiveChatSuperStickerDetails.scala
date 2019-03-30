package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatSuperStickerDetails extends js.Object {
  var amountDisplayString: js.UndefOr[java.lang.String] = js.undefined
  var amountMicros: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.undefined
  var tier: js.UndefOr[scala.Double] = js.undefined
}

object LiveChatSuperStickerDetails {
  @scala.inline
  def apply(
    amountDisplayString: java.lang.String = null,
    amountMicros: java.lang.String = null,
    currency: java.lang.String = null,
    superStickerMetadata: SuperStickerMetadata = null,
    tier: scala.Int | scala.Double = null
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

