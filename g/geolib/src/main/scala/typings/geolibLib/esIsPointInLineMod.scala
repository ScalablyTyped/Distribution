package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/isPointInLine", JSImport.Namespace)
@js.native
object esIsPointInLineMod extends js.Object {
  def default(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineStart: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineEnd: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Boolean = js.native
}

