package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/computeDestinationPoint", JSImport.Namespace)
@js.native
object computeDestinationPointMod extends js.Object {
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = js.native
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = js.native
}

