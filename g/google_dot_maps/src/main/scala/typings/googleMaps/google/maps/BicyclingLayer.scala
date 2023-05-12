package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BicyclingLayer
  extends StObject
     with MVCObject {
  
  /**
    * Returns the map on which this layer is displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Renders the layer on the specified map. If map is set to
    * <code>null</code>, the layer will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}
