package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The absolute geographic location
  */
trait LocationPosition
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'altitude'.
    */
  var _altitude: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'latitude'.
    */
  var _latitude: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'longitude'.
    */
  var _longitude: js.UndefOr[Element] = js.undefined
  
  /**
    * Altitude with WGS84 datum
    */
  var altitude: js.UndefOr[decimal] = js.undefined
  
  /**
    * Latitude with WGS84 datum
    */
  var latitude: decimal
  
  /**
    * Longitude with WGS84 datum
    */
  var longitude: decimal
}
object LocationPosition {
  
  @scala.inline
  def apply(latitude: decimal, longitude: decimal): LocationPosition = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPosition]
  }
  
  @scala.inline
  implicit class LocationPositionMutableBuilder[Self <: LocationPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: decimal): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: decimal): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: decimal): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_altitude(value: Element): Self = StObject.set(x, "_altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_altitudeUndefined: Self = StObject.set(x, "_altitude", js.undefined)
    
    @scala.inline
    def set_latitude(value: Element): Self = StObject.set(x, "_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_latitudeUndefined: Self = StObject.set(x, "_latitude", js.undefined)
    
    @scala.inline
    def set_longitude(value: Element): Self = StObject.set(x, "_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_longitudeUndefined: Self = StObject.set(x, "_longitude", js.undefined)
  }
}
