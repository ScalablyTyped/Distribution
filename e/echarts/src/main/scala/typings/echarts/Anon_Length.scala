package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  /**
    * The length of split line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 30
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the split line.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(
    length: Double | String = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Length]
  }
}

