package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Voice extends js.Object {
  var language_codes: js.Array[String] = js.native
  var name: String = js.native
  var naturalSampleRateHertz: Double = js.native
  var ssmlGender: SsmlVoiceGender = js.native
}

object Voice {
  @scala.inline
  def apply(
    language_codes: js.Array[String],
    name: String,
    naturalSampleRateHertz: Double,
    ssmlGender: SsmlVoiceGender
  ): Voice = {
    val __obj = js.Dynamic.literal(language_codes = language_codes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], naturalSampleRateHertz = naturalSampleRateHertz.asInstanceOf[js.Any], ssmlGender = ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
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
    def setLanguage_codesVarargs(value: String*): Self = this.set("language_codes", js.Array(value :_*))
    @scala.inline
    def setLanguage_codes(value: js.Array[String]): Self = this.set("language_codes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalSampleRateHertz(value: Double): Self = this.set("naturalSampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsmlGender(value: SsmlVoiceGender): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
  }
  
}

