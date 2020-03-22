package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.emphasis
    */
  var emphasis: js.UndefOr[AnonShow] = js.undefined
  /**
    * The length of the first part from visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
  /**
    * Whether to show visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(
    emphasis: AnonShow = null,
    length: Int | Double = null,
    lineStyle: AnonShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonLength = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

