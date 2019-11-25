package typings.easyDashXDashHeaders.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: String
  var port: Double
  var size: Double
}

object RemoteInfo {
  @scala.inline
  def apply(address: String, port: Double, size: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

