package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

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
  def apply(
    displayText: js.UndefOr[Null | String] = js.undefined,
    ssml: js.UndefOr[Null | String] = js.undefined,
    textToSpeech: js.UndefOr[Null | String] = js.undefined
  ): ISimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayText)) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (!js.isUndefined(ssml)) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (!js.isUndefined(textToSpeech)) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleResponse]
  }
}

