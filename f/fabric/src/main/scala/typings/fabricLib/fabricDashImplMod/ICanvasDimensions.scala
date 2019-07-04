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
  var height: scala.Double | java.lang.String
  /**
  	 * Width of canvas element
  	 */
  var width: scala.Double | java.lang.String
}

object ICanvasDimensions {
  @scala.inline
  def apply(height: scala.Double | java.lang.String, width: scala.Double | java.lang.String): ICanvasDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICanvasDimensions]
  }
}

