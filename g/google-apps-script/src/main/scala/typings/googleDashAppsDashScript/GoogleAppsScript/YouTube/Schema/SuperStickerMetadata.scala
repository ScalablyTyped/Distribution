package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperStickerMetadata extends js.Object {
  var altText: js.UndefOr[String] = js.undefined
  var altTextLanguage: js.UndefOr[String] = js.undefined
  var stickerId: js.UndefOr[String] = js.undefined
}

object SuperStickerMetadata {
  @scala.inline
  def apply(altText: String = null, altTextLanguage: String = null, stickerId: String = null): SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (altTextLanguage != null) __obj.updateDynamic("altTextLanguage")(altTextLanguage)
    if (stickerId != null) __obj.updateDynamic("stickerId")(stickerId)
    __obj.asInstanceOf[SuperStickerMetadata]
  }
}

