package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AnimationEasingUpdate extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.native
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.hoverAnimation)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.native
}

