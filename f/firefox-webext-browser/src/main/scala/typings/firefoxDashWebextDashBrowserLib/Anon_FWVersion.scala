package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FWVersion extends js.Object {
  var FWVersion: java.lang.String
  var HWVersion: java.lang.String
  var isLoggedIn: java.lang.String
  var manufacturer: java.lang.String
  var name: java.lang.String
  var serial: java.lang.String
}

object Anon_FWVersion {
  @scala.inline
  def apply(
    FWVersion: java.lang.String,
    HWVersion: java.lang.String,
    isLoggedIn: java.lang.String,
    manufacturer: java.lang.String,
    name: java.lang.String,
    serial: java.lang.String
  ): Anon_FWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion, HWVersion = HWVersion, isLoggedIn = isLoggedIn, manufacturer = manufacturer, name = name, serial = serial)
  
    __obj.asInstanceOf[Anon_FWVersion]
  }
}

