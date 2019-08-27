package typings.echarts.echartsNs.EChartOptionNs.SeriesPieNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyle
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColor
import typings.echarts.Anon_EmphasisLengthLength2LineStyle
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeight
  ] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * The label configuration of a single sector.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyle
  ] = js.undefined
  /**
    * The style of visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine
    */
  var labelLine: js.UndefOr[Anon_EmphasisLengthLength2LineStyle] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the data item is selected.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Data value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeight = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColor = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyle = null,
    labelLine: Anon_EmphasisLengthLength2LineStyle = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tooltip: Anon_BackgroundColorBorderColor = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

