package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSessionRequest extends js.Object {
  /** The session to create. */
  var session: js.UndefOr[Session] = js.undefined
}

object CreateSessionRequest {
  @scala.inline
  def apply(session: Session = null): CreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[CreateSessionRequest]
  }
}

