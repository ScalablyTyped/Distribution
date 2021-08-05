package typings.expoLocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accuracy extends StObject {
    
    var accuracy: Double | Null
    
    var altitude: Double | Null
    
    var altitudeAccuracy: Double | Null
    
    var heading: Double | Null
    
    var latitude: Double
    
    var longitude: Double
    
    var speed: Double | Null
  }
  object Accuracy {
    
    inline def apply(latitude: Double, longitude: Double): Accuracy = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], accuracy = null, altitude = null, altitudeAccuracy = null, heading = null, speed = null)
      __obj.asInstanceOf[Accuracy]
    }
    
    extension [Self <: Accuracy](x: Self) {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
      
      inline def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
      
      inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
      
      inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingNull: Self = StObject.set(x, "heading", null)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedNull: Self = StObject.set(x, "speed", null)
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
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
    
    extension [Self <: LocationServicesEnabled](x: Self) {
      
      inline def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationBody extends StObject {
    
    var notificationBody: String
    
    var notificationColor: js.UndefOr[String] = js.undefined
    
    var notificationTitle: String
  }
  object NotificationBody {
    
    inline def apply(notificationBody: String, notificationTitle: String): NotificationBody = {
      val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationBody]
    }
    
    extension [Self <: NotificationBody](x: Self) {
      
      inline def setNotificationBody(value: String): Self = StObject.set(x, "notificationBody", value.asInstanceOf[js.Any])
      
      inline def setNotificationColor(value: String): Self = StObject.set(x, "notificationColor", value.asInstanceOf[js.Any])
      
      inline def setNotificationColorUndefined: Self = StObject.set(x, "notificationColor", js.undefined)
      
      inline def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
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
    
    extension [Self <: PickLocationGeocodedLocat](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Remove extends StObject {
    
    def remove(): Unit
  }
  object Remove {
    
    inline def apply(remove: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
