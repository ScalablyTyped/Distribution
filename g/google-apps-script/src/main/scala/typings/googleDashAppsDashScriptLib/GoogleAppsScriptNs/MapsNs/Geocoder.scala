package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocoder extends js.Object {
  def geocode(address: java.lang.String): js.Object = js.native
  def reverseGeocode(latitude: scala.Double, longitude: scala.Double): js.Object = js.native
  def reverseGeocode(
    swLatitude: scala.Double,
    swLongitude: scala.Double,
    neLatitude: scala.Double,
    neLongitude: scala.Double
  ): js.Object = js.native
  def setBounds(
    swLatitude: scala.Double,
    swLongitude: scala.Double,
    neLatitude: scala.Double,
    neLongitude: scala.Double
  ): Geocoder = js.native
  def setLanguage(language: java.lang.String): Geocoder = js.native
  def setRegion(region: java.lang.String): Geocoder = js.native
}

