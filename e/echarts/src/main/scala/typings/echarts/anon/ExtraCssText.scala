package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraCssText extends js.Object {
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The background color of tooltip's floating layer.
    *
    *
    * @default
    * "rgba(50,50,50,0.7)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.backgroundColor
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The border color of tooltip's floating layer.
    *
    *
    * @default
    * '#333'
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The border width of tooltip's floating layer.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * Extra CSS style for floating layer.
    * The following is an example for adding shadow.
    *
    * ```
    * extraCssText: 'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.extraCssText
    */
  var extraCssText: js.UndefOr[String] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The content formatter of tooltip's floating layer which supports
    * string template and callback function.
    *
    * **1\. String template**
    *
    * The template variables are `{a}`, `{b}`, `{c}`, `{d}` and
    * `{e}`, which stands for series name, data name and data value
    * and ect. When
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is set to be `'axis'`, there may be data from multiple series.
    * In this time, series index can be refered as `{a0}`, `{a1}`,
    * or `{a2}`.
    *
    * `{a}`, `{b}`, `{c}`, `{d}` have different meanings for different
    * series types:
    *
    * + Line (area) charts, bar (column) charts, K charts: `{a}`
    * for series name, `{b}` for category name, `{c}` for data
    * value, `{d}` for none;
    *
    * + Scatter (bubble) charts: `{a}` for series name, `{b}` for
    * data name, `{c}` for data value, `{d}` for none;
    *
    * + Map: `{a}` for series name, `{b}` for area name, `{c}`
    * for merging data, `{d}` for none;
    *
    * + Pie charts, gauge charts, funnel charts: `{a}` for series
    * name, `{b}` for data item name, `{c}` for data value, `{d}`
    * for percentage.
    *
    * **Example:**
    *
    * ```
    * formatter: '{b0}: {c0}<br />{b1}: {c1}'
    *
    * ```
    *
    * **2\. Callback function**
    *
    * The format of callback function:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * The first parameter `params` is the data that the formatter
    * needs. Its format is shown as follows:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * When
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'axis'`, or when tooltip is triggered by
    * [axisPointer](https://echarts.apache.org/en/option.html#xAxis.axisPointer)
    * , `params` is the data array of multiple series.
    * The content of each item of the array is the same as above.
    * Besides,
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * **Note:** Using array to present all the parameters in ECharts
    * 2.x is not supported anymore.
    *
    * The second parameter `ticket` is the asynchronous callback
    * flag which should be used along with the third parameter
    * `callback` when it is used.
    *
    * The third parameter `callback` is asynchronous callback.
    * When the content of tooltip is acquired asynchronously, `ticket`
    * and `htm` as introduced above can be used to update tooltip
    * with callback.
    *
    * Example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.formatter
    */
  var formatter: js.UndefOr[js.Function | String] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The floating layer of tooltip space around content.
    * The unit is px.
    * Default values for each position are 5.
    * And they can be set to different values with left, right,
    * top, and bottom.
    *
    * Examples:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.padding
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The position of the tooltip's floating layer, which would
    * follow the position of mouse by default.
    *
    * Options:
    *
    * + `Array`
    *
    * Display the position of tooltip's floating layer through
    * array, which supports absolute position and relative percentage.
    *
    * Example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * + `Function`
    *
    * Callback function in the following form:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * **Parameters:**
    * point: Mouse position.
    * param: The same as formatter.
    * dom: The DOM object of tooltip.
    * rect: It is valid only when mouse is on graphic elements,
    * which stands for a bounding box with `x`, `y`, `width`, and
    * `height`.
    * size: The size of dom echarts container.
    * For example: `{contentSize: [width, height], viewSize: [width,
    * height]}`.
    *
    * **Return:**
    * Return value is an array standing for tooltip position, which
    * can be absolute pixels, or relative percentage.
    * Or can be an object, like `{left: 10, top: 30}`, or `{right:
    * '20%', bottom: 40}`.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * Or:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.tooltip)
    *
    * + `'inside'`
    *
    * Center position of the graphic element where the mouse is
    * in, which is only valid when
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'item'`.
    *
    * + `'top'`
    *
    * Top position of the graphic element where the mouse is in,
    * which is only valid when
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'item'`.
    *
    * + `'left'`
    *
    * Left position of the graphic element where the mouse is in,
    * which is only valid when
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'item'`.
    *
    * + `'right'`
    *
    * Right position of the graphic element where the mouse is
    * in, which is only valid when
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'item'`.
    *
    * + `'bottom'`
    *
    * Bottom position of the graphic element where the mouse is
    * in, which is only valid when
    * [trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * is `'item'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.position
    */
  var position: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    *
    * > **Notice：**series.tooltip only works when
    * > [tooltip.trigger](https://echarts.apache.org/en/option.html#tooltip.trigger)
    * > is `'item'`.
    *
    * The text syle of tooltip's floating layer.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip.textStyle
    */
  var textStyle: js.UndefOr[FontSize] = js.undefined
}

object ExtraCssText {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    extraCssText: String = null,
    formatter: js.Function | String = null,
    padding: js.UndefOr[Double] = js.undefined,
    position: js.Array[_] | String = null,
    textStyle: FontSize = null
  ): ExtraCssText = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (extraCssText != null) __obj.updateDynamic("extraCssText")(extraCssText.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraCssText]
  }
}

