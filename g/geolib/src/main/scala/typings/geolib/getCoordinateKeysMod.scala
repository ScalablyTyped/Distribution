package typings.geolib

import typings.geolib.anon.Altitude
import typings.geolib.anon.AltitudeLatitude
import typings.geolib.anon.LatitudeLongitude
import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
@js.native
object getCoordinateKeysMod extends js.Object {
  def default(point: GeolibInputCoordinates): AltitudeLatitude | LatitudeLongitude = js.native
  def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude | LatitudeLongitude = js.native
}

