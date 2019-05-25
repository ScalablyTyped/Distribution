package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointInPolygon", JSImport.Namespace)
@js.native
object esIsPointInPolygonMod extends js.Object {
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    polygon: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]
  ): scala.Boolean = js.native
}

