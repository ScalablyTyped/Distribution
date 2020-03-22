package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderType extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
}

object AnonItemStyleAnonBorderType {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null): AnonItemStyleAnonBorderType = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderType]
  }
}

