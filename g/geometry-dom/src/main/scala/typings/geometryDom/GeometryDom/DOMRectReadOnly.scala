package typings.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  /**
    * max(y coordinate, y coordinate + height dimension)
    */
  var bottom: Double
  /**
    * height value
    */
  var height: Double
  /**
    * min(x coordinate, x coordinate + width dimension)
    */
  var left: Double
  /**
    * max(x coordinate, x coordinate + width dimension)
    */
  var right: Double
  /**
    * min(y coordinate, y coordinate + height dimension)
    */
  var top: Double
  /**
    * width value
    */
  var width: Double
  /**
    * x coordinate
    */
  var x: Double
  /**
    * y coordinate
    */
  var y: Double
}

object DOMRectReadOnly {
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
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}

