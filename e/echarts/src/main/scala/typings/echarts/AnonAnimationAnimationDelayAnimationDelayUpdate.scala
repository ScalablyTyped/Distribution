package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationAnimationDelayAnimationDelayUpdate extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The scope of the area is defined by `data`, which is an array
    * with two item, representing the left-top point and the right-bottom
    * point of rectangle area.
    * Each item can be defined as follows:
    *
    * 1.
    * Specify the coordinate in screen coordinate system using
    * [x](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.y)
    * , where the unit is pixel (e.g.,
    * the value is `5`), or percent (e.g.,
    * the value is `'35%'`).
    *
    * 2.
    * Specify the coordinate in data coordinate system (i.e.,
    * cartesian) using
    * [coord](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.coord)
    * , which can be also set as `'min'`, `'max'`, `'average'`
    * (e.g,
    * `coord: [23, 'min']`, or `coord: ['average', 'max']`)。
    *
    * 1.
    * Locate the point on the min value or max value of `series.data`
    * using
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.type)
    * , where
    * [valueIndex](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.valueIndex)
    * or
    * [valueDim](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.0.valueDim)
    * can be used to specify the dimension on which the min, max
    * or average are calculated.
    * 2.
    * If in cartesian, you can only specify `xAxis` or `yAxis`
    * to define a mark area based on only X or Y axis, see sample
    * [scatter-weight](https://echarts.apache.org/examples/en/editor.html?c=scatter-weight)
    *
    * The priority follows as above if more than one above definition
    * used.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data
    */
  var data: js.UndefOr[Anon01] = js.undefined
  /**
    * Style of the mark area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * Label in mark area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object AnonAnimationAnimationDelayAnimationDelayUpdate {
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
    data: Anon01 = null,
    itemStyle: AnonBorderColorBorderTypeBorderWidth = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): AnonAnimationAnimationDelayAnimationDelayUpdate = {
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
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationAnimationDelayAnimationDelayUpdate]
  }
}

