package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.i18n.LanguageCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var language: LanguageCode = js.native
  /** The percentage of the detected language */
  var percentage: Double = js.native
}

object Language {
  @scala.inline
  def apply(language: LanguageCode, percentage: Double): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
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
    def setLanguage(value: LanguageCode): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
  }
  
}

