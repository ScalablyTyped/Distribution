package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TextInput. */
trait ITextInput extends js.Object {
  /** TextInput languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** TextInput text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object ITextInput {
  @scala.inline
  def apply(
    languageCode: js.UndefOr[Null | String] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined
  ): ITextInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextInput]
  }
}

