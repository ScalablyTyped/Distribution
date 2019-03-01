package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordItemStyleLabelValue extends js.Object {
  /**
    * The format is \[start coordinate, end coordinate\],
    * where the coordinate system can be `x`, `y` on
    * [cartesian](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * , or `radius`, `angle` on
    * [polar](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.coord
    */
  var coord: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be the name of the dimension (for example,
    * the value can be `x`, `angle` in line chart, and
    * `open`, `close` in candlestick).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.valueDim
    */
  var valueDim: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be `0` (means xAxis, radiusAxis) or
    * `1` (means yAxis, angleAxis), using the dimension
    * of the first axis by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.valueIndex
    */
  var valueIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.x
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1.y
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CoordItemStyleLabelValue {
  @scala.inline
  def apply(
    coord: js.Array[_] = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    value: scala.Int | scala.Double = null,
    valueDim: java.lang.String = null,
    valueIndex: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_CoordItemStyleLabelValue = {
    val __obj = js.Dynamic.literal()
    if (coord != null) __obj.updateDynamic("coord")(coord)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueDim != null) __obj.updateDynamic("valueDim")(valueDim)
    if (valueIndex != null) __obj.updateDynamic("valueIndex")(valueIndex.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoordItemStyleLabelValue]
  }
}

