package typings
package freedomLib.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectInfo extends js.Object {
  var errcode: java.lang.String
  var message: java.lang.String
}

object DisconnectInfo {
  @scala.inline
  def apply(errcode: java.lang.String, message: java.lang.String): DisconnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errcode")(errcode)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[DisconnectInfo]
  }
}

