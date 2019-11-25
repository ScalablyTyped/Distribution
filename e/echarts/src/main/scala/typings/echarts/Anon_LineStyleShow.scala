package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyleShow extends js.Object {
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

object Anon_LineStyleShow {
  @scala.inline
  def apply(lineStyle: Anon_ColorOpacityShadowBlur = null, show: js.UndefOr[Boolean] = js.undefined): Anon_LineStyleShow = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineStyleShow]
  }
}

