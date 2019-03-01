package typings
package easyDashXDashHeadersLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: java.lang.String
  var port: scala.Double
  var size: scala.Double
}

object RemoteInfo {
  @scala.inline
  def apply(address: java.lang.String, port: scala.Double, size: scala.Double): RemoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[RemoteInfo]
  }
}

