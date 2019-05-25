package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getPreciseDistance", JSImport.Namespace)
@js.native
object esGetPreciseDistanceMod extends js.Object {
  def default(
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
  def default(
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates,
    accuracy: scala.Double
  ): scala.Double = js.native
}

