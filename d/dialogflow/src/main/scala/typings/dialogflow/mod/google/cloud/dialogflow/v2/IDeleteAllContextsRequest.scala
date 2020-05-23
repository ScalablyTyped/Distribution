package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteAllContextsRequest. */
trait IDeleteAllContextsRequest extends js.Object {
  /** DeleteAllContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IDeleteAllContextsRequest {
  @scala.inline
  def apply(parent: js.UndefOr[Null | String] = js.undefined): IDeleteAllContextsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteAllContextsRequest]
  }
}

