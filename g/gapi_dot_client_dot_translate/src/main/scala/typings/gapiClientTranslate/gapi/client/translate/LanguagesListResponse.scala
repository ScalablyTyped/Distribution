package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagesListResponse extends js.Object {
  /**
    * List of source/target languages supported by the translation API. If target parameter is unspecified, the list is sorted by the ASCII code point order
    * of the language code. If target parameter is specified, the list is sorted by the collation order of the language name in the target language.
    */
  var languages: js.UndefOr[js.Array[LanguagesResource]] = js.native
}

object LanguagesListResponse {
  @scala.inline
  def apply(): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagesListResponse]
  }
  @scala.inline
  implicit class LanguagesListResponseOps[Self <: LanguagesListResponse] (val x: Self) extends AnyVal {
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
    def setLanguagesVarargs(value: LanguagesResource*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[LanguagesResource]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
  
}

