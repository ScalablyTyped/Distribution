package typings.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandName extends js.Object {
  var commandName: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var failure: js.UndefOr[String] = js.undefined
  var reply: js.UndefOr[js.Any] = js.undefined
}

object CommandName {
  @scala.inline
  def apply(
    commandName: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    failure: String = null,
    reply: js.Any = null
  ): CommandName = {
    val __obj = js.Dynamic.literal()
    if (commandName != null) __obj.updateDynamic("commandName")(commandName.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandName]
  }
}

