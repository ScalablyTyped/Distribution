package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteEntityTypeRequest. */
trait IDeleteEntityTypeRequest extends js.Object {
  /** DeleteEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteEntityTypeRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IDeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteEntityTypeRequest]
  }
}

