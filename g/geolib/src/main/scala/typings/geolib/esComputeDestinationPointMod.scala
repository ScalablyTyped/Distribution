package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/computeDestinationPoint", JSImport.Namespace)
@js.native
object esComputeDestinationPointMod extends js.Object {
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double): Anon_Latitude = js.native
  def default(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Anon_Latitude = js.native
}

