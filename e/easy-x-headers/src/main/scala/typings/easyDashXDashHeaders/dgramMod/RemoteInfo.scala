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
    val __obj = js.Dynamic.literal(address = address, port = port, size = size)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

