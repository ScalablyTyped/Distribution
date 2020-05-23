package typings.fabric.fabricImplMod

import typings.fabric.anon.FromObject
import typings.fabric.anon.Instantiable
import typings.fabric.anon.InstantiableFromObject
import typings.fabric.anon.InstantiableIBrightnessFilter
import typings.fabric.anon.InstantiableIColorMatrix
import typings.fabric.anon.InstantiableIContrastFilter
import typings.fabric.anon.InstantiableIConvoluteFilter
import typings.fabric.anon.InstantiableIGradientTransparencyFilter
import typings.fabric.anon.InstantiableIGrayscaleFilter
import typings.fabric.anon.InstantiableIInvertFilter
import typings.fabric.anon.InstantiableIMaskFilter
import typings.fabric.anon.InstantiableIMultiplyFilter
import typings.fabric.anon.InstantiableINoiseFilter
import typings.fabric.anon.InstantiableIPixelateFilter
import typings.fabric.anon.InstantiableIRemoveWhiteFilter
import typings.fabric.anon.InstantiableIResizeFilter
import typings.fabric.anon.InstantiableISaturationFilter
import typings.fabric.anon.InstantiableISepia2Filter
import typings.fabric.anon.InstantiableISepiaFilter
import typings.fabric.anon.InstantiableITintFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: Instantiable
  var BlendColor: FromObject
  var BlendImage: InstantiableFromObject
  var Brightness: InstantiableIBrightnessFilter
  var ColorMatrix: InstantiableIColorMatrix
  var Contrast: InstantiableIContrastFilter
  var Convolute: InstantiableIConvoluteFilter
  var GradientTransparency: InstantiableIGradientTransparencyFilter
  var Grayscale: InstantiableIGrayscaleFilter
  var Invert: InstantiableIInvertFilter
  var Mask: InstantiableIMaskFilter
  var Multiply: InstantiableIMultiplyFilter
  var Noise: InstantiableINoiseFilter
  var Pixelate: InstantiableIPixelateFilter
  var RemoveWhite: InstantiableIRemoveWhiteFilter
  var Resize: InstantiableIResizeFilter
  var Saturation: InstantiableISaturationFilter
  var Sepia: InstantiableISepiaFilter
  var Sepia2: InstantiableISepia2Filter
  var Tint: InstantiableITintFilter
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: Instantiable,
    BlendColor: FromObject,
    BlendImage: InstantiableFromObject,
    Brightness: InstantiableIBrightnessFilter,
    ColorMatrix: InstantiableIColorMatrix,
    Contrast: InstantiableIContrastFilter,
    Convolute: InstantiableIConvoluteFilter,
    GradientTransparency: InstantiableIGradientTransparencyFilter,
    Grayscale: InstantiableIGrayscaleFilter,
    Invert: InstantiableIInvertFilter,
    Mask: InstantiableIMaskFilter,
    Multiply: InstantiableIMultiplyFilter,
    Noise: InstantiableINoiseFilter,
    Pixelate: InstantiableIPixelateFilter,
    RemoveWhite: InstantiableIRemoveWhiteFilter,
    Resize: InstantiableIResizeFilter,
    Saturation: InstantiableISaturationFilter,
    Sepia: InstantiableISepiaFilter,
    Sepia2: InstantiableISepia2Filter,
    Tint: InstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllFilters]
  }
}

