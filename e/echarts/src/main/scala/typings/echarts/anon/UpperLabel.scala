package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpperLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[ColorString] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.label
    */
  var label: js.UndefOr[Ellipsis] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel
    */
  var upperLabel: js.UndefOr[Ellipsis] = js.undefined
}

object UpperLabel {
  @scala.inline
  def apply(itemStyle: ColorString = null, label: Ellipsis = null, upperLabel: Ellipsis = null): UpperLabel = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (upperLabel != null) __obj.updateDynamic("upperLabel")(upperLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpperLabel]
  }
}

