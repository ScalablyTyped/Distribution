package typings.geolib

import typings.geolib.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibNumbers.`2`
    - typings.geolib.geolibStrings.alt
    - typings.geolib.geolibStrings.altitude
    - typings.geolib.geolibStrings.elevation
    - typings.geolib.geolibStrings.elev
  */
  trait AltitudeKeys extends StObject
  object AltitudeKeys {
    
    @scala.inline
    def `2`: typings.geolib.geolibNumbers.`2` = 2.asInstanceOf[typings.geolib.geolibNumbers.`2`]
    
    @scala.inline
    def alt: typings.geolib.geolibStrings.alt = "alt".asInstanceOf[typings.geolib.geolibStrings.alt]
    
    @scala.inline
    def altitude: typings.geolib.geolibStrings.altitude = "altitude".asInstanceOf[typings.geolib.geolibStrings.altitude]
    
    @scala.inline
    def elev: typings.geolib.geolibStrings.elev = "elev".asInstanceOf[typings.geolib.geolibStrings.elev]
    
    @scala.inline
    def elevation: typings.geolib.geolibStrings.elevation = "elevation".asInstanceOf[typings.geolib.geolibStrings.elevation]
  }
  
  type GeolibAltitudeInputValue = Double
  
  type GeolibDistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
  
  type GeolibGeoJSONPoint = js.Tuple3[
    GeolibLongitudeInputValue, 
    GeolibLatitudeInputValue, 
    js.UndefOr[GeolibAltitudeInputValue]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.anon.Alt
    - typings.geolib.anon.`0`
    - typings.geolib.anon.Elevation
    - typings.geolib.anon.Elev
  */
  trait GeolibInputAltitude extends StObject
  object GeolibInputAltitude {
    
    @scala.inline
    def `0`(): typings.geolib.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.`0`]
    }
    
    @scala.inline
    def Alt(): typings.geolib.anon.Alt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Alt]
    }
    
    @scala.inline
    def Elev(): typings.geolib.anon.Elev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Elev]
    }
    
    @scala.inline
    def Elevation(): typings.geolib.anon.Elevation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Elevation]
    }
  }
  
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates with Time
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.anon.Lat
    - typings.geolib.anon.LatitudeGeolibLatitudeInputValue
  */
  trait GeolibInputLatitude extends StObject
  object GeolibInputLatitude {
    
    @scala.inline
    def Lat(lat: GeolibLatitudeInputValue): typings.geolib.anon.Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lat]
    }
    
    @scala.inline
    def LatitudeGeolibLatitudeInputValue(latitude: GeolibLatitudeInputValue): typings.geolib.anon.LatitudeGeolibLatitudeInputValue = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.LatitudeGeolibLatitudeInputValue]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.anon.Lng
    - typings.geolib.anon.Lon
    - typings.geolib.anon.LongitudeGeolibLongitudeInputValue
  */
  trait GeolibInputLongitude extends StObject
  object GeolibInputLongitude {
    
    @scala.inline
    def Lng(lng: GeolibLongitudeInputValue): typings.geolib.anon.Lng = {
      val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lng]
    }
    
    @scala.inline
    def Lon(lon: GeolibLongitudeInputValue): typings.geolib.anon.Lon = {
      val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lon]
    }
    
    @scala.inline
    def LongitudeGeolibLongitudeInputValue(longitude: GeolibLongitudeInputValue): typings.geolib.anon.LongitudeGeolibLongitudeInputValue = {
      val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.LongitudeGeolibLongitudeInputValue]
    }
  }
  
  type GeolibLatitudeInputValue = Double | String
  
  type GeolibLongitudeInputValue = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibNumbers.`1`
    - typings.geolib.geolibStrings.lat
    - typings.geolib.geolibStrings.latitude
  */
  trait LatitudeKeys extends StObject
  object LatitudeKeys {
    
    @scala.inline
    def `1`: typings.geolib.geolibNumbers.`1` = 1.asInstanceOf[typings.geolib.geolibNumbers.`1`]
    
    @scala.inline
    def lat: typings.geolib.geolibStrings.lat = "lat".asInstanceOf[typings.geolib.geolibStrings.lat]
    
    @scala.inline
    def latitude: typings.geolib.geolibStrings.latitude = "latitude".asInstanceOf[typings.geolib.geolibStrings.latitude]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibNumbers.`0`
    - typings.geolib.geolibStrings.lng
    - typings.geolib.geolibStrings.lon
    - typings.geolib.geolibStrings.longitude
  */
  trait LongitudeKeys extends StObject
  object LongitudeKeys {
    
    @scala.inline
    def `0`: typings.geolib.geolibNumbers.`0` = 0.asInstanceOf[typings.geolib.geolibNumbers.`0`]
    
    @scala.inline
    def lng: typings.geolib.geolibStrings.lng = "lng".asInstanceOf[typings.geolib.geolibStrings.lng]
    
    @scala.inline
    def lon: typings.geolib.geolibStrings.lon = "lon".asInstanceOf[typings.geolib.geolibStrings.lon]
    
    @scala.inline
    def longitude: typings.geolib.geolibStrings.longitude = "longitude".asInstanceOf[typings.geolib.geolibStrings.longitude]
  }
  
  type Timestamp = Double
  
  type UserInputCoordinates = GeolibInputLongitude with GeolibInputLatitude with GeolibInputAltitude
}
