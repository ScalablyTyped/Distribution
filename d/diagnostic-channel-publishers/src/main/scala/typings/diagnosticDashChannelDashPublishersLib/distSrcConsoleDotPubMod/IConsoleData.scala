package typings
package diagnosticDashChannelDashPublishersLib.distSrcConsoleDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsoleData extends js.Object {
  var message: java.lang.String
  var stderr: js.UndefOr[scala.Boolean] = js.undefined
}

object IConsoleData {
  @scala.inline
  def apply(message: java.lang.String, stderr: js.UndefOr[scala.Boolean] = js.undefined): IConsoleData = {
    val __obj = js.Dynamic.literal(message = message)
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    __obj.asInstanceOf[IConsoleData]
  }
}

