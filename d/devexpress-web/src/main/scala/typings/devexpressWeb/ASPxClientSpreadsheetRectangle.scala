package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings specifying size and position of a spreadsheet cell's in-place editor.
  */
@js.native
trait ASPxClientSpreadsheetRectangle extends js.Object {
  /**
    * Gets the y-coordinate of the specified cell's bottom side.
    */
  var bottom: Double = js.native
  /**
    * Gets the height value of the cell's in-place editor.
    */
  var height: Double = js.native
  /**
    * Gets the x-coordinate of the specified cell's editor.
    */
  var left: Double = js.native
  /**
    * Gets the x-coordinate of the specified cell's right side.
    */
  var right: Double = js.native
  /**
    * Gets the y-coordinate of the specified cell's editor.
    */
  var top: Double = js.native
  /**
    * Gets the width value of the cell's in-place editor.
    */
  var width: Double = js.native
  /**
    * Gets the x-coordinate of the specified cell's left side.
    */
  var x: Double = js.native
  /**
    * Gets the y-coordinate of the specified cell's top side.
    */
  var y: Double = js.native
}

object ASPxClientSpreadsheetRectangle {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): ASPxClientSpreadsheetRectangle = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetRectangle]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetRectangleOps[Self <: ASPxClientSpreadsheetRectangle] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

