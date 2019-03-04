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
    log: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[LogUserEventResponse]
    ]
  ): UserEventsResource = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[UserEventsResource]
  }
}

