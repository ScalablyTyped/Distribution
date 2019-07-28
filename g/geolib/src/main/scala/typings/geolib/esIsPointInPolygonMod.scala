package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointInPolygon", JSImport.Namespace)
@js.native
object esIsPointInPolygonMod extends js.Object {
  def default(point: GeolibInputCoordinates, polygon: js.Array[GeolibInputCoordinates]): Boolean = js.native
}

