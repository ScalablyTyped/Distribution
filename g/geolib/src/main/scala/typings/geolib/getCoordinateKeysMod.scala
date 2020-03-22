package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
@js.native
object getCoordinateKeysMod extends js.Object {
  def default(point: GeolibInputCoordinates): AnonAltitudeLatitude | AnonLatitudeLongitude = js.native
  def default(point: GeolibInputCoordinates, keysToLookup: AnonAltitude): AnonAltitudeLatitude | AnonLatitudeLongitude = js.native
}

