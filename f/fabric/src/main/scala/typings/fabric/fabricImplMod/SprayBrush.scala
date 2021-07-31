package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "SprayBrush")
@js.native
class SprayBrush () extends BaseBrush {
  
  def addSprayChunk(pointer: js.Any): Unit = js.native
  
  /**
    * Density of a spray (number of dots per chunk)
    */
  var density: Double = js.native
  
  /**
    * Width of spray dots
    */
  var dotWidth: Double = js.native
  
  /**
    * Width variance of spray dots
    */
  var dotWidthVariance: Double = js.native
  
  /**
    * Whether overlapping dots (rectangles) should be removed (for performance reasons)
    */
  var optimizeOverlapping: Boolean = js.native
  
  /**
    * Whether opacity of a dot should be random
    */
  var randomOpacity: Boolean = js.native
}
