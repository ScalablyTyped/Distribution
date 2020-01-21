package typings.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompression extends js.Object {
  var Compression: js.UndefOr[Double] = js.undefined
  var Orientation: js.UndefOr[Double] = js.undefined
  var ResolutionUnit: js.UndefOr[Double] = js.undefined
  var ThumbnailLength: js.UndefOr[Double] = js.undefined
  var ThumbnailOffset: js.UndefOr[Double] = js.undefined
  var XResolution: js.UndefOr[Double] = js.undefined
  var YCbCrPositioning: js.UndefOr[Double] = js.undefined
  var YResolution: js.UndefOr[Double] = js.undefined
}

object AnonCompression {
  @scala.inline
  def apply(
    Compression: Int | Double = null,
    Orientation: Int | Double = null,
    ResolutionUnit: Int | Double = null,
    ThumbnailLength: Int | Double = null,
    ThumbnailOffset: Int | Double = null,
    XResolution: Int | Double = null,
    YCbCrPositioning: Int | Double = null,
    YResolution: Int | Double = null
  ): AnonCompression = {
    val __obj = js.Dynamic.literal()
    if (Compression != null) __obj.updateDynamic("Compression")(Compression.asInstanceOf[js.Any])
    if (Orientation != null) __obj.updateDynamic("Orientation")(Orientation.asInstanceOf[js.Any])
    if (ResolutionUnit != null) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.asInstanceOf[js.Any])
    if (ThumbnailLength != null) __obj.updateDynamic("ThumbnailLength")(ThumbnailLength.asInstanceOf[js.Any])
    if (ThumbnailOffset != null) __obj.updateDynamic("ThumbnailOffset")(ThumbnailOffset.asInstanceOf[js.Any])
    if (XResolution != null) __obj.updateDynamic("XResolution")(XResolution.asInstanceOf[js.Any])
    if (YCbCrPositioning != null) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.asInstanceOf[js.Any])
    if (YResolution != null) __obj.updateDynamic("YResolution")(YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompression]
  }
}

