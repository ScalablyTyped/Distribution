package typings.dialogflow.mod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteOperationRequest. */
trait IDeleteOperationRequest extends js.Object {
  /** DeleteOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteOperationRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IDeleteOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteOperationRequest]
  }
}

