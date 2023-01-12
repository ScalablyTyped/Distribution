package typings.expoLocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationServicesEnabled extends StObject {
    
    var locationServicesEnabled: Boolean
  }
  object LocationServicesEnabled {
    
    inline def apply(locationServicesEnabled: Boolean): LocationServicesEnabled = {
      val __obj = js.Dynamic.literal(locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationServicesEnabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationServicesEnabled] (val x: Self) extends AnyVal {
      
      inline def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<expo-location.expo-location/build/Location.types.LocationGeocodedLocation, 'latitude' | 'longitude'> */
  trait PickLocationGeocodedLocat extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object PickLocationGeocodedLocat {
    
    inline def apply(latitude: Double, longitude: Double): PickLocationGeocodedLocat = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickLocationGeocodedLocat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickLocationGeocodedLocat] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
}
