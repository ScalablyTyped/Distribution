package typings.geolib

import typings.geolib.esTypesMod.GeolibDistanceFn
import typings.geolib.esTypesMod.GeolibInputCoordinatesWithTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getSpeed", JSImport.Namespace)
@js.native
object esGetSpeedMod extends js.Object {
  def default(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  def default(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
}

