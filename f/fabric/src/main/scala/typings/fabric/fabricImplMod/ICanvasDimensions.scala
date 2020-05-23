package typings.fabric.fabricImplMod

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
  var height: Double | String
  /**
    * Width of canvas element
    */
  var width: Double | String
}

object ICanvasDimensions {
  @scala.inline
  def apply(height: Double | String, width: Double | String): ICanvasDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasDimensions]
  }
}

