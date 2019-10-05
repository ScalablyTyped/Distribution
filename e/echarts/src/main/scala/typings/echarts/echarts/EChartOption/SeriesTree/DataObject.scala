package typings.echarts.echarts.EChartOption.SeriesTree

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderType
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree.data)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationDurationUpdate
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
    * "linear"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * The style of the node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * The label of the node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * The name of the tree node, used to identify each node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The value of the node, displayed in the tooltip.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data.value
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
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    name: String = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

