package typings.diagnosticDashChannelDashPublishers.distSrcConsoleDotPubMod

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
    val __obj = js.Dynamic.literal(message = message)
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    __obj.asInstanceOf[IConsoleData]
  }
}

