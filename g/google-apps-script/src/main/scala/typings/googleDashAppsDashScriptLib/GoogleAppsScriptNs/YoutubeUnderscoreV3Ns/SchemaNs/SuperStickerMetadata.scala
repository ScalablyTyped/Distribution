package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperStickerMetadata extends js.Object {
  var altText: js.UndefOr[java.lang.String] = js.undefined
  var altTextLanguage: js.UndefOr[java.lang.String] = js.undefined
  var stickerId: js.UndefOr[java.lang.String] = js.undefined
}

object SuperStickerMetadata {
  @scala.inline
  def apply(
    altText: java.lang.String = null,
    altTextLanguage: java.lang.String = null,
    stickerId: java.lang.String = null
  ): SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (altTextLanguage != null) __obj.updateDynamic("altTextLanguage")(altTextLanguage)
    if (stickerId != null) __obj.updateDynamic("stickerId")(stickerId)
    __obj.asInstanceOf[SuperStickerMetadata]
  }
}

