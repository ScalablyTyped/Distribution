package typings.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopyright extends js.Object {
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

object AnonCopyright {
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
  ): AnonCopyright = {
    val __obj = js.Dynamic.literal()
    if (Copyright != null) __obj.updateDynamic("Copyright")(Copyright.asInstanceOf[js.Any])
    if (ExifOffset != null) __obj.updateDynamic("ExifOffset")(ExifOffset.asInstanceOf[js.Any])
    if (ImageHeight != null) __obj.updateDynamic("ImageHeight")(ImageHeight.asInstanceOf[js.Any])
    if (ImageWidth != null) __obj.updateDynamic("ImageWidth")(ImageWidth.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (ModifyDate != null) __obj.updateDynamic("ModifyDate")(ModifyDate.asInstanceOf[js.Any])
    if (Orientation != null) __obj.updateDynamic("Orientation")(Orientation.asInstanceOf[js.Any])
    if (ResolutionUnit != null) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.asInstanceOf[js.Any])
    if (Software != null) __obj.updateDynamic("Software")(Software.asInstanceOf[js.Any])
    if (XResolution != null) __obj.updateDynamic("XResolution")(XResolution.asInstanceOf[js.Any])
    if (YCbCrPositioning != null) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.asInstanceOf[js.Any])
    if (YResolution != null) __obj.updateDynamic("YResolution")(YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCopyright]
  }
}

