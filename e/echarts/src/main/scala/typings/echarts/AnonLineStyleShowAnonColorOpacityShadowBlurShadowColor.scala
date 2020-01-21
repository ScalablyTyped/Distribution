package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor extends js.Object {
  /**
    * The style of the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlurShadowColor] = js.undefined
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

object AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor {
  @scala.inline
  def apply(lineStyle: AnonColorOpacityShadowBlurShadowColor = null, show: js.UndefOr[Boolean] = js.undefined): AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor]
  }
}

