package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Tooltip.Format
import typings.echarts.echarts.EChartOption.Tooltip.Formatter
import typings.echarts.echarts.EChartOption.Tooltip.Position.Obj
import typings.echarts.echarts.EChartOption.Tooltip.Position.Type
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTooltip extends js.Object {
  /**
    * The background color of tooltip's floating layer.
    *
    * @default 'rgba(50, 50, 50, 0.7)'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The border color of tooltip's floating layer.
    *
    * @default '#333'
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * The border width of tooltip's floating layer.
    *
    * @default 0
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * Extra CSS style for floating layer.
    * The following is an example for adding shadow.
    *
    * @example
    * extraCssText: 'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'
    */
  var extraCssText: js.UndefOr[String] = js.native
  /**
    * The content formatter of tooltip's floating layer
    * which supports string template and callback function.
    *
    * Types:
    * 1. String.
    * The template variables are `{a}`, `{b}`, `{c}`, `{d}` and `{e}`,
    * which stands for series name, data name and data value and ect.
    * When trigger is set to be `'axis'`, there may be data
    * from multiple series. In this time, series index can be refered
    * as `{a0}`, `{a1}`, or `{a2}`.
    * `{a}`, `{b}`, `{c}`, `{d}` have different meanings
    * for different series types:
    *   + Line (area) charts, bar (column) charts, K charts:
    *   `{a}` for series name,
    *   `{b}` for category name,
    *   `{c}` for data value,
    *   `{d}` for none;
    *   + Scatter (bubble) charts:
    *   `{a}` for series name,
    *   `{b}` for data name,
    *   `{c}` for data value,
    *   `{d}` for none;
    *   + Map:
    *   `{a}` for series name,
    *   `{b}` for area name,
    *   `{c}` for merging data,
    *   `{d}` for none;
    *   + Pie charts, gauge charts, funnel charts:
    *   `{a}` for series name,
    *   `{b}` for data item name,
    *   `{c}` for data value,
    *   `{d}` for percentage.
    *
    * 2. Function.
    * The first parameter params is the data that the formatter needs.
    * Its format is shown as {Format}
    * When trigger is `'axis'`, or when tooltip is triggered by
    * `axisPointer`, params is the data array of multiple series.
    * `Note`: Using array to present all the parameters in ECharts 2.x
    * is not supported anymore.
    * The second parameter ticket is the asynchronous callback flag
    * which should be used along with the third parameter callback
    * when it is used.
    * The third parameter callback is asynchronous callback.
    * When the content of tooltip is acquired asynchronously,
    * ticket and htm as introduced above can be used to update tooltip
    * with callback.
    *
    * @example
    * ```
    *
    * //string
    * formatter: '{b0}: {c0}<br />{b1}: {c1}'
    *
    * // function
    * formatter: function (params, ticket, callback) {
    *     $.get('detail?name=' + params.name, function (content) {
    *         callback(ticket, toHTML(content));
    *     });
    *     return 'Loading';
    * }
    * ```
    */
  var formatter: js.UndefOr[String | Formatter] = js.native
  /**
    * The floating layer of tooltip space around content.
    * The unit is px. Default values for each position are 5.
    * And they can be set to different values with left, right,
    * top, and bottom.
    *
    * @example
    * // Set padding to be 5
    * padding: 5
    * // Set the top and bottom paddings to be 5, and left and right paddings to be 10
    * padding: [5, 10]
    * // Set each of the four paddings seperately
    * padding: [
    *     5,  // up
    *     10, // right
    *     5,  // down
    *     10, // left
    * ]
    *
    * @default 5
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * The position of the tooltip's floating layer,
    * which would follow the position of mouse by default.
    *
    * Options:
    * 1. String.
    *   + 'inside' - Center position of the graphic element
    *   where the mouse is in, which is only valid when trigger
    *   is 'item'.
    *   + 'top' - Top position of the graphic element where the mouse
    *   is in, which is only valid when trigger is 'item'.
    *   + 'left' - Left position of the graphic element where the mouse
    *   is in, which is only valid when trigger is 'item'.
    *   + 'right' - Right position of the graphic element where
    *   the mouse is in, which is only valid when trigger is 'item'.
    *   + 'bottom' - Bottom position of the graphic element where
    *   the mouse is in, which is only valid when trigger is 'item'.
    *
    * 2. Object - Object with optional properties such as `top`,
    * `left`, `right` and `bottom` that could be `string` or `number`.
    * e.g. `{left: 10, top: 30}`, or `{right: '20%', bottom: 40}`
    *
    * 3. Array - Display the position of tooltip's floating layer
    * through array, which supports absolute position
    * and relative percentage.
    *
    * 4. Function.
    *   + Parameters:
    *     + point: Mouse position.
    *     + param: The same as formatter.
    *     + dom: The DOM object of tooltip.
    *     + rect: It is valid only when mouse is on graphic elements,
    *       which stands for a bounding box with x, y, width, and height.
    *     + size: The size of dom echarts container.
    *       For example:
    *       `{contentSize: [width, height], viewSize: [width, height]}`
    *   + Return:
    *     position as `String`, `Array` or `Object` described above
    *
    * @see https://echarts.apache.org/en/option.html#tooltip.position
    */
  var position: js.UndefOr[Type] = js.native
  /**
    * The text style of tooltip's floating layer.
    */
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
}

object BaseTooltip {
  @scala.inline
  def apply(): BaseTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTooltip]
  }
  @scala.inline
  implicit class BaseTooltipOps[Self <: BaseTooltip] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setExtraCssText(value: String): Self = this.set("extraCssText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraCssText: Self = this.set("extraCssText", js.undefined)
    @scala.inline
    def setFormatterFunction3(
      value: (/* params */ Format | js.Array[Format], /* ticket */ String, /* callback */ js.Function2[/* ticket */ String, /* html */ String, Unit]) => String
    ): Self = this.set("formatter", js.Any.fromFunction3(value))
    @scala.inline
    def setFormatter(value: String | Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPositionFunction5(
      value: (/* point */ js.Array[Double | String], /* params */ js.Object | js.Array[js.Object], /* element */ HTMLElement, /* rect */ js.Object, /* size */ js.Object) => (js.Array[Double | String]) | Obj
    ): Self = this.set("position", js.Any.fromFunction5(value))
    @scala.inline
    def setPositionVarargs(value: (Double | String)*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: Type): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTextStyle(value: BaseTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

