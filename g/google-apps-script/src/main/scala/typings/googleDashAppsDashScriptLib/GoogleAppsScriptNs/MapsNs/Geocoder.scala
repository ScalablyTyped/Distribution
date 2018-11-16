package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocoder extends js.Object {
  def geocode(address: java.lang.String): js.Object = js.native
  def reverseGeocode(latitude: stdLib.Number, longitude: stdLib.Number): js.Object = js.native
  def reverseGeocode(
    swLatitude: stdLib.Number,
    swLongitude: stdLib.Number,
    neLatitude: stdLib.Number,
    neLongitude: stdLib.Number
  ): js.Object = js.native
  def setBounds(
    swLatitude: stdLib.Number,
    swLongitude: stdLib.Number,
    neLatitude: stdLib.Number,
    neLongitude: stdLib.Number
  ): Geocoder = js.native
  def setLanguage(language: java.lang.String): Geocoder = js.native
  def setRegion(region: java.lang.String): Geocoder = js.native
}

