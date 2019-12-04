package typings.expo.buildTakeSnapshotAsyncCreatorDotWebMod

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
    height: Int | Double = null,
    missingImageSource: String = null,
    preventCaching: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    style: js.Any = null,
    width: Int | Double = null
  ): SVGOptions = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (missingImageSource != null) __obj.updateDynamic("missingImageSource")(missingImageSource.asInstanceOf[js.Any])
    if (!js.isUndefined(preventCaching)) __obj.updateDynamic("preventCaching")(preventCaching.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOptions]
  }
}

