package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SimpleResponse. */
trait ISimpleResponse extends js.Object {
  /** SimpleResponse displayText */
  var displayText: js.UndefOr[String | Null] = js.undefined
  /** SimpleResponse ssml */
  var ssml: js.UndefOr[String | Null] = js.undefined
  /** SimpleResponse textToSpeech */
  var textToSpeech: js.UndefOr[String | Null] = js.undefined
}

object ISimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): ISimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech)
    __obj.asInstanceOf[ISimpleResponse]
  }
}

