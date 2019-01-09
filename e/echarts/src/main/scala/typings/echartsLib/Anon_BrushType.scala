package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var brushType: js.UndefOr[java.lang.String] = js.native
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[scala.Double] = js.native
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[scala.Double] = js.native
}

