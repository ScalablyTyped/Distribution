package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FWVersion extends js.Object {
  var FWVersion: String
  var HWVersion: String
  var isLoggedIn: String
  var manufacturer: String
  var name: String
  var serial: String
}

object Anon_FWVersion {
  @scala.inline
  def apply(
    FWVersion: String,
    HWVersion: String,
    isLoggedIn: String,
    manufacturer: String,
    name: String,
    serial: String
  ): Anon_FWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion, HWVersion = HWVersion, isLoggedIn = isLoggedIn, manufacturer = manufacturer, name = name, serial = serial)
  
    __obj.asInstanceOf[Anon_FWVersion]
  }
}

