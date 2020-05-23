package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteIntentRequest. */
trait IDeleteIntentRequest extends js.Object {
  /** DeleteIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteIntentRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IDeleteIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteIntentRequest]
  }
}

