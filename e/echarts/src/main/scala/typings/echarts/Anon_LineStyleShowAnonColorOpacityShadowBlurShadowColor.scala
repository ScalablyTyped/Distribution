package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyleShowAnonColorOpacityShadowBlurShadowColor extends js.Object {
  /**
    * The style of the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlurShadowColor] = js.undefined
  /**
    * Whether to show the axis line of gauge chart.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_LineStyleShowAnonColorOpacityShadowBlurShadowColor {
  @scala.inline
  def apply(lineStyle: Anon_ColorOpacityShadowBlurShadowColor = null, show: js.UndefOr[Boolean] = js.undefined): Anon_LineStyleShowAnonColorOpacityShadowBlurShadowColor = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineStyleShowAnonColorOpacityShadowBlurShadowColor]
  }
}

