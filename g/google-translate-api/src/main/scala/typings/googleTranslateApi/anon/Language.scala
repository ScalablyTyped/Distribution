package typings.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var language: DidYouMean = js.native
  var text: AutoCorrected = js.native
}

object Language {
  @scala.inline
  def apply(language: DidYouMean, text: AutoCorrected): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setLanguage(value: DidYouMean): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: AutoCorrected): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

