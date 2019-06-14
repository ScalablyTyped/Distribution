package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: fabricLib.Anon_Options
  var BlendColor: fabricLib.Anon_FromObject
  var BlendImage: fabricLib.Anon_FromObjectObject
  var Brightness: fabricLib.Anon_FromObjectObjectOptions
  var ColorMatrix: fabricLib.Anon_FromObjectObjectOptionsAnonMatrix
  var Contrast: fabricLib.Anon_FromObjectObjectOptionsAnonContrast
  var Convolute: fabricLib.Anon_FromObjectObjectOptionsAnonMatrixOpaque
  var GradientTransparency: fabricLib.Anon_FromObjectObjectOptionsAnonThreshold
  var Grayscale: fabricLib.Anon_FromObjectObjectOptionsAny
  var Invert: fabricLib.Anon_FromObjectObjectOptionsAnyIInvertFilter
  var Mask: fabricLib.Anon_FromObjectObjectOptionsAnonChannel
  var Multiply: fabricLib.Anon_FromObjectObjectOptionsAnonColor
  var Noise: fabricLib.Anon_FromObjectObjectOptionsAnonNoise
  var Pixelate: fabricLib.Anon_FromObjectObjectOptionsAnonBlocksize
  var RemoveWhite: fabricLib.Anon_FromObjectObjectOptionsAnonDistance
  var Resize: fabricLib.Anon_FromObjectObjectOptionsAnyIResizeFilter
  var Saturation: fabricLib.Anon_FromObjectObjectOptionsAnonSaturation
  var Sepia: fabricLib.Anon_FromObjectObjectOptionsAnyISepiaFilter
  var Sepia2: fabricLib.Anon_FromObjectObjectOptionsAnyISepia2Filter
  var Tint: fabricLib.Anon_FromObjectObjectOptionsAnonColorOpacity
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: fabricLib.Anon_Options,
    BlendColor: fabricLib.Anon_FromObject,
    BlendImage: fabricLib.Anon_FromObjectObject,
    Brightness: fabricLib.Anon_FromObjectObjectOptions,
    ColorMatrix: fabricLib.Anon_FromObjectObjectOptionsAnonMatrix,
    Contrast: fabricLib.Anon_FromObjectObjectOptionsAnonContrast,
    Convolute: fabricLib.Anon_FromObjectObjectOptionsAnonMatrixOpaque,
    GradientTransparency: fabricLib.Anon_FromObjectObjectOptionsAnonThreshold,
    Grayscale: fabricLib.Anon_FromObjectObjectOptionsAny,
    Invert: fabricLib.Anon_FromObjectObjectOptionsAnyIInvertFilter,
    Mask: fabricLib.Anon_FromObjectObjectOptionsAnonChannel,
    Multiply: fabricLib.Anon_FromObjectObjectOptionsAnonColor,
    Noise: fabricLib.Anon_FromObjectObjectOptionsAnonNoise,
    Pixelate: fabricLib.Anon_FromObjectObjectOptionsAnonBlocksize,
    RemoveWhite: fabricLib.Anon_FromObjectObjectOptionsAnonDistance,
    Resize: fabricLib.Anon_FromObjectObjectOptionsAnyIResizeFilter,
    Saturation: fabricLib.Anon_FromObjectObjectOptionsAnonSaturation,
    Sepia: fabricLib.Anon_FromObjectObjectOptionsAnyISepiaFilter,
    Sepia2: fabricLib.Anon_FromObjectObjectOptionsAnyISepia2Filter,
    Tint: fabricLib.Anon_FromObjectObjectOptionsAnonColorOpacity
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter, BlendColor = BlendColor, BlendImage = BlendImage, Brightness = Brightness, ColorMatrix = ColorMatrix, Contrast = Contrast, Convolute = Convolute, GradientTransparency = GradientTransparency, Grayscale = Grayscale, Invert = Invert, Mask = Mask, Multiply = Multiply, Noise = Noise, Pixelate = Pixelate, RemoveWhite = RemoveWhite, Resize = Resize, Saturation = Saturation, Sepia = Sepia, Sepia2 = Sepia2, Tint = Tint)
  
    __obj.asInstanceOf[IAllFilters]
  }
}

