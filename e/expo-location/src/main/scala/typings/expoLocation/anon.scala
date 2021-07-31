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
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): Accuracy = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], accuracy = null, altitude = null, altitudeAccuracy = null, heading = null, speed = null)
      __obj.asInstanceOf[Accuracy]
    }
    
    @scala.inline
    implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
      
      @scala.inline
      def setAltitudeNull: Self = StObject.set(x, "altitude", null)
      
      @scala.inline
      def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingNull: Self = StObject.set(x, "heading", null)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedNull: Self = StObject.set(x, "speed", null)
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationServicesEnabled extends StObject {
    
    var locationServicesEnabled: Boolean
  }
  object LocationServicesEnabled {
    
    @scala.inline
    def apply(locationServicesEnabled: Boolean): LocationServicesEnabled = {
      val __obj = js.Dynamic.literal(locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationServicesEnabled]
    }
    
    @scala.inline
    implicit class LocationServicesEnabledMutableBuilder[Self <: LocationServicesEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationBody extends StObject {
    
    var notificationBody: String
    
    var notificationColor: js.UndefOr[String] = js.undefined
    
    var notificationTitle: String
  }
  object NotificationBody {
    
    @scala.inline
    def apply(notificationBody: String, notificationTitle: String): NotificationBody = {
      val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationBody]
    }
    
    @scala.inline
    implicit class NotificationBodyMutableBuilder[Self <: NotificationBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotificationBody(value: String): Self = StObject.set(x, "notificationBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationColor(value: String): Self = StObject.set(x, "notificationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationColorUndefined: Self = StObject.set(x, "notificationColor", js.undefined)
      
      @scala.inline
      def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<expo-location.expo-location/build/Location.types.LocationGeocodedLocation, 'latitude' | 'longitude'> */
  trait PickLocationGeocodedLocat extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object PickLocationGeocodedLocat {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): PickLocationGeocodedLocat = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickLocationGeocodedLocat]
    }
    
    @scala.inline
    implicit class PickLocationGeocodedLocatMutableBuilder[Self <: PickLocationGeocodedLocat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Remove extends StObject {
    
    def remove(): Unit
  }
  object Remove {
    
    @scala.inline
    def apply(remove: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Remove]
    }
    
    @scala.inline
    implicit class RemoveMutableBuilder[Self <: Remove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
