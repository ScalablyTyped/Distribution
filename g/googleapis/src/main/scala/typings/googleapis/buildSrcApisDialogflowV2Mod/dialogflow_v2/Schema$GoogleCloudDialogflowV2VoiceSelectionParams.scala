package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of which voice to use for speech synthesis.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2VoiceSelectionParams extends js.Object {
  /**
    * Optional. The name of the voice. If not set, the service will choose a
    * voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The preferred gender of the voice. If not set, the service will
    * choose a voice based on the other parameters such as language_code and
    * name. Note that this is only a preference, not requirement. If a voice of
    * the appropriate gender is not available, the synthesizer should
    * substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2VoiceSelectionParams {
  @scala.inline
  def apply(name: String = null, ssmlGender: String = null): Schema$GoogleCloudDialogflowV2VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2VoiceSelectionParams]
  }
}

