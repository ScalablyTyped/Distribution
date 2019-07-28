package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceParams extends js.Object {
  var disableMemory: js.UndefOr[Boolean] = js.undefined
  var disableStack: js.UndefOr[Boolean] = js.undefined
  var disableStorage: js.UndefOr[Boolean] = js.undefined
}

object TraceParams {
  @scala.inline
  def apply(
    disableMemory: js.UndefOr[Boolean] = js.undefined,
    disableStack: js.UndefOr[Boolean] = js.undefined,
    disableStorage: js.UndefOr[Boolean] = js.undefined
  ): TraceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableMemory)) __obj.updateDynamic("disableMemory")(disableMemory)
    if (!js.isUndefined(disableStack)) __obj.updateDynamic("disableStack")(disableStack)
    if (!js.isUndefined(disableStorage)) __obj.updateDynamic("disableStorage")(disableStorage)
    __obj.asInstanceOf[TraceParams]
  }
}

