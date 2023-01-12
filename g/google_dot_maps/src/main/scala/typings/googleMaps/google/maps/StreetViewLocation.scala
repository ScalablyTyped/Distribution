package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a location in the Street View panorama.
  */
trait StreetViewLocation extends StObject {
  
  /**
    * A localized string describing the location.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latlng of the panorama.
    */
  var latLng: js.UndefOr[LatLng | Null] = js.undefined
  
  /**
    * A unique identifier for the panorama. This is stable within a session but
    * unstable across sessions.
    */
  var pano: String
  
  /**
    * Short description of the location.
    */
  var shortDescription: js.UndefOr[String | Null] = js.undefined
}
object StreetViewLocation {
  
  inline def apply(pano: String): StreetViewLocation = {
    val __obj = js.Dynamic.literal(pano = pano.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewLocation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngNull: Self = StObject.set(x, "latLng", null)
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionNull: Self = StObject.set(x, "shortDescription", null)
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
