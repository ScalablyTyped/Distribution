package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisItemStyleLabel extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColor] = js.undefined
  /**
    * The style of the leaf node in the tree.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColor] = js.undefined
  /**
    * Describes the style of the text label corresponding to the
    * leaf node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
}

object Anon_EmphasisItemStyleLabel {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorAnonBorderColor = null,
    itemStyle: Anon_BorderColor = null,
    label: Anon_AlignBackgroundColorBorderColor = null
  ): Anon_EmphasisItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_EmphasisItemStyleLabel]
  }
}

