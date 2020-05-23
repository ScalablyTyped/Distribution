package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the size and coordinates of a rectangle.
  */
trait Rectangle extends js.Object {
  /**
    * Gets the rectangle's height.
    */
  var height: Double
  /**
    * Gets the rectangle's width.
    */
  var width: Double
  /**
    * Gets the x-coordinate of the upper-left corner of the rectangle.
    */
  var x: Double
  /**
    * Gets the y-coordinate of the upper-left corner of the rectangle.
    */
  var y: Double
}

object Rectangle {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

