package typings.googleGax.operationsMod.google.longrunning

import typings.googleGax.operationsMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a WaitOperationRequest. */
trait IWaitOperationRequest extends js.Object {
  /** WaitOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** WaitOperationRequest timeout */
  var timeout: js.UndefOr[IDuration | Null] = js.undefined
}

object IWaitOperationRequest {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    timeout: js.UndefOr[Null | IDuration] = js.undefined
  ): IWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitOperationRequest]
  }
}

