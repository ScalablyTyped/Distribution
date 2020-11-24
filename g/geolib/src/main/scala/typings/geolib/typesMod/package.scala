package typings.geolib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type GeolibAltitudeInputValue = scala.Double
  
  type GeolibDistanceFn = js.Function2[
    /* point */ typings.geolib.typesMod.GeolibInputCoordinates, 
    /* dest */ typings.geolib.typesMod.GeolibInputCoordinates, 
    scala.Double
  ]
  
  type GeolibGeoJSONPoint = js.Tuple3[
    typings.geolib.typesMod.GeolibLongitudeInputValue, 
    typings.geolib.typesMod.GeolibLatitudeInputValue, 
    js.UndefOr[typings.geolib.typesMod.GeolibAltitudeInputValue]
  ]
  
  type GeolibInputCoordinates = typings.geolib.typesMod.UserInputCoordinates | typings.geolib.typesMod.GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = typings.geolib.typesMod.GeolibInputCoordinates with typings.geolib.anon.Time
  
  type GeolibLatitudeInputValue = scala.Double | java.lang.String
  
  type GeolibLongitudeInputValue = scala.Double | java.lang.String
  
  type Timestamp = scala.Double
  
  type UserInputCoordinates = typings.geolib.typesMod.GeolibInputLongitude with typings.geolib.typesMod.GeolibInputLatitude with typings.geolib.typesMod.GeolibInputAltitude
}
