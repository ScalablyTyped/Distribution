package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderColorBorderType extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
}

object AnonItemStyleAnonBorderColorBorderType {
  @scala.inline
  def apply(itemStyle: AnonBorderColorBorderType = null): AnonItemStyleAnonBorderColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderColorBorderType]
  }
}

