package typings.easyDashXDashHeaders.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var address: String
  var family: String
  var port: Double
}

object AddressInfo {
  @scala.inline
  def apply(address: String, family: String, port: Double): AddressInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[AddressInfo]
  }
}

