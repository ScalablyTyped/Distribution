package typings.googleGax.operationsMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetOperationRequest. */
trait IGetOperationRequest extends js.Object {
  /** GetOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetOperationRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IGetOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetOperationRequest]
  }
}

