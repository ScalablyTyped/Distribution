package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeDrawingBrush extends js.Object {
  /**
  	 * Can be any regular color value.
  	 */
  var color: String
  /**
  	 * Brush width measured in pixels.
  	 */
  var width: Double
}

object FreeDrawingBrush {
  @scala.inline
  def apply(color: String, width: Double): FreeDrawingBrush = {
    val __obj = js.Dynamic.literal(color = color, width = width)
  
    __obj.asInstanceOf[FreeDrawingBrush]
  }
}

