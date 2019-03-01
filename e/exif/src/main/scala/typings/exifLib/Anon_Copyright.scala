package typings
package exifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copyright extends js.Object {
  var Copyright: js.UndefOr[java.lang.String] = js.undefined
  var ExifOffset: js.UndefOr[scala.Double] = js.undefined
  var ImageHeight: js.UndefOr[scala.Double] = js.undefined
  var ImageWidth: js.UndefOr[scala.Double] = js.undefined
  var Make: js.UndefOr[java.lang.String] = js.undefined
  var Model: js.UndefOr[java.lang.String] = js.undefined
  var ModifyDate: js.UndefOr[java.lang.String] = js.undefined
  var Orientation: js.UndefOr[scala.Double] = js.undefined
  var ResolutionUnit: js.UndefOr[scala.Double] = js.undefined
  var Software: js.UndefOr[java.lang.String] = js.undefined
  var XResolution: js.UndefOr[scala.Double] = js.undefined
  var YCbCrPositioning: js.UndefOr[scala.Double] = js.undefined
  var YResolution: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Copyright {
  @scala.inline
  def apply(
    Copyright: java.lang.String = null,
    ExifOffset: scala.Int | scala.Double = null,
    ImageHeight: scala.Int | scala.Double = null,
    ImageWidth: scala.Int | scala.Double = null,
    Make: java.lang.String = null,
    Model: java.lang.String = null,
    ModifyDate: java.lang.String = null,
    Orientation: scala.Int | scala.Double = null,
    ResolutionUnit: scala.Int | scala.Double = null,
    Software: java.lang.String = null,
    XResolution: scala.Int | scala.Double = null,
    YCbCrPositioning: scala.Int | scala.Double = null,
    YResolution: scala.Int | scala.Double = null
  ): Anon_Copyright = {
    val __obj = js.Dynamic.literal()
    if (Copyright != null) __obj.updateDynamic("Copyright")(Copyright)
    if (ExifOffset != null) __obj.updateDynamic("ExifOffset")(ExifOffset.asInstanceOf[js.Any])
    if (ImageHeight != null) __obj.updateDynamic("ImageHeight")(ImageHeight.asInstanceOf[js.Any])
    if (ImageWidth != null) __obj.updateDynamic("ImageWidth")(ImageWidth.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make)
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (ModifyDate != null) __obj.updateDynamic("ModifyDate")(ModifyDate)
    if (Orientation != null) __obj.updateDynamic("Orientation")(Orientation.asInstanceOf[js.Any])
    if (ResolutionUnit != null) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.asInstanceOf[js.Any])
    if (Software != null) __obj.updateDynamic("Software")(Software)
    if (XResolution != null) __obj.updateDynamic("XResolution")(XResolution.asInstanceOf[js.Any])
    if (YCbCrPositioning != null) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.asInstanceOf[js.Any])
    if (YResolution != null) __obj.updateDynamic("YResolution")(YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Copyright]
  }
}

