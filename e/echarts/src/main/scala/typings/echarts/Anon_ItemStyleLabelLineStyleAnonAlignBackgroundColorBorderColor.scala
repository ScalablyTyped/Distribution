package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessShadowBlur] = js.undefined
}

object Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColor = null,
    lineStyle: Anon_ColorCurvenessShadowBlur = null
  ): Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    __obj.asInstanceOf[Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor]
  }
}

