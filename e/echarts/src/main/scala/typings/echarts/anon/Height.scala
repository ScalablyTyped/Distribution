package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /**
    * Color filled in this element.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.fill
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * The height of the shape of the element.
    *
    * More attributes in `style` (for example,
    * [rich text](https://echarts.apache.org/en/tutorial.html#Rich%20Text)
    * ), see the `style` related attributes in
    * [zrender/graphic/Displayable](https://ecomfe.github.io/zrender-doc/public/api.html#zrenderdisplayable)
    * .
    *
    * Notice, the attribute names of the `style` of graphic
    * elements is derived from `zrender`, which may be
    * different from the attribute names in `echarts label`,
    * `echarts itemStyle`, etc.,
    * although they have the same meaning. For example:
    *
    * + [itemStyle.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.fill`
    * + [itemStyle.borderColor](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.stroke`
    * + [label.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.textFill`
    * + [label.textBorderColor](https://echarts.apache.org/en/option.html#series-scatter.label.textBorderColor)
    * => `style.textStroke`
    * + ...
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Specify contant of the image, can be a URL, or
    * [dataURI](https://tools.ietf.org/html/rfc2397)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.image
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * Width of stroke.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.lineWidth
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Width of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * color of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.shadowColor
    */
  var shadowColor: js.UndefOr[Double] = js.undefined
  /**
    * X offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Y offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Color of stroke.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.stroke
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.width
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image.style.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    fill: String = null,
    height: js.UndefOr[Double] = js.undefined,
    image: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: js.UndefOr[Double] = js.undefined,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowColor)) __obj.updateDynamic("shadowColor")(shadowColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

