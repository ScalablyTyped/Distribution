package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/orderByDistance", JSImport.Namespace)
@js.native
object orderByDistanceMod extends js.Object {
  def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = js.native
  def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): js.Array[GeolibInputCoordinates] = js.native
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}

