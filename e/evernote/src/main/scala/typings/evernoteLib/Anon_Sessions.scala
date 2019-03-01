package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sessions extends js.Object {
  var sessions: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Sessions {
  @scala.inline
  def apply(sessions: scala.Int | scala.Double = null): Anon_Sessions = {
    val __obj = js.Dynamic.literal()
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Sessions]
  }
}

