package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSelectionParams extends js.Object {
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ssmlGender: js.UndefOr[SsmlVoiceGender] = js.undefined
}

object VoiceSelectionParams {
  @scala.inline
  def apply(
    languageCode: java.lang.String = null,
    name: java.lang.String = null,
    ssmlGender: SsmlVoiceGender = null
  ): VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender)
    __obj.asInstanceOf[VoiceSelectionParams]
  }
}

