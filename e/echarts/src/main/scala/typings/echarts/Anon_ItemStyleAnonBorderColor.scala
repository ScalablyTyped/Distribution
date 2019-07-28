package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleAnonBorderColor extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColor] = js.undefined
}

object Anon_ItemStyleAnonBorderColor {
  @scala.inline
  def apply(itemStyle: Anon_BorderColor = null): Anon_ItemStyleAnonBorderColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    __obj.asInstanceOf[Anon_ItemStyleAnonBorderColor]
  }
}

