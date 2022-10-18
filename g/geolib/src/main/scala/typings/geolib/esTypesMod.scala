package typings.geolib

import typings.geolib.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibInts.`2`
    - typings.geolib.geolibStrings.alt
    - typings.geolib.geolibStrings.altitude
    - typings.geolib.geolibStrings.elevation
    - typings.geolib.geolibStrings.elev
  */
  trait AltitudeKeys extends StObject
  object AltitudeKeys {
    
    inline def `2`: typings.geolib.geolibInts.`2` = 2.asInstanceOf[typings.geolib.geolibInts.`2`]
    
    inline def alt: typings.geolib.geolibStrings.alt = "alt".asInstanceOf[typings.geolib.geolibStrings.alt]
    
    inline def altitude: typings.geolib.geolibStrings.altitude = "altitude".asInstanceOf[typings.geolib.geolibStrings.altitude]
    
    inline def elev: typings.geolib.geolibStrings.elev = "elev".asInstanceOf[typings.geolib.geolibStrings.elev]
    
    inline def elevation: typings.geolib.geolibStrings.elevation = "elevation".asInstanceOf[typings.geolib.geolibStrings.elevation]
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
    
    inline def `0`(): typings.geolib.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.`0`]
    }
    
    inline def Alt(): typings.geolib.anon.Alt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Alt]
    }
    
    inline def Elev(): typings.geolib.anon.Elev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Elev]
    }
    
    inline def Elevation(): typings.geolib.anon.Elevation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.geolib.anon.Elevation]
    }
  }
  
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates & Time
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.anon.Lat
    - typings.geolib.anon.LatitudeGeolibLatitudeInputValue
  */
  trait GeolibInputLatitude extends StObject
  object GeolibInputLatitude {
    
    inline def Lat(lat: GeolibLatitudeInputValue): typings.geolib.anon.Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lat]
    }
    
    inline def LatitudeGeolibLatitudeInputValue(latitude: GeolibLatitudeInputValue): typings.geolib.anon.LatitudeGeolibLatitudeInputValue = {
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
    
    inline def Lng(lng: GeolibLongitudeInputValue): typings.geolib.anon.Lng = {
      val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lng]
    }
    
    inline def Lon(lon: GeolibLongitudeInputValue): typings.geolib.anon.Lon = {
      val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.Lon]
    }
    
    inline def LongitudeGeolibLongitudeInputValue(longitude: GeolibLongitudeInputValue): typings.geolib.anon.LongitudeGeolibLongitudeInputValue = {
      val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geolib.anon.LongitudeGeolibLongitudeInputValue]
    }
  }
  
  type GeolibLatitudeInputValue = Double | String
  
  type GeolibLongitudeInputValue = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibInts.`1`
    - typings.geolib.geolibStrings.lat
    - typings.geolib.geolibStrings.latitude
  */
  trait LatitudeKeys extends StObject
  object LatitudeKeys {
    
    inline def `1`: typings.geolib.geolibInts.`1` = 1.asInstanceOf[typings.geolib.geolibInts.`1`]
    
    inline def lat: typings.geolib.geolibStrings.lat = "lat".asInstanceOf[typings.geolib.geolibStrings.lat]
    
    inline def latitude: typings.geolib.geolibStrings.latitude = "latitude".asInstanceOf[typings.geolib.geolibStrings.latitude]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.geolib.geolibInts.`0`
    - typings.geolib.geolibStrings.lng
    - typings.geolib.geolibStrings.lon
    - typings.geolib.geolibStrings.longitude
  */
  trait LongitudeKeys extends StObject
  object LongitudeKeys {
    
    inline def `0`: typings.geolib.geolibInts.`0` = 0.asInstanceOf[typings.geolib.geolibInts.`0`]
    
    inline def lng: typings.geolib.geolibStrings.lng = "lng".asInstanceOf[typings.geolib.geolibStrings.lng]
    
    inline def lon: typings.geolib.geolibStrings.lon = "lon".asInstanceOf[typings.geolib.geolibStrings.lon]
    
    inline def longitude: typings.geolib.geolibStrings.longitude = "longitude".asInstanceOf[typings.geolib.geolibStrings.longitude]
  }
  
  type Timestamp = Double
  
  type UserInputCoordinates = GeolibInputLongitude & GeolibInputLatitude & GeolibInputAltitude
}
