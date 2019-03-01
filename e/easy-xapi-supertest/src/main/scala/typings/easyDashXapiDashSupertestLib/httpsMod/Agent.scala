package typings
package easyDashXapiDashSupertestLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  var maxSockets: scala.Double
  var requests: js.Any
  var sockets: js.Any
}

object Agent {
  @scala.inline
  def apply(maxSockets: scala.Double, requests: js.Any, sockets: js.Any): Agent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxSockets")(maxSockets)
    __obj.updateDynamic("requests")(requests)
    __obj.updateDynamic("sockets")(sockets)
    __obj.asInstanceOf[Agent]
  }
}

