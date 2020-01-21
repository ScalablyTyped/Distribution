package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSessions extends js.Object {
  var sessions: js.UndefOr[Double] = js.undefined
}

object AnonSessions {
  @scala.inline
  def apply(sessions: Int | Double = null): AnonSessions = {
    val __obj = js.Dynamic.literal()
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSessions]
  }
}

