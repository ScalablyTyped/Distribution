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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FWVersion")(FWVersion)
    __obj.updateDynamic("HWVersion")(HWVersion)
    __obj.updateDynamic("isLoggedIn")(isLoggedIn)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("serial")(serial)
    __obj.asInstanceOf[Anon_FWVersion]
  }
}

