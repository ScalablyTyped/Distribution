package typings.fabric.fabricImplMod

import typings.fabric.AnonFromObject
import typings.fabric.AnonFromObjectObject
import typings.fabric.AnonFromObjectObjectOptions
import typings.fabric.AnonFromObjectObjectOptionsAnonBlocksize
import typings.fabric.AnonFromObjectObjectOptionsAnonChannel
import typings.fabric.AnonFromObjectObjectOptionsAnonColorOpacity
import typings.fabric.AnonFromObjectObjectOptionsAnonColorString
import typings.fabric.AnonFromObjectObjectOptionsAnonContrast
import typings.fabric.AnonFromObjectObjectOptionsAnonDistance
import typings.fabric.AnonFromObjectObjectOptionsAnonMatrix
import typings.fabric.AnonFromObjectObjectOptionsAnonMatrixOpaque
import typings.fabric.AnonFromObjectObjectOptionsAnonNoise
import typings.fabric.AnonFromObjectObjectOptionsAnonSaturation
import typings.fabric.AnonFromObjectObjectOptionsAnonThreshold
import typings.fabric.AnonFromObjectObjectOptionsAny
import typings.fabric.AnonFromObjectObjectOptionsAnyIInvertFilter
import typings.fabric.AnonFromObjectObjectOptionsAnyIResizeFilter
import typings.fabric.AnonFromObjectObjectOptionsAnyISepia2Filter
import typings.fabric.AnonFromObjectObjectOptionsAnyISepiaFilter
import typings.fabric.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: AnonOptions
  var BlendColor: AnonFromObject
  var BlendImage: AnonFromObjectObject
  var Brightness: AnonFromObjectObjectOptions
  var ColorMatrix: AnonFromObjectObjectOptionsAnonMatrix
  var Contrast: AnonFromObjectObjectOptionsAnonContrast
  var Convolute: AnonFromObjectObjectOptionsAnonMatrixOpaque
  var GradientTransparency: AnonFromObjectObjectOptionsAnonThreshold
  var Grayscale: AnonFromObjectObjectOptionsAny
  var Invert: AnonFromObjectObjectOptionsAnyIInvertFilter
  var Mask: AnonFromObjectObjectOptionsAnonChannel
  var Multiply: AnonFromObjectObjectOptionsAnonColorString
  var Noise: AnonFromObjectObjectOptionsAnonNoise
  var Pixelate: AnonFromObjectObjectOptionsAnonBlocksize
  var RemoveWhite: AnonFromObjectObjectOptionsAnonDistance
  var Resize: AnonFromObjectObjectOptionsAnyIResizeFilter
  var Saturation: AnonFromObjectObjectOptionsAnonSaturation
  var Sepia: AnonFromObjectObjectOptionsAnyISepiaFilter
  var Sepia2: AnonFromObjectObjectOptionsAnyISepia2Filter
  var Tint: AnonFromObjectObjectOptionsAnonColorOpacity
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: AnonOptions,
    BlendColor: AnonFromObject,
    BlendImage: AnonFromObjectObject,
    Brightness: AnonFromObjectObjectOptions,
    ColorMatrix: AnonFromObjectObjectOptionsAnonMatrix,
    Contrast: AnonFromObjectObjectOptionsAnonContrast,
    Convolute: AnonFromObjectObjectOptionsAnonMatrixOpaque,
    GradientTransparency: AnonFromObjectObjectOptionsAnonThreshold,
    Grayscale: AnonFromObjectObjectOptionsAny,
    Invert: AnonFromObjectObjectOptionsAnyIInvertFilter,
    Mask: AnonFromObjectObjectOptionsAnonChannel,
    Multiply: AnonFromObjectObjectOptionsAnonColorString,
    Noise: AnonFromObjectObjectOptionsAnonNoise,
    Pixelate: AnonFromObjectObjectOptionsAnonBlocksize,
    RemoveWhite: AnonFromObjectObjectOptionsAnonDistance,
    Resize: AnonFromObjectObjectOptionsAnyIResizeFilter,
    Saturation: AnonFromObjectObjectOptionsAnonSaturation,
    Sepia: AnonFromObjectObjectOptionsAnyISepiaFilter,
    Sepia2: AnonFromObjectObjectOptionsAnyISepia2Filter,
    Tint: AnonFromObjectObjectOptionsAnonColorOpacity
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAllFilters]
  }
}

