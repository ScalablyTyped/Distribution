package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSessionEntityTypeRequest. */
trait IGetSessionEntityTypeRequest extends js.Object {
  /** GetSessionEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetSessionEntityTypeRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined): IGetSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetSessionEntityTypeRequest]
  }
}

