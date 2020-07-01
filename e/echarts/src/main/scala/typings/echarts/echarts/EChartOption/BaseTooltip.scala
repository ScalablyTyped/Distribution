package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Tooltip.Formatter
import typings.echarts.echarts.EChartOption.Tooltip.Position.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTooltip extends js.Object {
  /**
    * The background color of tooltip's floating layer.
    *
    * @default 'rgba(50, 50, 50, 0.7)'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The border color of tooltip's floating layer.
    *
    * @default '#333'
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * The border width of tooltip's floating layer.
    *
    * @default 0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Extra CSS style for floating layer.
    * The following is an example for adding shadow.
    *
    * @example
    * extraCssText: 'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'
    */
  var extraCssText: js.UndefOr[String] = js.undefined
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
  var formatter: js.UndefOr[String | Formatter] = js.undefined
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
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
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
  var position: js.UndefOr[Type] = js.undefined
  /**
    * The text style of tooltip's floating layer.
    */
  var textStyle: js.UndefOr[BaseTextStyle] = js.undefined
}

object BaseTooltip {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    extraCssText: String = null,
    formatter: String | Formatter = null,
    padding: Double | js.Array[Double] = null,
    position: Type = null,
    textStyle: BaseTextStyle = null
  ): BaseTooltip = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (extraCssText != null) __obj.updateDynamic("extraCssText")(extraCssText.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTooltip]
  }
}

