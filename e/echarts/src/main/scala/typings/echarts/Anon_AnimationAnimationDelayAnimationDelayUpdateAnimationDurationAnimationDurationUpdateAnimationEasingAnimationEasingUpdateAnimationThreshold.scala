package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.markLine)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.markLine)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.markLine)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.markLine)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Data array of marking line.
    * Every array item can be an array of one or two values, representing
    * starting and ending point of the line, and every item is
    * an object.
    * Here are several ways to assign the positions of starting
    * and ending point.
    *
    * 1. Assign coordinate according to container with
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.x)
    * ,
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * 2. Assign coordinate position with
    * [coord](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.coord)
    * attribute, in which `'min'`, `'max'`, `'average'` are supported
    * for each dimension.
    *
    * 3. Use
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.type)
    * attribute to mark the maximum and minimum values in the series,
    * in which
    * [valueIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.valueIndex)
    * or
    * [valueDim](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.valueDim)
    * can be used to assign the dimension.
    *
    * 4.
    * You may also create a mark line in Cartesian coordinate at
    * a specific position in X or Y axis by assigning `xAxis` or
    * `yAxis`. See
    * [scatter-weight](https://ecomfe.github.io/echarts-examples/public/editor.html?c=scatter-weight)
    * for example.
    *
    * When multiple attributes exist, priority is as the above
    * order.
    *
    * You may also set the type of mark line through `type`, stating
    * whether it is for the maximum value or average value.
    * Likewise, dimensions can be assigned through `valueIndex`.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.line.markLine)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data
    */
  var data: js.UndefOr[Anon_01AnonCoordLabelLineStyle] = js.undefined
  /**
    * Mark line text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.label
    */
  var label: js.UndefOr[Anon_Emphasis] = js.undefined
  /**
    * Mark line style.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessEmphasisOpacity] = js.undefined
  /**
    * Precison of marking line value, which is useful when displaying
    * average value mark line.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.precision
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbol type at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    * See
    * [data.symbol](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * Symbol size at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    *
    * **Attention:** You cannot assgin width and height seperately
    * as normal `symbolSize`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
}

object Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    data: Anon_01AnonCoordLabelLineStyle = null,
    label: Anon_Emphasis = null,
    lineStyle: Anon_ColorCurvenessEmphasisOpacity = null,
    precision: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    symbol: js.Array[_] | String = null,
    symbolSize: js.Array[_] | Double = null
  ): Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThreshold]
  }
}

