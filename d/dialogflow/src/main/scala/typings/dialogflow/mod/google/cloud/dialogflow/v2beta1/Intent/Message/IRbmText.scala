package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmText. */
trait IRbmText extends js.Object {
  /** RbmText rbmSuggestion */
  var rbmSuggestion: js.UndefOr[js.Array[IRbmSuggestion] | Null] = js.undefined
  /** RbmText text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object IRbmText {
  @scala.inline
  def apply(
    rbmSuggestion: js.UndefOr[Null | js.Array[IRbmSuggestion]] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined
  ): IRbmText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rbmSuggestion)) __obj.updateDynamic("rbmSuggestion")(rbmSuggestion.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmText]
  }
}

