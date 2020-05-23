package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleTextStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[TextStyle] = js.undefined
}

object ItemStyleTextStyle {
  @scala.inline
  def apply(itemStyle: TextStyle = null): ItemStyleTextStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleTextStyle]
  }
}

