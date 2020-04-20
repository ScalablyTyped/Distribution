package typings.fabric.fabricImplMod

import typings.fabric.AnonFromObject
import typings.fabric.AnonInstantiable
import typings.fabric.AnonInstantiableFromObject
import typings.fabric.AnonInstantiableIBrightnessFilter
import typings.fabric.AnonInstantiableIColorMatrix
import typings.fabric.AnonInstantiableIContrastFilter
import typings.fabric.AnonInstantiableIConvoluteFilter
import typings.fabric.AnonInstantiableIGradientTransparencyFilter
import typings.fabric.AnonInstantiableIGrayscaleFilter
import typings.fabric.AnonInstantiableIInvertFilter
import typings.fabric.AnonInstantiableIMaskFilter
import typings.fabric.AnonInstantiableIMultiplyFilter
import typings.fabric.AnonInstantiableINoiseFilter
import typings.fabric.AnonInstantiableIPixelateFilter
import typings.fabric.AnonInstantiableIRemoveWhiteFilter
import typings.fabric.AnonInstantiableIResizeFilter
import typings.fabric.AnonInstantiableISaturationFilter
import typings.fabric.AnonInstantiableISepia2Filter
import typings.fabric.AnonInstantiableISepiaFilter
import typings.fabric.AnonInstantiableITintFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: AnonInstantiable
  var BlendColor: AnonFromObject
  var BlendImage: AnonInstantiableFromObject
  var Brightness: AnonInstantiableIBrightnessFilter
  var ColorMatrix: AnonInstantiableIColorMatrix
  var Contrast: AnonInstantiableIContrastFilter
  var Convolute: AnonInstantiableIConvoluteFilter
  var GradientTransparency: AnonInstantiableIGradientTransparencyFilter
  var Grayscale: AnonInstantiableIGrayscaleFilter
  var Invert: AnonInstantiableIInvertFilter
  var Mask: AnonInstantiableIMaskFilter
  var Multiply: AnonInstantiableIMultiplyFilter
  var Noise: AnonInstantiableINoiseFilter
  var Pixelate: AnonInstantiableIPixelateFilter
  var RemoveWhite: AnonInstantiableIRemoveWhiteFilter
  var Resize: AnonInstantiableIResizeFilter
  var Saturation: AnonInstantiableISaturationFilter
  var Sepia: AnonInstantiableISepiaFilter
  var Sepia2: AnonInstantiableISepia2Filter
  var Tint: AnonInstantiableITintFilter
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: AnonInstantiable,
    BlendColor: AnonFromObject,
    BlendImage: AnonInstantiableFromObject,
    Brightness: AnonInstantiableIBrightnessFilter,
    ColorMatrix: AnonInstantiableIColorMatrix,
    Contrast: AnonInstantiableIContrastFilter,
    Convolute: AnonInstantiableIConvoluteFilter,
    GradientTransparency: AnonInstantiableIGradientTransparencyFilter,
    Grayscale: AnonInstantiableIGrayscaleFilter,
    Invert: AnonInstantiableIInvertFilter,
    Mask: AnonInstantiableIMaskFilter,
    Multiply: AnonInstantiableIMultiplyFilter,
    Noise: AnonInstantiableINoiseFilter,
    Pixelate: AnonInstantiableIPixelateFilter,
    RemoveWhite: AnonInstantiableIRemoveWhiteFilter,
    Resize: AnonInstantiableIResizeFilter,
    Saturation: AnonInstantiableISaturationFilter,
    Sepia: AnonInstantiableISepiaFilter,
    Sepia2: AnonInstantiableISepia2Filter,
    Tint: AnonInstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllFilters]
  }
}

