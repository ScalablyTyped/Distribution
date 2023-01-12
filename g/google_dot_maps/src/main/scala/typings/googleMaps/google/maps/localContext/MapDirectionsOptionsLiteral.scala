package typings.googleMaps.google.maps.localContext

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Object literals are accepted in place of {@link
  * google.maps.localContext.MapDirectionsOptions} objects, as a convenience,
  * in many places. These are converted to {@link
  * google.maps.localContext.MapDirectionsOptions} objects when the Maps API
  * encounters them.
  */
trait MapDirectionsOptionsLiteral extends StObject {
  
  /**
    * Origin for directions and distance.
    */
  var origin: LatLng | LatLngLiteral
}
object MapDirectionsOptionsLiteral {
  
  inline def apply(origin: LatLng | LatLngLiteral): MapDirectionsOptionsLiteral = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDirectionsOptionsLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapDirectionsOptionsLiteral] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: LatLng | LatLngLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
