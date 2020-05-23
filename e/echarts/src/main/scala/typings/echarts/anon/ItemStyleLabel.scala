package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
}

object ItemStyleLabel {
  @scala.inline
  def apply(itemStyle: ShadowOffsetY = null, label: BorderRadius = null): ItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleLabel]
  }
}

