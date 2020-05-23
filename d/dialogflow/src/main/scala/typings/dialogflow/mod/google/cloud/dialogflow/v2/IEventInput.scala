package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EventInput. */
trait IEventInput extends js.Object {
  /** EventInput languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** EventInput name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** EventInput parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}

object IEventInput {
  @scala.inline
  def apply(
    languageCode: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    parameters: js.UndefOr[Null | IStruct] = js.undefined
  ): IEventInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parameters)) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInput]
  }
}

