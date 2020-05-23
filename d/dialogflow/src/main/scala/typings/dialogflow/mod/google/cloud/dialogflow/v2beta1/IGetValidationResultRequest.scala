package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetValidationResultRequest. */
trait IGetValidationResultRequest extends js.Object {
  /** GetValidationResultRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** GetValidationResultRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IGetValidationResultRequest {
  @scala.inline
  def apply(
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IGetValidationResultRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetValidationResultRequest]
  }
}

