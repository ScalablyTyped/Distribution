package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointWithinRadius", JSImport.Namespace)
@js.native
object esIsPointWithinRadiusMod extends js.Object {
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    center: geolibLib.esTypesMod.GeolibInputCoordinates,
    radius: scala.Double
  ): scala.Boolean = js.native
}

