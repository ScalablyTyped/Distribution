package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMessagesResource extends js.Object {
  /**
    * Logs a generic message from the client, such as
    * `Failed to render component`, `Profile page is running slow`,
    * `More than 500 users have accessed this result.`, etc.
    */
  def log(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[LogMessageResponse]
}

object ClientMessagesResource {
  @scala.inline
  def apply(
    log: gapiDotClientDotPartnersLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[LogMessageResponse]
  ): ClientMessagesResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ClientMessagesResource]
  }
}

