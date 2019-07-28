package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelValue extends js.Object {
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_ItemStyleLabelValue {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    value: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Anon_ItemStyleLabelValue = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelValue]
  }
}

