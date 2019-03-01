package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Event for an incoming messages
trait IncomingMessage extends js.Object {
  // UserID/ClientID/status of user from whom the message comes from.
  var from: ClientState
  // Message contents.
  var message: java.lang.String
}

object IncomingMessage {
  @scala.inline
  def apply(from: ClientState, message: java.lang.String): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IncomingMessage]
  }
}

