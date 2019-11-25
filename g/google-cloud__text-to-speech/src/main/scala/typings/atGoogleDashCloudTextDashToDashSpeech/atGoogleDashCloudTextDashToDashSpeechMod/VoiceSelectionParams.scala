package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSelectionParams extends js.Object {
  var languageCode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ssmlGender: js.UndefOr[SsmlVoiceGender] = js.undefined
}

object VoiceSelectionParams {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, ssmlGender: SsmlVoiceGender = null): VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSelectionParams]
  }
}

