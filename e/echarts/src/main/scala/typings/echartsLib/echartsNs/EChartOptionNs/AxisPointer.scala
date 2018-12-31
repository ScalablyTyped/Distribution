package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait AxisPointer
  extends echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer {
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component
    * in option or API.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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
  var triggerOn: js.UndefOr[
    echartsLib.echartsLibStrings.mousemove | echartsLib.echartsLibStrings.click | echartsLib.echartsLibStrings.`mousemove|click` | echartsLib.echartsLibStrings.none
  ] = js.undefined
}

