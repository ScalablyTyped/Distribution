package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageTargeting extends js.Object {
  /**
    * Languages that this ad targets. For each language only languageId is required. The other fields are populated automatically when the ad is inserted or
    * updated.
    */
  var languages: js.UndefOr[js.Array[Language]] = js.native
}

object LanguageTargeting {
  @scala.inline
  def apply(): LanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTargeting]
  }
  @scala.inline
  implicit class LanguageTargetingOps[Self <: LanguageTargeting] (val x: Self) extends AnyVal {
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
    def setLanguagesVarargs(value: Language*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
  
}

