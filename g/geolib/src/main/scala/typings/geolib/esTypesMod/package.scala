package typings.geolib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTypesMod {
  import typings.geolib.Anon_Time

  type GeolibAltitudeInputValue = Double
  type GeolibDistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
  type GeolibGeoJSONPoint = js.Tuple3[
    GeolibLongitudeInputValue, 
    GeolibLatitudeInputValue, 
    js.UndefOr[GeolibAltitudeInputValue]
  ]
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates with Anon_Time
  type GeolibLatitudeInputValue = Double | String
  type GeolibLongitudeInputValue = Double | String
  type Timestamp = Double
  type UserInputCoordinates = GeolibInputLongitude with GeolibInputLatitude with GeolibInputAltitude
}
