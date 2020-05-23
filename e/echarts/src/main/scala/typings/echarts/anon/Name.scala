package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
    * The format is \[start coordinate, end coordinate\],
    * where the coordinate system can be `x`, `y` on
    * [cartesian](https://echarts.apache.org/en/option.html#grid)
    * , or `radius`, `angle` on
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.coord
    */
  var coord: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.undefined
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.label
    */
  var label: js.UndefOr[FontFamily] = js.undefined
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Specify this item is on min or max or average value.
    *
    * **Options:**
    *
    * + `'min'` max value。
    * + `'max'` min value。
    * + `'average'` average value。
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be the name of the dimension (for example,
    * the value can be `x`, `angle` in line chart, and
    * `open`, `close` in candlestick).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueDim
    */
  var valueDim: js.UndefOr[String] = js.undefined
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be `0` (means xAxis, radiusAxis) or
    * `1` (means yAxis, angleAxis), using the dimension
    * of the first axis by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueIndex
    */
  var valueIndex: js.UndefOr[Double] = js.undefined
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Name {
  @scala.inline
  def apply(
    coord: js.Array[_] = null,
    itemStyle: Emphasis = null,
    label: FontFamily = null,
    name: String = null,
    `type`: String = null,
    value: js.UndefOr[Double] = js.undefined,
    valueDim: String = null,
    valueIndex: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Name = {
    val __obj = js.Dynamic.literal()
    if (coord != null) __obj.updateDynamic("coord")(coord.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueDim != null) __obj.updateDynamic("valueDim")(valueDim.asInstanceOf[js.Any])
    if (!js.isUndefined(valueIndex)) __obj.updateDynamic("valueIndex")(valueIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

