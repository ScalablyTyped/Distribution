package typings.echarts.echarts.EChartOption.SeriesMap

import typings.echarts.AnonAreaColorAnonBorderType
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonItemStyleAnonAreaColor
import typings.echarts.AnonRotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonAreaColor] = js.undefined
  /**
    * Style of item polygon
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonAreaColorAnonBorderType] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter,
    * `label`is taken to be at the same level with `itemStyle`,
    * and has `emphasis` as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.label
    */
  var label: js.UndefOr[AnonRotate] = js.undefined
  /**
    * The name of the map area where the data belongs to, such
    * as `'China'` or `'United Kingdom'` .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the are selected.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * The numerical value of this area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: AnonItemStyleAnonAreaColor = null,
    itemStyle: AnonAreaColorAnonBorderType = null,
    label: AnonRotate = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tooltip: AnonExtraCssText = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

