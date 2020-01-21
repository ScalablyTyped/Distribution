package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownplay extends js.Object {
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels.downplay
    */
  var downplay: js.UndefOr[
    AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance
  ] = js.undefined
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels.emphasis
    */
  var emphasis: js.UndefOr[
    AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance
  ] = js.undefined
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels.highlight
    */
  var highlight: js.UndefOr[
    AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance
  ] = js.undefined
  /**
    * Style of Sunburst sectors.
    *
    * Style can be set in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * for sectors of this series, or
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * for the whole level, or
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * for single sector. If
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * is defined, it will cover the setting of
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * and
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * .
    *
    * **Priority:
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * >
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * >
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * .**
    *
    * In ECharts, _emphasis_ is for styles when mouse hovers.
    * For Sunburst charts, there are two extra states: _highlight_
    * for highlighting items that relates to the emphasized one,
    * and _downplay_ for others when emphasizing an item. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * `label` sets the text style for every sectors.
    *
    * **Priority:
    * [series.data.label](https://echarts.apache.org/en/option.html#series-sunburst.data.label)
    * >
    * [series.levels.label](https://echarts.apache.org/en/option.html#series-sunburst.levels.label)
    * >
    * [series.label](https://echarts.apache.org/en/option.html#series-sunburst.label)
    * .**
    *
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter,
    * `label`is taken to be at the same level with `itemStyle`,
    * and has `emphasis` as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance] = js.undefined
}

object AnonDownplay {
  @scala.inline
  def apply(
    downplay: AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null,
    emphasis: AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null,
    highlight: AnonItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null,
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null
  ): AnonDownplay = {
    val __obj = js.Dynamic.literal()
    if (downplay != null) __obj.updateDynamic("downplay")(downplay.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownplay]
  }
}

