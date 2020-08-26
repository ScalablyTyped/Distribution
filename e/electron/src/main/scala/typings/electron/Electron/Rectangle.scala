package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/rectangle
  /**
    * The height of the rectangle (must be an integer).
    */
  var height: Double = js.native
  /**
    * The width of the rectangle (must be an integer).
    */
  var width: Double = js.native
  /**
    * The x coordinate of the origin of the rectangle (must be an integer).
    */
  var x: Double = js.native
  /**
    * The y coordinate of the origin of the rectangle (must be an integer).
    */
  var y: Double = js.native
}

object Rectangle {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  @scala.inline
  implicit class RectangleOps[Self <: Rectangle] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

