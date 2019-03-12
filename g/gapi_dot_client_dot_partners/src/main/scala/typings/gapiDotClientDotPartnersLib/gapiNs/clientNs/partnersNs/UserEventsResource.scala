package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEventsResource extends js.Object {
  /** Logs a user event. */
  def log(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[LogUserEventResponse]
}

object UserEventsResource {
  @scala.inline
  def apply(
    log: gapiDotClientDotPartnersLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[LogUserEventResponse]
  ): UserEventsResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[UserEventsResource]
  }
}

