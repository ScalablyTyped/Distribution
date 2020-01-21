package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleShow extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide line in emphasis
    * status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonLineStyleShow {
  @scala.inline
  def apply(lineStyle: AnonColorOpacityShadowBlur = null, show: js.UndefOr[Boolean] = js.undefined): AnonLineStyleShow = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleShow]
  }
}

