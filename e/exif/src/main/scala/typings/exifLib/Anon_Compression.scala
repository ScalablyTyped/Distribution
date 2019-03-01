package typings
package exifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compression extends js.Object {
  var Compression: js.UndefOr[scala.Double] = js.undefined
  var Orientation: js.UndefOr[scala.Double] = js.undefined
  var ResolutionUnit: js.UndefOr[scala.Double] = js.undefined
  var ThumbnailLength: js.UndefOr[scala.Double] = js.undefined
  var ThumbnailOffset: js.UndefOr[scala.Double] = js.undefined
  var XResolution: js.UndefOr[scala.Double] = js.undefined
  var YCbCrPositioning: js.UndefOr[scala.Double] = js.undefined
  var YResolution: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Compression {
  @scala.inline
  def apply(
    Compression: scala.Int | scala.Double = null,
    Orientation: scala.Int | scala.Double = null,
    ResolutionUnit: scala.Int | scala.Double = null,
    ThumbnailLength: scala.Int | scala.Double = null,
    ThumbnailOffset: scala.Int | scala.Double = null,
    XResolution: scala.Int | scala.Double = null,
    YCbCrPositioning: scala.Int | scala.Double = null,
    YResolution: scala.Int | scala.Double = null
  ): Anon_Compression = {
    val __obj = js.Dynamic.literal()
    if (Compression != null) __obj.updateDynamic("Compression")(Compression.asInstanceOf[js.Any])
    if (Orientation != null) __obj.updateDynamic("Orientation")(Orientation.asInstanceOf[js.Any])
    if (ResolutionUnit != null) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.asInstanceOf[js.Any])
    if (ThumbnailLength != null) __obj.updateDynamic("ThumbnailLength")(ThumbnailLength.asInstanceOf[js.Any])
    if (ThumbnailOffset != null) __obj.updateDynamic("ThumbnailOffset")(ThumbnailOffset.asInstanceOf[js.Any])
    if (XResolution != null) __obj.updateDynamic("XResolution")(XResolution.asInstanceOf[js.Any])
    if (YCbCrPositioning != null) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.asInstanceOf[js.Any])
    if (YResolution != null) __obj.updateDynamic("YResolution")(YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compression]
  }
}

