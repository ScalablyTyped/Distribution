package typings.echarts.echarts.EChartOption

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

@js.native
trait Tooltip_ extends BaseTooltip {
  /**
    * Whether to show tooltip content all the time.
    * By default, it will be hidden after `tooltip.hideDelay`.
    * It can be set to be true to preserve displaying.
    * This attribute is newly added to ECharts 3.0.
    *
    * @default false
    */
  var alwaysShowContent: js.UndefOr[Boolean] = js.native
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
  var axisPointer: js.UndefOr[typings.echarts.echarts.EChartOption.Tooltip.AxisPointer] = js.native
  /**
    * Whether confine tooltip content in the view rect
    * of chart instance.
    * Useful when tooltip is cut because of `'overflow: hidden'`
    * set on outer dom of chart instance, or because of narrow
    * screen on mobile.
    *
    * @default false
    */
  var confine: js.UndefOr[Boolean] = js.native
  /**
    * Whether mouse is allowed to enter the floating layer
    * of tooltip, whose default value is false.
    * If you need to interact in the tooltip like with links
    * or buttons, it can be set as `true`.
    *
    * @default true
    */
  var enterable: js.UndefOr[Boolean] = js.native
  /**
    * Delay time for hiding tooltip, in ms.
    * It will be invalid when `alwaysShowContent` is `true`.
    *
    * @default 100
    */
  var hideDelay: js.UndefOr[Double] = js.native
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
  var renderMode: js.UndefOr[html] = js.native
  /**
    * Whether to show the tooltip component,
    * including tooltip floating layer and `axisPointer`.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the tooltip floating layer,
    * whose default value is true.
    * It should be configurated to be `false`,
    * if you only need tooltip to trigger the event
    * or show the axisPointer without content.
    *
    * @default true
    */
  var showContent: js.UndefOr[Boolean] = js.native
  /**
    * Delay time for showing tooltip, in ms.
    * No delay by default, and it is not recommended to set.
    * Only valid when `triggerOn` is set to be `'mousemove'`.
    *
    * @default 0
    */
  var showDelay: js.UndefOr[Double] = js.native
  /**
    * The transition duration of tooltip's animation, in seconds.
    * When it is set to be 0, it would move closely with the mouse.
    *
    * @default 0.4
    */
  var transitionDuration: js.UndefOr[Double] = js.native
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
  var trigger: js.UndefOr[item | axis | none] = js.native
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
  var triggerOn: js.UndefOr[mousemove | click | mousemoveVerticallineclick | none] = js.native
}

object Tooltip_ {
  @scala.inline
  def apply(): Tooltip_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip_]
  }
  @scala.inline
  implicit class Tooltip_Ops[Self <: Tooltip_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysShowContent(value: Boolean): Self = this.set("alwaysShowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowContent: Self = this.set("alwaysShowContent", js.undefined)
    @scala.inline
    def setAxisPointer(value: typings.echarts.echarts.EChartOption.Tooltip.AxisPointer): Self = this.set("axisPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisPointer: Self = this.set("axisPointer", js.undefined)
    @scala.inline
    def setConfine(value: Boolean): Self = this.set("confine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfine: Self = this.set("confine", js.undefined)
    @scala.inline
    def setEnterable(value: Boolean): Self = this.set("enterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterable: Self = this.set("enterable", js.undefined)
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    @scala.inline
    def setRenderMode(value: html): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowContent(value: Boolean): Self = this.set("showContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowContent: Self = this.set("showContent", js.undefined)
    @scala.inline
    def setShowDelay(value: Double): Self = this.set("showDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDelay: Self = this.set("showDelay", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setTrigger(value: item | axis | none): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setTriggerOn(value: mousemove | click | mousemoveVerticallineclick | none): Self = this.set("triggerOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerOn: Self = this.set("triggerOn", js.undefined)
  }
  
}

