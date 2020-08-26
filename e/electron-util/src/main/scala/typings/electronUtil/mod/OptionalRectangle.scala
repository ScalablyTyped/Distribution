package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalRectangle extends js.Object {
  /**
  	The height of the rectangle (must be an integer).
  	*/
  val height: js.UndefOr[Double] = js.native
  /**
  	The width of the rectangle (must be an integer).
  	*/
  val width: js.UndefOr[Double] = js.native
  /**
  	The x coordinate of the origin of the rectangle (must be an integer).
  	*/
  val x: js.UndefOr[Double] = js.native
  /**
  	The y coordinate of the origin of the rectangle (must be an integer).
  	*/
  val y: js.UndefOr[Double] = js.native
}

object OptionalRectangle {
  @scala.inline
  def apply(): OptionalRectangle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRectangle]
  }
  @scala.inline
  implicit class OptionalRectangleOps[Self <: OptionalRectangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

