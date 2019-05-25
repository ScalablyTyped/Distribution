package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTypesMod {
  type GeolibAltitudeInputValue = scala.Double
  type GeolibDistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, scala.Double]
  type GeolibGeoJSONPoint = js.Tuple3[
    GeolibLongitudeInputValue, 
    GeolibLatitudeInputValue, 
    js.UndefOr[GeolibAltitudeInputValue]
  ]
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates with geolibLib.Anon_Time
  type GeolibLatitudeInputValue = scala.Double | java.lang.String
  type GeolibLongitudeInputValue = scala.Double | java.lang.String
  type Timestamp = scala.Double
  type UserInputCoordinates = GeolibInputLongitude with GeolibInputLatitude with GeolibInputAltitude
}
