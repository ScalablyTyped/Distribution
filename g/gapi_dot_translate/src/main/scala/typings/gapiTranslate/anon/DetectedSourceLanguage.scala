package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedSourceLanguage extends js.Object {
  var detectedSourceLanguage: String = js.native
  var translatedText: String = js.native
}

object DetectedSourceLanguage {
  @scala.inline
  def apply(detectedSourceLanguage: String, translatedText: String): DetectedSourceLanguage = {
    val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedSourceLanguage]
  }
  @scala.inline
  implicit class DetectedSourceLanguageOps[Self <: DetectedSourceLanguage] (val x: Self) extends AnyVal {
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
    def setDetectedSourceLanguage(value: String): Self = this.set("detectedSourceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslatedText(value: String): Self = this.set("translatedText", value.asInstanceOf[js.Any])
  }
  
}

