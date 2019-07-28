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
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender)
    __obj.asInstanceOf[VoiceSelectionParams]
  }
}

