package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEventsResource extends js.Object {
  /** Logs a user event. */
  def log(request: Anon_AccesstokenAlt): Request[LogUserEventResponse]
}

object UserEventsResource {
  @scala.inline
  def apply(log: Anon_AccesstokenAlt => Request[LogUserEventResponse]): UserEventsResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[UserEventsResource]
  }
}

