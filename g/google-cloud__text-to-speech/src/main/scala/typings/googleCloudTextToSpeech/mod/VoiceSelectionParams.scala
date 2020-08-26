package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceSelectionParams extends js.Object {
  var languageCode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var ssmlGender: js.UndefOr[SsmlVoiceGender] = js.native
}

object VoiceSelectionParams {
  @scala.inline
  def apply(): VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceSelectionParams]
  }
  @scala.inline
  implicit class VoiceSelectionParamsOps[Self <: VoiceSelectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSsmlGender(value: SsmlVoiceGender): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsmlGender: Self = this.set("ssmlGender", js.undefined)
  }
  
}

