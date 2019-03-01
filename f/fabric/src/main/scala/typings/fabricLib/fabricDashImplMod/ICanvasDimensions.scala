package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Canvas Interfaces
//////////////////////////////////////////////////////////////////////////////
trait ICanvasDimensions extends js.Object {
  /**
  	 * Height of canvas element
  	 */
  var height: scala.Double
  /**
  	 * Width of canvas element
  	 */
  var width: scala.Double
}

object ICanvasDimensions {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ICanvasDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ICanvasDimensions]
  }
}

