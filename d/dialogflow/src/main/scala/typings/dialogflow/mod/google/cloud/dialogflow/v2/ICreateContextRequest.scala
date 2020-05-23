package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateContextRequest. */
trait ICreateContextRequest extends js.Object {
  /** CreateContextRequest context */
  var context: js.UndefOr[IContext | Null] = js.undefined
  /** CreateContextRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateContextRequest {
  @scala.inline
  def apply(
    context: js.UndefOr[Null | IContext] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): ICreateContextRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateContextRequest]
  }
}

