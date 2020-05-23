package typings.expressSession.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var session: js.UndefOr[Session] = js.undefined
  var sessionID: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(session: Session = null, sessionID: String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionID != null) __obj.updateDynamic("sessionID")(sessionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

