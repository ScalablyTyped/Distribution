package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getPathLength", JSImport.Namespace)
@js.native
object esGetPathLengthMod extends js.Object {
  def default(points: js.Array[GeolibInputCoordinates]): Double = js.native
  def default(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = js.native
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}

