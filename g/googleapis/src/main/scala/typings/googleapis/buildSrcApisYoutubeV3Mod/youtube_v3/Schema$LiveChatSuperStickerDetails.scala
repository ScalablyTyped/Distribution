package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveChatSuperStickerDetails extends js.Object {
  /**
    * A rendered string that displays the fund amount and currency to the user.
    */
  var amountDisplayString: js.UndefOr[String] = js.native
  /**
    * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
    */
  var amountMicros: js.UndefOr[String] = js.native
  /**
    * The currency in which the purchase was made.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Information about the Super Sticker.
    */
  var superStickerMetadata: js.UndefOr[Schema$SuperStickerMetadata] = js.native
  /**
    * The tier in which the amount belongs. Lower amounts belong to lower
    * tiers. The lowest tier is 1.
    */
  var tier: js.UndefOr[Double] = js.native
}

object Schema$LiveChatSuperStickerDetails {
  @scala.inline
  def apply(
    amountDisplayString: String = null,
    amountMicros: String = null,
    currency: String = null,
    superStickerMetadata: Schema$SuperStickerMetadata = null,
    tier: Int | Double = null
  ): Schema$LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    if (amountDisplayString != null) __obj.updateDynamic("amountDisplayString")(amountDisplayString.asInstanceOf[js.Any])
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (superStickerMetadata != null) __obj.updateDynamic("superStickerMetadata")(superStickerMetadata.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatSuperStickerDetails]
  }
}

