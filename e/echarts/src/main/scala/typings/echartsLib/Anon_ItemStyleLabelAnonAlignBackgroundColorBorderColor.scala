package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
}

object Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor {
  @scala.inline
  def apply(itemStyle: Anon_BorderColor = null, label: Anon_AlignBackgroundColorBorderColor = null): Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor]
  }
}

