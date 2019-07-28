package typings.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copyright extends js.Object {
  var Copyright: js.UndefOr[String] = js.undefined
  var ExifOffset: js.UndefOr[Double] = js.undefined
  var ImageHeight: js.UndefOr[Double] = js.undefined
  var ImageWidth: js.UndefOr[Double] = js.undefined
  var Make: js.UndefOr[String] = js.undefined
  var Model: js.UndefOr[String] = js.undefined
  var ModifyDate: js.UndefOr[String] = js.undefined
  var Orientation: js.UndefOr[Double] = js.undefined
  var ResolutionUnit: js.UndefOr[Double] = js.undefined
  var Software: js.UndefOr[String] = js.undefined
  var XResolution: js.UndefOr[Double] = js.undefined
  var YCbCrPositioning: js.UndefOr[Double] = js.undefined
  var YResolution: js.UndefOr[Double] = js.undefined
}

object Anon_Copyright {
  @scala.inline
  def apply(
    Copyright: String = null,
    ExifOffset: Int | Double = null,
    ImageHeight: Int | Double = null,
    ImageWidth: Int | Double = null,
    Make: String = null,
    Model: String = null,
    ModifyDate: String = null,
    Orientation: Int | Double = null,
    ResolutionUnit: Int | Double = null,
    Software: String = null,
    XResolution: Int | Double = null,
    YCbCrPositioning: Int | Double = null,
    YResolution: Int | Double = null
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

