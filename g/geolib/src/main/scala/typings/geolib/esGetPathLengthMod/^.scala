package typings.geolib.esGetPathLengthMod

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getPathLength", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(points: js.Array[GeolibInputCoordinates]): Double = js.native
  def default(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = js.native
}

