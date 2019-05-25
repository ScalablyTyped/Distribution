package typings
package geolibLib.esOrderByDistanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/orderByDistance", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]
  ): js.Array[geolibLib.esTypesMod.GeolibInputCoordinates] = js.native
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates],
    distanceFn: DistanceFn
  ): js.Array[geolibLib.esTypesMod.GeolibInputCoordinates] = js.native
}

