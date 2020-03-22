package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonR extends js.Object {
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Specify border radius of the rectangular here.
    * Generally, `r` should be `[topLeftRadius, topRightRadius,
    * BottomRightRadius, bottomLeftRadius]`, where each
    * item is a number.
    *
    * Abbreviation is enabled, for example:
    *
    * + `r`: `1` means `[1, 1, 1, 1]`
    * + `r`: `[1]` means `[1, 1, 1, 1]`
    * + `r`: `[1, 2]` means `[1, 2, 1, 2]`
    * + `r`: `[1, 2, 3]` means `[1, 2, 3, 2]`
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.r
    */
  var r: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.width
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.x
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.y
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonR {
  @scala.inline
  def apply(
    height: Int | Double = null,
    r: js.Array[_] = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonR = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonR]
  }
}

