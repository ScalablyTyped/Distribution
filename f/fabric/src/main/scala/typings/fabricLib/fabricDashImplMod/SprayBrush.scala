package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "SprayBrush")
@js.native
class SprayBrush () extends BaseBrush {
  /**
  	 * Density of a spray (number of dots per chunk)
  	 */
  var density: scala.Double = js.native
  /**
  	 * Width of spray dots
  	 */
  var dotWidth: scala.Double = js.native
  /**
  	 * Width variance of spray dots
  	 */
  var dotWidthVariance: scala.Double = js.native
  /**
  	 * Whether overlapping dots (rectangles) should be removed (for performance reasons)
  	 */
  var optimizeOverlapping: scala.Boolean = js.native
  /**
  	 * Whether opacity of a dot should be random
  	 */
  var randomOpacity: scala.Boolean = js.native
  def addSprayChunk(pointer: js.Any): scala.Unit = js.native
}

