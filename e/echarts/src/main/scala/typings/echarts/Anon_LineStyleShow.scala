package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyleShow extends js.Object {
  /**
    * The style of the axis line of gauge chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlurShadowColorShadowOffsetX] = js.undefined
  /**
    * Whether to show the axis line of gauge chart.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_LineStyleShow {
  @scala.inline
  def apply(
    lineStyle: Anon_ColorOpacityShadowBlurShadowColorShadowOffsetX = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_LineStyleShow = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_LineStyleShow]
  }
}

