package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthLineStyle extends js.Object {
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
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
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

object LengthLineStyle {
  @scala.inline
  def apply(
    length: Double | String = null,
    lineStyle: ShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LengthLineStyle = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthLineStyle]
  }
}

