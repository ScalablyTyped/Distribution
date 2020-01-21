package typings.geometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectInit extends js.Object {
  /**
    * height value
    */
  var height: Double
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

object DOMRectInit {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): DOMRectInit = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRectInit]
  }
}

