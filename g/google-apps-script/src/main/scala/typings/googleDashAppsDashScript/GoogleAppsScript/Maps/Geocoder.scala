package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocoder extends js.Object {
  def geocode(address: String): js.Any = js.native
  def reverseGeocode(latitude: Double, longitude: Double): js.Any = js.native
  def reverseGeocode(swLatitude: Double, swLongitude: Double, neLatitude: Double, neLongitude: Double): js.Any = js.native
  def setBounds(swLatitude: Double, swLongitude: Double, neLatitude: Double, neLongitude: Double): Geocoder = js.native
  def setLanguage(language: String): Geocoder = js.native
  def setRegion(region: String): Geocoder = js.native
}

