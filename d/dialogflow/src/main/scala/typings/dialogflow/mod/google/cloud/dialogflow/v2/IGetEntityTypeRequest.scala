package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetEntityTypeRequest. */
trait IGetEntityTypeRequest extends js.Object {
  /** GetEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** GetEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetEntityTypeRequest {
  @scala.inline
  def apply(
    languageCode: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IGetEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetEntityTypeRequest]
  }
}

