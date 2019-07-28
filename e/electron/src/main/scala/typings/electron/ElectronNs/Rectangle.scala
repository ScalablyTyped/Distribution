package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/rectangle
  /**
    * The height of the rectangle (must be an integer).
    */
  var height: Double
  /**
    * The width of the rectangle (must be an integer).
    */
  var width: Double
  /**
    * The x coordinate of the origin of the rectangle (must be an integer).
    */
  var x: Double
  /**
    * The y coordinate of the origin of the rectangle (must be an integer).
    */
  var y: Double
}

object Rectangle {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Rectangle]
  }
}

