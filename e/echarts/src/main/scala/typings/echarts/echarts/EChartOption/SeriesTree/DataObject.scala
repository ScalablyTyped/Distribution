package typings.echarts.echarts.EChartOption.SeriesTree

import typings.echarts.AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth
import typings.echarts.AnonBackgroundColorBorderColor
import typings.echarts.AnonBorderColorBorderType
import typings.echarts.AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.data)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationDurationUpdate
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
    * "linear"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-tree.data.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * The style of the node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * The label of the node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * The name of the tree node, used to identify each node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.tooltip
    */
  var tooltip: js.UndefOr[AnonBackgroundColorBorderColor] = js.undefined
  /**
    * The value of the node, displayed in the tooltip.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
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
    children: js.Array[DataObject] = null,
    emphasis: AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    name: String = null,
    tooltip: AnonBackgroundColorBorderColor = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

