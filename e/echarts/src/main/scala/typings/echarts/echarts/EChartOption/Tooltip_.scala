package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Tooltip.Formatter
import typings.echarts.echarts.EChartOption.Tooltip.Position.Type
import typings.echarts.echartsStrings.axis
import typings.echarts.echartsStrings.click
import typings.echarts.echartsStrings.html
import typings.echarts.echartsStrings.item
import typings.echarts.echartsStrings.mousemove
import typings.echarts.echartsStrings.mousemoveVerticallineclick
import typings.echarts.echartsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip_ extends BaseTooltip {
  /**
    * Whether to show tooltip content all the time.
    * By default, it will be hidden after `tooltip.hideDelay`.
    * It can be set to be true to preserve displaying.
    * This attribute is newly added to ECharts 3.0.
    *
    * @default false
    */
  var alwaysShowContent: js.UndefOr[Boolean] = js.undefined
  /**
    * `axisPointer` is a tool for displaying reference line
    * and axis value under mouse pointer.
    *
    * Configuration item for axis indicator.
    * `tooltip.axisPointer` is like syntactic sugar
    * of `axisPointer` settings on axes
    * (for example, `xAxis.axisPointer` or `angleAxis.axisPointer`).
    * More detailed features can be configured
    * on `someAxis.axisPointer`.
    * But in common cases, using `tooltip.axisPinter`
    * is more convenient.
    * Notice: configurations of `tooltip.axisPointer` has
    * lower priority than that of `someAxis.axisPointer`.
    *
    * @see https://echarts.apache.org/en/option.html#tooltip.axisPointer
    */
  var axisPointer: js.UndefOr[typings.echarts.echarts.EChartOption.Tooltip.AxisPointer] = js.undefined
  /**
    * Whether confine tooltip content in the view rect
    * of chart instance.
    * Useful when tooltip is cut because of `'overflow: hidden'`
    * set on outer dom of chart instance, or because of narrow
    * screen on mobile.
    *
    * @default false
    */
  var confine: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether mouse is allowed to enter the floating layer
    * of tooltip, whose default value is false.
    * If you need to interact in the tooltip like with links
    * or buttons, it can be set as `true`.
    *
    * @default true
    */
  var enterable: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay time for hiding tooltip, in ms.
    * It will be invalid when `alwaysShowContent` is `true`.
    *
    * @default 100
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
  /**
    * Render mode for tooltip.
    * By default, it is set to be `'html'` so that extra DOM element
    * is used for tooltip.
    * It can also set to be `'richText'` so that the tooltip
    * will be rendered inside Canvas (SVG rich text is
    * not implemented yet).
    * This is very useful for environments that don't have DOM,
    * such as Wechat applications.
    *
    * @default 'html'
    */
  var renderMode: js.UndefOr[html] = js.undefined
  /**
    * Whether to show the tooltip component,
    * including tooltip floating layer and `axisPointer`.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the tooltip floating layer,
    * whose default value is true.
    * It should be configurated to be `false`,
    * if you only need tooltip to trigger the event
    * or show the axisPointer without content.
    *
    * @default true
    */
  var showContent: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay time for showing tooltip, in ms.
    * No delay by default, and it is not recommended to set.
    * Only valid when `triggerOn` is set to be `'mousemove'`.
    *
    * @default 0
    */
  var showDelay: js.UndefOr[Double] = js.undefined
  /**
    * The transition duration of tooltip's animation, in seconds.
    * When it is set to be 0, it would move closely with the mouse.
    *
    * @default 0.4
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
    * Type of triggering.
    * Options:
    * + `'item'` - Triggered by data item, which is mainly used
    *   for charts that don't have a category axis like scatter
    *   charts or pie charts.
    * + `'axis'` - Triggered by axes, which is mainly used
    *   for charts that have category axes, like bar charts
    *   or line charts.
    *   ECharts 2.x only supports axis trigger for category axis.
    *   In ECharts 3, it is supported for all types of axes in `grid`
    *   or `polar`. Also, you may assign axis with `axisPointer.axis`.
    * + `'none'` - Trigger nothing.
    *
    * @default 'item'
    */
  var trigger: js.UndefOr[item | axis | none] = js.undefined
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
  var triggerOn: js.UndefOr[mousemove | click | mousemoveVerticallineclick | none] = js.undefined
}

object Tooltip_ {
  @scala.inline
  def apply(
    alwaysShowContent: js.UndefOr[Boolean] = js.undefined,
    axisPointer: typings.echarts.echarts.EChartOption.Tooltip.AxisPointer = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    confine: js.UndefOr[Boolean] = js.undefined,
    enterable: js.UndefOr[Boolean] = js.undefined,
    extraCssText: String = null,
    formatter: String | Formatter = null,
    hideDelay: js.UndefOr[Double] = js.undefined,
    padding: Double | js.Array[Double] = null,
    position: Type = null,
    renderMode: html = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showContent: js.UndefOr[Boolean] = js.undefined,
    showDelay: js.UndefOr[Double] = js.undefined,
    textStyle: BaseTextStyle = null,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    trigger: item | axis | none = null,
    triggerOn: mousemove | click | mousemoveVerticallineclick | none = null
  ): Tooltip_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowContent)) __obj.updateDynamic("alwaysShowContent")(alwaysShowContent.get.asInstanceOf[js.Any])
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(confine)) __obj.updateDynamic("confine")(confine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterable)) __obj.updateDynamic("enterable")(enterable.get.asInstanceOf[js.Any])
    if (extraCssText != null) __obj.updateDynamic("extraCssText")(extraCssText.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showContent)) __obj.updateDynamic("showContent")(showContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDelay)) __obj.updateDynamic("showDelay")(showDelay.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip_]
  }
}

