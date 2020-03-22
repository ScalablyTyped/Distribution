package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmphasisItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelAnonBorderRadius] = js.undefined
  /**
    * The style of the leaf node in the tree.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * Describes the style of the text label corresponding to the
    * leaf node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
}

object AnonEmphasisItemStyle {
  @scala.inline
  def apply(
    emphasis: AnonLabelAnonBorderRadius = null,
    itemStyle: AnonBorderType = null,
    label: AnonBorderRadius = null
  ): AnonEmphasisItemStyle = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmphasisItemStyle]
  }
}

