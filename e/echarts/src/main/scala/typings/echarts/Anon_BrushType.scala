package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrushType extends js.Object {
  /**
    * The brush type for ripples.
    * options: `'stroke'` and `'fill'`.
    *
    *
    * @default
    * "fill"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.rippleEffect.brushType
    */
  var brushType: js.UndefOr[String] = js.undefined
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object Anon_BrushType {
  @scala.inline
  def apply(brushType: String = null, period: Int | Double = null, scale: Int | Double = null): Anon_BrushType = {
    val __obj = js.Dynamic.literal()
    if (brushType != null) __obj.updateDynamic("brushType")(brushType)
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BrushType]
  }
}

