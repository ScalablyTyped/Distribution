package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmooth extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis
    */
  var emphasis: js.UndefOr[AnonShow] = js.undefined
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or
    * the values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.undefined
}

object AnonSmooth {
  @scala.inline
  def apply(
    emphasis: AnonShow = null,
    length: Int | Double = null,
    length2: Int | Double = null,
    lineStyle: AnonShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined,
    smooth: Boolean | Double = null
  ): AnonSmooth = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (length2 != null) __obj.updateDynamic("length2")(length2.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmooth]
  }
}

