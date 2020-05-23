package typings.geolib

import typings.geolib.anon.Longitude
import typings.geolib.geolibBooleans.`false`
import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCenter", JSImport.Namespace)
@js.native
object getCenterMod extends js.Object {
  def default(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = js.native
}

