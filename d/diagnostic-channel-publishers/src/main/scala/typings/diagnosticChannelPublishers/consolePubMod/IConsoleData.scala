package typings.diagnosticChannelPublishers.consolePubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsoleData extends js.Object {
  var message: String
  var stderr: js.UndefOr[Boolean] = js.undefined
}

object IConsoleData {
  @scala.inline
  def apply(message: String, stderr: js.UndefOr[Boolean] = js.undefined): IConsoleData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleData]
  }
}

