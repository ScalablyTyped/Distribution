package typings.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copyright extends js.Object {
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

object Copyright {
  @scala.inline
  def apply(
    Copyright: String = null,
    ExifOffset: js.UndefOr[Double] = js.undefined,
    ImageHeight: js.UndefOr[Double] = js.undefined,
    ImageWidth: js.UndefOr[Double] = js.undefined,
    Make: String = null,
    Model: String = null,
    ModifyDate: String = null,
    Orientation: js.UndefOr[Double] = js.undefined,
    ResolutionUnit: js.UndefOr[Double] = js.undefined,
    Software: String = null,
    XResolution: js.UndefOr[Double] = js.undefined,
    YCbCrPositioning: js.UndefOr[Double] = js.undefined,
    YResolution: js.UndefOr[Double] = js.undefined
  ): Copyright = {
    val __obj = js.Dynamic.literal()
    if (Copyright != null) __obj.updateDynamic("Copyright")(Copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(ExifOffset)) __obj.updateDynamic("ExifOffset")(ExifOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageHeight)) __obj.updateDynamic("ImageHeight")(ImageHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageWidth)) __obj.updateDynamic("ImageWidth")(ImageWidth.get.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (ModifyDate != null) __obj.updateDynamic("ModifyDate")(ModifyDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Orientation)) __obj.updateDynamic("Orientation")(Orientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ResolutionUnit)) __obj.updateDynamic("ResolutionUnit")(ResolutionUnit.get.asInstanceOf[js.Any])
    if (Software != null) __obj.updateDynamic("Software")(Software.asInstanceOf[js.Any])
    if (!js.isUndefined(XResolution)) __obj.updateDynamic("XResolution")(XResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(YCbCrPositioning)) __obj.updateDynamic("YCbCrPositioning")(YCbCrPositioning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(YResolution)) __obj.updateDynamic("YResolution")(YResolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copyright]
  }
}

