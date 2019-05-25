package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getSpeed", JSImport.Namespace)
@js.native
object esGetSpeedMod extends js.Object {
  def default(
    start: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    end: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime
  ): scala.Double = js.native
  def default(
    start: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    end: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    distanceFn: geolibLib.esTypesMod.GeolibDistanceFn
  ): scala.Double = js.native
}

