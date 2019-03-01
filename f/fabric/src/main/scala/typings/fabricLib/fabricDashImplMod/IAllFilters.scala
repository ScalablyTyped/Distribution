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
    Sepia: fabricLib.Anon_FromObjectObjectOptionsAnyISepiaFilter,
    Sepia2: fabricLib.Anon_FromObjectObjectOptionsAnyISepia2Filter,
    Tint: fabricLib.Anon_FromObjectObjectOptionsAnonColorOpacity
  ): IAllFilters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BaseFilter")(BaseFilter)
    __obj.updateDynamic("BlendColor")(BlendColor)
    __obj.updateDynamic("BlendImage")(BlendImage)
    __obj.updateDynamic("Brightness")(Brightness)
    __obj.updateDynamic("ColorMatrix")(ColorMatrix)
    __obj.updateDynamic("Convolute")(Convolute)
    __obj.updateDynamic("GradientTransparency")(GradientTransparency)
    __obj.updateDynamic("Grayscale")(Grayscale)
    __obj.updateDynamic("Invert")(Invert)
    __obj.updateDynamic("Mask")(Mask)
    __obj.updateDynamic("Multiply")(Multiply)
    __obj.updateDynamic("Noise")(Noise)
    __obj.updateDynamic("Pixelate")(Pixelate)
    __obj.updateDynamic("RemoveWhite")(RemoveWhite)
    __obj.updateDynamic("Resize")(Resize)
    __obj.updateDynamic("Sepia")(Sepia)
    __obj.updateDynamic("Sepia2")(Sepia2)
    __obj.updateDynamic("Tint")(Tint)
    __obj.asInstanceOf[IAllFilters]
  }
}

