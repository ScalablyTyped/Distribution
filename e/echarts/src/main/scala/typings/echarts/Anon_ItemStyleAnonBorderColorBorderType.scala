package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleAnonBorderColorBorderType extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
}

object Anon_ItemStyleAnonBorderColorBorderType {
  @scala.inline
  def apply(itemStyle: Anon_BorderColorBorderType = null): Anon_ItemStyleAnonBorderColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleAnonBorderColorBorderType]
  }
}

