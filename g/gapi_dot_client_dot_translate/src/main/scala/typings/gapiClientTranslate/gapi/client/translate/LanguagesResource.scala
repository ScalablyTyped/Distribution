package typings.gapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTranslate.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. 'en', 'ja'). In certain cases, BCP-47 codes including
    * language + region identifiers are returned (e.g. 'zh-TW' and 'zh-CH')
    */
  var language: js.UndefOr[String] = js.native
  /** Human readable name of the language localized to the target language. */
  var name: js.UndefOr[String] = js.native
  /** Returns a list of supported languages for translation. */
  def list(request: Accesstoken): Request[LanguagesListResponse] = js.native
}

object LanguagesResource {
  @scala.inline
  def apply(list: Accesstoken => Request[LanguagesListResponse]): LanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LanguagesResource]
  }
  @scala.inline
  implicit class LanguagesResourceOps[Self <: LanguagesResource] (val x: Self) extends AnyVal {
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
    def setList(value: Accesstoken => Request[LanguagesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

