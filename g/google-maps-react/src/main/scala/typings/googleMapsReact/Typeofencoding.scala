package typings.googleMapsReact

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.MVCArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofencoding extends js.Object {
  def decodePath(encodedPath: String): js.Array[LatLng] = js.native
  def encodePath(path: js.Array[LatLng]): String = js.native
  def encodePath(path: MVCArray[LatLng]): String = js.native
}

