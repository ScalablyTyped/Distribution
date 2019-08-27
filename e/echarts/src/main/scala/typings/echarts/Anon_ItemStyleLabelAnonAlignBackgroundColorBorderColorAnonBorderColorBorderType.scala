package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColorBorderType extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
}

object Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColorBorderType {
  @scala.inline
  def apply(itemStyle: Anon_BorderColorBorderType = null, label: Anon_AlignBackgroundColorBorderColor = null): Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColorBorderType]
  }
}

