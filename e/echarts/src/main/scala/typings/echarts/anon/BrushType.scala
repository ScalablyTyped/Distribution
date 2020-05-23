package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrushType extends js.Object {
  /**
    * The brush type for ripples.
    * options: `'stroke'` and `'fill'`.
    *
    *
    * @default
    * "fill"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.brushType
    */
  var brushType: js.UndefOr[String] = js.undefined
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object BrushType {
  @scala.inline
  def apply(
    brushType: String = null,
    period: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): BrushType = {
    val __obj = js.Dynamic.literal()
    if (brushType != null) __obj.updateDynamic("brushType")(brushType.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushType]
  }
}

