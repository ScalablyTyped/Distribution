package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetContextRequest. */
trait IGetContextRequest extends js.Object {
  /** GetContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetContextRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IGetContextRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetContextRequest]
  }
}

