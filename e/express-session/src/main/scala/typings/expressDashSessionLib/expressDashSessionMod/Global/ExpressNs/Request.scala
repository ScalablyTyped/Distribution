package typings
package expressDashSessionLib.expressDashSessionMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var session: js.UndefOr[Session] = js.undefined
  var sessionID: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply(session: Session = null, sessionID: java.lang.String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionID != null) __obj.updateDynamic("sessionID")(sessionID)
    __obj.asInstanceOf[Request]
  }
}

