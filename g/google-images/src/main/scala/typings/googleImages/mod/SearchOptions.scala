package typings.googleImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var colorType: js.UndefOr[SearchColorType] = js.undefined
  var dominantColor: js.UndefOr[SearchDominantColor] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var safe: js.UndefOr[SearchSafe] = js.undefined
  var size: js.UndefOr[SearchImageSize] = js.undefined
  var `type`: js.UndefOr[SearchImageType] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    colorType: SearchColorType = null,
    dominantColor: SearchDominantColor = null,
    page: js.UndefOr[Double] = js.undefined,
    safe: SearchSafe = null,
    size: SearchImageSize = null,
    `type`: SearchImageType = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (dominantColor != null) __obj.updateDynamic("dominantColor")(dominantColor.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

