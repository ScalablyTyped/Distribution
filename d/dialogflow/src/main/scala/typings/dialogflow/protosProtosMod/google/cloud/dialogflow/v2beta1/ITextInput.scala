package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(languageCode: String = null, text: String = null): ITextInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ITextInput]
  }
}

