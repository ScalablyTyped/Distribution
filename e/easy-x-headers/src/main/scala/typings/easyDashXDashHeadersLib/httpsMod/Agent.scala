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

@JSImport("https", "Agent")
@js.native
class AgentCls () extends Agent {
  def this(options: RequestOptions) = this()
  /* CompleteClass */
  override var maxSockets: scala.Double = js.native
  /* CompleteClass */
  override var requests: js.Any = js.native
  /* CompleteClass */
  override var sockets: js.Any = js.native
}

object Agent {
  @scala.inline
  def apply(maxSockets: scala.Double, requests: js.Any, sockets: js.Any): Agent = {
    val __obj = js.Dynamic.literal(maxSockets = maxSockets, requests = requests, sockets = sockets)
  
    __obj.asInstanceOf[Agent]
  }
}

