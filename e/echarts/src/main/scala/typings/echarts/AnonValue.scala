package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[AnonEmphasis] = js.undefined
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1.label
    */
  var label: js.UndefOr[AnonFontFamily] = js.undefined
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(
    itemStyle: AnonEmphasis = null,
    label: AnonFontFamily = null,
    name: String = null,
    value: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

