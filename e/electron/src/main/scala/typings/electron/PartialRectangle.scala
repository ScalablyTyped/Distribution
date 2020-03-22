package typings.electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<electron.Electron.Rectangle> */
trait PartialRectangle extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PartialRectangle {
  @scala.inline
  def apply(
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PartialRectangle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRectangle]
  }
}

