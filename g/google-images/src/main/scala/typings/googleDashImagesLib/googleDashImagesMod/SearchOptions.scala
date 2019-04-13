package typings
package googleDashImagesLib.googleDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var colorType: js.UndefOr[SearchColorType] = js.undefined
  var dominantColor: js.UndefOr[SearchDominantColor] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var safe: js.UndefOr[SearchSafe] = js.undefined
  var size: js.UndefOr[SearchImageSize] = js.undefined
  var `type`: js.UndefOr[SearchImageType] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    colorType: SearchColorType = null,
    dominantColor: SearchDominantColor = null,
    page: scala.Int | scala.Double = null,
    safe: SearchSafe = null,
    size: SearchImageSize = null,
    `type`: SearchImageType = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (colorType != null) __obj.updateDynamic("colorType")(colorType)
    if (dominantColor != null) __obj.updateDynamic("dominantColor")(dominantColor)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchOptions]
  }
}

