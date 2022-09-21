package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends StObject {
  
  /**
    * Compares two Points
    */
  def equals(): Boolean = js.native
  def equals(other: Point): Boolean = js.native
  
  /**
    * The X coordinate
    */
  var x: Double = js.native
  
  /**
    * The Y coordinate
    */
  var y: Double = js.native
}
