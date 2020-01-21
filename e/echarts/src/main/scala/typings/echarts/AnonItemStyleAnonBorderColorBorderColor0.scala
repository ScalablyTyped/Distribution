package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderColorBorderColor0 extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderColor0] = js.undefined
}

object AnonItemStyleAnonBorderColorBorderColor0 {
  @scala.inline
  def apply(itemStyle: AnonBorderColorBorderColor0 = null): AnonItemStyleAnonBorderColorBorderColor0 = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderColorBorderColor0]
  }
}

