package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointInPolygon", JSImport.Namespace)
@js.native
object isPointInPolygonMod extends js.Object {
  def default(point: GeolibInputCoordinates, polygon: js.Array[GeolibInputCoordinates]): Boolean = js.native
}

