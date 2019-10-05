package typings.echarts.echarts.VisualMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeObject extends js.Object {
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
  var colorAlpha: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var colorHue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var colorLightness: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var colorSaturation: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var symbol: js.UndefOr[String | js.Array[String]] = js.undefined
  var symbolSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object RangeObject {
  @scala.inline
  def apply(
    color: String | js.Array[String] = null,
    colorAlpha: Double | js.Array[Double] = null,
    colorHue: Double | js.Array[Double] = null,
    colorLightness: Double | js.Array[Double] = null,
    colorSaturation: Double | js.Array[Double] = null,
    opacity: Double | js.Array[Double] = null,
    symbol: String | js.Array[String] = null,
    symbolSize: Double | js.Array[Double] = null
  ): RangeObject = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorAlpha != null) __obj.updateDynamic("colorAlpha")(colorAlpha.asInstanceOf[js.Any])
    if (colorHue != null) __obj.updateDynamic("colorHue")(colorHue.asInstanceOf[js.Any])
    if (colorLightness != null) __obj.updateDynamic("colorLightness")(colorLightness.asInstanceOf[js.Any])
    if (colorSaturation != null) __obj.updateDynamic("colorSaturation")(colorSaturation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeObject]
  }
}

