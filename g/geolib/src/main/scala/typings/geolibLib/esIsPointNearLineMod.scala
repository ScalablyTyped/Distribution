package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointNearLine", JSImport.Namespace)
@js.native
object esIsPointNearLineMod extends js.Object {
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates,
    distance: scala.Double
  ): scala.Boolean = js.native
}

