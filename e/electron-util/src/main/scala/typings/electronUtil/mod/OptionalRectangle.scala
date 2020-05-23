package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalRectangle extends js.Object {
  /**
  	The height of the rectangle (must be an integer).
  	*/
  val height: js.UndefOr[Double] = js.undefined
  /**
  	The width of the rectangle (must be an integer).
  	*/
  val width: js.UndefOr[Double] = js.undefined
  /**
  	The x coordinate of the origin of the rectangle (must be an integer).
  	*/
  val x: js.UndefOr[Double] = js.undefined
  /**
  	The y coordinate of the origin of the rectangle (must be an integer).
  	*/
  val y: js.UndefOr[Double] = js.undefined
}

object OptionalRectangle {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): OptionalRectangle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalRectangle]
  }
}

