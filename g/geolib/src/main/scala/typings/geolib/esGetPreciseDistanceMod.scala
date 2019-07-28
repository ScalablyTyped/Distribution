package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getPreciseDistance", JSImport.Namespace)
@js.native
object esGetPreciseDistanceMod extends js.Object {
  def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = js.native
  def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = js.native
}

