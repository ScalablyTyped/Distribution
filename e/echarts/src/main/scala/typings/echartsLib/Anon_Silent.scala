package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Silent extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markArea)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markArea)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markArea)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markArea)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.native
  /**
    * The scope of the area is defined by `data`, which is an array
    * with two item, representing the left-top point and the right-bottom
    * point of rectangle area.
    * Each item can be defined as follows:
    *
    * 1.
    * Specify the coordinate in screen coordinate system using
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data.0.x)
    * ,
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data.0.y)
    * , where the unit is pixel (e.g.,
    * the value is `5`), or percent (e.g.,
    * the value is `'35%'`).
    *
    * 2.
    * Specify the coordinate in data coordinate system (i.e.,
    * cartesian) using
    * [coord](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data.0.coord)
    * , which can be also set as `'min'`, `'max'`, `'average'`
    * (e.g,
    * `coord: [23, 'min']`, or `coord: ['average', 'max']`)。
    *
    * 1.
    * Locate the point on the min value or max value of `series.data`
    * using
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data.0.type)
    * , where
    * [valueIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data.0.valueIndex)
    * or
    * [valueDim](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markPoint.data.0.valueDim)
    * can be used to specify the dimension on which the min, max
    * or average are calculated.
    * 2.
    * If in cartesian, you can only specify `xAxis` or `yAxis`
    * to define a mark area based on only X or Y axis, see sample
    * [scatter-weight](https://ecomfe.github.io/echarts-examples/public/editor.html?c=scatter-weight)
    *
    * The priority follows as above if more than one above definition
    * used.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.markArea)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.data
    */
  var data: js.UndefOr[Anon_1] = js.native
  /**
    * Style of the mark area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_ShadowOffsetXBorderTypeShadowBlur] = js.native
  /**
    * Label in mark area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.label
    */
  var label: js.UndefOr[Anon_ShadowOffsetXBackgroundColorShow] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.native
}

