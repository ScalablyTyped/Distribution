package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getDistance", JSImport.Namespace)
@js.native
object esGetDistanceMod extends js.Object {
  def default(from: geolibLib.esTypesMod.GeolibInputCoordinates, to: geolibLib.esTypesMod.GeolibInputCoordinates): scala.Double = js.native
  def default(
    from: geolibLib.esTypesMod.GeolibInputCoordinates,
    to: geolibLib.esTypesMod.GeolibInputCoordinates,
    accuracy: scala.Double
  ): scala.Double = js.native
}

