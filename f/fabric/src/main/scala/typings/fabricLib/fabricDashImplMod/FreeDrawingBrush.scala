package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeDrawingBrush extends js.Object {
  /**
  	 * Can be any regular color value.
  	 */
  var color: java.lang.String
  /**
  	 * Brush width measured in pixels.
  	 */
  var width: scala.Double
}

object FreeDrawingBrush {
  @scala.inline
  def apply(color: java.lang.String, width: scala.Double): FreeDrawingBrush = {
    val __obj = js.Dynamic.literal(color = color, width = width)
  
    __obj.asInstanceOf[FreeDrawingBrush]
  }
}

