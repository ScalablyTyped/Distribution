package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Anon_ColorOpacity] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
}

object Anon_AreaStyle {
  @scala.inline
  def apply(
    areaStyle: Anon_ColorOpacity = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColor = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null
  ): Anon_AreaStyle = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AreaStyle]
  }
}

