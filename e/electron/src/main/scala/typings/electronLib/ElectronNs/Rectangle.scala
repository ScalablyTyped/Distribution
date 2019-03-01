package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/rectangle
  /**
    * The height of the rectangle (must be an integer).
    */
  var height: scala.Double
  /**
    * The width of the rectangle (must be an integer).
    */
  var width: scala.Double
  /**
    * The x coordinate of the origin of the rectangle (must be an integer).
    */
  var x: scala.Double
  /**
    * The y coordinate of the origin of the rectangle (must be an integer).
    */
  var y: scala.Double
}

object Rectangle {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Rectangle]
  }
}

