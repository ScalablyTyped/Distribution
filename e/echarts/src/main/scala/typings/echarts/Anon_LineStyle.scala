package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyle extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide line in emphasis
    * status.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.emphasis.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_LineStyle {
  @scala.inline
  def apply(lineStyle: Anon_ColorOpacityShadowBlur = null, show: js.UndefOr[Boolean] = js.undefined): Anon_LineStyle = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_LineStyle]
  }
}

