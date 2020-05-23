package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitNumber extends js.Object {
  /**
    * The length of tick line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  /**
    * Whether to show the scale.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * The split scale number between split line.
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.undefined
}

object SplitNumber {
  @scala.inline
  def apply(
    length: Double | String = null,
    lineStyle: ShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined,
    splitNumber: js.UndefOr[Double] = js.undefined
  ): SplitNumber = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitNumber)) __obj.updateDynamic("splitNumber")(splitNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitNumber]
  }
}

