package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFWVersion extends js.Object {
  var FWVersion: String
  var HWVersion: String
  var isLoggedIn: String
  var manufacturer: String
  var name: String
  var serial: String
}

object AnonFWVersion {
  @scala.inline
  def apply(
    FWVersion: String,
    HWVersion: String,
    isLoggedIn: String,
    manufacturer: String,
    name: String,
    serial: String
  ): AnonFWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion.asInstanceOf[js.Any], HWVersion = HWVersion.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFWVersion]
  }
}

