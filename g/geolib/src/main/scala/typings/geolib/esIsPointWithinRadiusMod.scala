package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointWithinRadius", JSImport.Namespace)
@js.native
object esIsPointWithinRadiusMod extends js.Object {
  def default(point: GeolibInputCoordinates, center: GeolibInputCoordinates, radius: Double): Boolean = js.native
}

