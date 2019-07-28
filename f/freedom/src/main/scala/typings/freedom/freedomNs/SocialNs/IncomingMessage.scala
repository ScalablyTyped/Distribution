package typings.freedom.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Event for an incoming messages
trait IncomingMessage extends js.Object {
  // UserID/ClientID/status of user from whom the message comes from.
  var from: ClientState
  // Message contents.
  var message: String
}

object IncomingMessage {
  @scala.inline
  def apply(from: ClientState, message: String): IncomingMessage = {
    val __obj = js.Dynamic.literal(from = from, message = message)
  
    __obj.asInstanceOf[IncomingMessage]
  }
}

