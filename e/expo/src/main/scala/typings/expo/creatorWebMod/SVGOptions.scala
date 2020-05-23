package typings.expo.creatorWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOptions extends js.Object {
  var bgcolor: js.UndefOr[FillStyle] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var missingImageSource: js.UndefOr[String] = js.undefined
  var preventCaching: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SVGOptions {
  @scala.inline
  def apply(
    bgcolor: FillStyle = null,
    height: js.UndefOr[Double] = js.undefined,
    missingImageSource: String = null,
    preventCaching: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    style: js.Any = null,
    width: js.UndefOr[Double] = js.undefined
  ): SVGOptions = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (missingImageSource != null) __obj.updateDynamic("missingImageSource")(missingImageSource.asInstanceOf[js.Any])
    if (!js.isUndefined(preventCaching)) __obj.updateDynamic("preventCaching")(preventCaching.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOptions]
  }
}

