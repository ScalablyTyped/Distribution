package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SuperStickerMetadata extends js.Object {
  /**
    * Internationalized alt text that describes the sticker image and any
    * animation associated with it.
    */
  var altText: js.UndefOr[String] = js.native
  /**
    * Specifies the localization language in which the alt text is returned.
    */
  var altTextLanguage: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the Super Sticker. This is a shorter form of the
    * alt_text that includes pack name and a recognizable characteristic of the
    * sticker.
    */
  var stickerId: js.UndefOr[String] = js.native
}

object Schema$SuperStickerMetadata {
  @scala.inline
  def apply(altText: String = null, altTextLanguage: String = null, stickerId: String = null): Schema$SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText.asInstanceOf[js.Any])
    if (altTextLanguage != null) __obj.updateDynamic("altTextLanguage")(altTextLanguage.asInstanceOf[js.Any])
    if (stickerId != null) __obj.updateDynamic("stickerId")(stickerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuperStickerMetadata]
  }
}

