package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getGreatCircleBearing", JSImport.Namespace)
@js.native
object esGetGreatCircleBearingMod extends js.Object {
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  def default(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
}

