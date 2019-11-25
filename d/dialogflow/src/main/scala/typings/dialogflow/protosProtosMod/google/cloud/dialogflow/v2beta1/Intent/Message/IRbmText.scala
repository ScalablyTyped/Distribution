package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

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
  def apply(rbmSuggestion: js.Array[IRbmSuggestion] = null, text: String = null): IRbmText = {
    val __obj = js.Dynamic.literal()
    if (rbmSuggestion != null) __obj.updateDynamic("rbmSuggestion")(rbmSuggestion.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmText]
  }
}

