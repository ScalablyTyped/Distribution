package typings.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compression extends js.Object {
  var Compression: js.UndefOr[Double] = js.undefined
  var Orientation: js.UndefOr[Double] = js.undefined
  var ResolutionUnit: js.UndefOr[Double] = js.undefined
  var ThumbnailLength: js.UndefOr[Double] = js.undefined
  var ThumbnailOffset: js.UndefOr[Double] = js.undefined
  var XResolution: js.UndefOr[Double] = js.undefined
  var YCbCrPositioning: js.UndefOr[Double] = js.undefined
  var YResolution: js.UndefOr[Double] = js.undefined
}

object Compression {
  @scala.inline
  def apply(
    Compression: js.UndefOr[Double] = js.undefined,
    Orientation: js.UndefOr[Double] = js.undefined,
    ResolutionUnit: js.UndefOr[Double] = js.undefined,
    ThumbnailLength: js.UndefOr[Double] = js.undefined,
    ThumbnailOffset: js.UndefOr[Double] = js.undefined,
    XResolution: js.UndefOr[Double] = js.undefined,
    YCbCrPositioning: js.UndefOr[Double] = js.undefined,
    YResolution: js.UndefOr[Double] = js.undefined
  ): Compression = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Compression)) __obj.updateDynamic("Compression")(Compression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Orientation)) __obj.updateDynamic("Orientation")(Orientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ResolutionUnit)) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThumbnailLength)) __obj.updateDynamic("ThumbnailLength")(ThumbnailLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThumbnailOffset)) __obj.updateDynamic("ThumbnailOffset")(ThumbnailOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(XResolution)) __obj.updateDynamic("XResolution")(XResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(YCbCrPositioning)) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(YResolution)) __obj.updateDynamic("YResolution")(YResolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
}

