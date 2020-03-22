package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonTextStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonTextStyle] = js.undefined
}

object AnonItemStyleAnonTextStyle {
  @scala.inline
  def apply(itemStyle: AnonTextStyle = null): AnonItemStyleAnonTextStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonTextStyle]
  }
}

