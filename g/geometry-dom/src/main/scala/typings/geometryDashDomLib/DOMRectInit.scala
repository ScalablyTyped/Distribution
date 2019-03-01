package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectInit extends js.Object {
  /**
    * height value
    */
  var height: scala.Double
  /**
    * width value
    */
  var width: scala.Double
  /**
    * x coordinate
    */
  var x: scala.Double
  /**
    * y coordinate
    */
  var y: scala.Double
}

object DOMRectInit {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): DOMRectInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[DOMRectInit]
  }
}

