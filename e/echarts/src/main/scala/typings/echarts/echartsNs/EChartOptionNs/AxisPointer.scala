package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_ColorIcon
import typings.echarts.Anon_ColorOpacityShadowBlur
import typings.echarts.Anon_ColorOpacityShadowBlurShadowColor
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.PointerLabel
import typings.echarts.echartsStrings.`mousemove|click`
import typings.echarts.echartsStrings.click
import typings.echarts.echartsStrings.line
import typings.echarts.echartsStrings.mousemove
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait AxisPointer extends Pointer {
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component
    * in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * axisPointers can be linked to each other.
    * The term 'link' represents that axes are synchronized
    * and move together.
    * Axes are linked according to the value of axisPointer.
    * See
    * [sampleA](https://ecomfe.github.io/echarts-examples/public/view.html?c=candlestick-brush&edit=1&reset=1)
    * and
    * [sampleB](https://ecomfe.github.io/echarts-examples/public/view.html?c=scatter-nutrients-matrix&edit=1&reset=1).
    * link is an array, where each item represents a 'link group'.
    * Axes will be linked when they are refered
    * in the same link group.
    *
    * @example:
    * link: [
    *     {
    *         // All axes with xAxisIndex 0, 3, 4 and yAxisName 'sameName' will be linked.
    *         xAxisIndex: [0, 3, 4],
    *         yAxisName: 'someName'
    *     },
    *     {
    *         // All axes with xAxisId 'aa', 'cc' and all angleAxis will be linked.
    *         xAxisId: ['aa', 'cc'],
    *         angleAxis: 'all'
    *     },
    *     ...
    * ]
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#axisPointer.link
    */
  var link: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * Conditions to trigger tooltip.
    * Options:
    * + `'mousemove'` - Trigger when mouse moves.
    * + `'click'` - Trigger when mouse clicks.
    * + `'mousemove|click'` - Trigger when mouse clicks and moves.
    *   `'none'` - Do not triggered by `'mousemove'` and `'click'`.
    *   Tooltip can be triggered and hidden manually by calling
    *   `action.tooltip.showTip` and `action.tooltip.hideTip`.
    *   It can also be triggered by `axisPointer.handle` in this case.
    *
    * This attribute is new to ECharts 3.0.
    *
    * @default 'mousemove|click'
    */
  var triggerOn: js.UndefOr[mousemove | click | `mousemove|click` | none] = js.undefined
}

object AxisPointer {
  @scala.inline
  def apply(
    handle: Anon_ColorIcon = null,
    id: String = null,
    label: PointerLabel = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    link: js.Array[js.Object] = null,
    shadowStyle: Anon_ColorOpacityShadowBlurShadowColor = null,
    show: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    triggerOn: mousemove | click | `mousemove|click` | none = null,
    triggerTooltip: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none = null,
    value: Int | Double = null,
    z: Int | Double = null
  ): AxisPointer = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (link != null) __obj.updateDynamic("link")(link)
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerTooltip)) __obj.updateDynamic("triggerTooltip")(triggerTooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPointer]
  }
}

