package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthLineStyle extends js.Object {
  /**
    * The length of tick line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 8
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisTick.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisTick.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the scale.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisTick.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * The split scale number between split line.
    *
    *
    * @default
    * 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisTick.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.undefined
}

object Anon_LengthLineStyle {
  @scala.inline
  def apply(
    length: Double | String = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined,
    splitNumber: Int | Double = null
  ): Anon_LengthLineStyle = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LengthLineStyle]
  }
}

