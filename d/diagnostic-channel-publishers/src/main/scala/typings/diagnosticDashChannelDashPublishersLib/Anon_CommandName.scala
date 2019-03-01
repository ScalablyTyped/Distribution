package typings
package diagnosticDashChannelDashPublishersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandName extends js.Object {
  var commandName: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var failure: js.UndefOr[java.lang.String] = js.undefined
  var reply: js.UndefOr[js.Any] = js.undefined
}

object Anon_CommandName {
  @scala.inline
  def apply(
    commandName: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    failure: java.lang.String = null,
    reply: js.Any = null
  ): Anon_CommandName = {
    val __obj = js.Dynamic.literal()
    if (commandName != null) __obj.updateDynamic("commandName")(commandName)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (reply != null) __obj.updateDynamic("reply")(reply)
    __obj.asInstanceOf[Anon_CommandName]
  }
}

