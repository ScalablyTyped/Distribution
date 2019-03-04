package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  /**
    * max(y coordinate, y coordinate + height dimension)
    */
  var bottom: scala.Double
  /**
    * height value
    */
  var height: scala.Double
  /**
    * min(x coordinate, x coordinate + width dimension)
    */
  var left: scala.Double
  /**
    * max(x coordinate, x coordinate + width dimension)
    */
  var right: scala.Double
  /**
    * min(y coordinate, y coordinate + height dimension)
    */
  var top: scala.Double
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

object DOMRectReadOnly {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}

