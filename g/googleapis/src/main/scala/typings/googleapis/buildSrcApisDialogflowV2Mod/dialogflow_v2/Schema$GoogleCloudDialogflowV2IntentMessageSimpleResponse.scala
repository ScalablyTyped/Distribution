package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The simple response message containing speech or text.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse extends js.Object {
  /**
    * Optional. The text to display.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. Structured spoken
    * response to the user in the SSML format. Mutually exclusive with
    * text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. The plain text of the
    * speech output. Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
}

