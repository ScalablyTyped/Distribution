package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleBorderColor0 extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor0] = js.undefined
}

object ItemStyleBorderColor0 {
  @scala.inline
  def apply(itemStyle: BorderColor0 = null): ItemStyleBorderColor0 = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleBorderColor0]
  }
}

