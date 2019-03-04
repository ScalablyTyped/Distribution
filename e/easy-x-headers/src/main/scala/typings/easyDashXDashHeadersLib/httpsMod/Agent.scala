package typings
package easyDashXDashHeadersLib.httpsMod

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
    val __obj = js.Dynamic.literal(maxSockets = maxSockets, requests = requests, sockets = sockets)
  
    __obj.asInstanceOf[Agent]
  }
}

