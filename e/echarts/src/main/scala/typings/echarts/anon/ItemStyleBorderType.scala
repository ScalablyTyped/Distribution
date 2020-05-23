package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleBorderType extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
}

object ItemStyleBorderType {
  @scala.inline
  def apply(itemStyle: BorderType = null): ItemStyleBorderType = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleBorderType]
  }
}

