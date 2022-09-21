package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer that illustrates the locations where Street View is available.
  */
@js.native
trait StreetViewCoverageLayer
  extends StObject
     with MVCObject {
  
  /**
    * Returns the map on which this layer is displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Renders the layer on the specified map. If the map is set to null, the
    * layer will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}
