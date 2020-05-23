package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Show extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide line in emphasis
    * status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Show {
  @scala.inline
  def apply(lineStyle: ShadowBlur = null, show: js.UndefOr[Boolean] = js.undefined): Show = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
}

