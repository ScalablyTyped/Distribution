package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLocation extends StObject {
  
  /**
    * The latitude location of the UI component.
    */
  var lat: Double
  
  /**
    * The longitude location of the UI component.
    */
  var lng: Double
}
object MapLocation {
  
  inline def apply(lat: Double, lng: Double): MapLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLocation]
  }
  
  extension [Self <: MapLocation](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
