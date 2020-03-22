package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderColor0 extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColor0] = js.undefined
}

object AnonItemStyleAnonBorderColor0 {
  @scala.inline
  def apply(itemStyle: AnonBorderColor0 = null): AnonItemStyleAnonBorderColor0 = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderColor0]
  }
}

