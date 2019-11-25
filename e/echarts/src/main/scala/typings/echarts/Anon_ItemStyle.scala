package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyle extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BarBorderColorBarBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
}

object Anon_ItemStyle {
  @scala.inline
  def apply(
    itemStyle: Anon_BarBorderColorBarBorderWidth = null,
    label: Anon_AlignBackgroundColorBorderColor = null
  ): Anon_ItemStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyle]
  }
}

