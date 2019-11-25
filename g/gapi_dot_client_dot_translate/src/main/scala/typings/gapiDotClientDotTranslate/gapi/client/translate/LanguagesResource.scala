package typings.gapiDotClientDotTranslate.gapi.client.translate

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTranslate.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. 'en', 'ja'). In certain cases, BCP-47 codes including
    * language + region identifiers are returned (e.g. 'zh-TW' and 'zh-CH')
    */
  var language: js.UndefOr[String] = js.undefined
  /** Human readable name of the language localized to the target language. */
  var name: js.UndefOr[String] = js.undefined
  /** Returns a list of supported languages for translation. */
  def list(request: Anon_Accesstoken): Request[LanguagesListResponse]
}

object LanguagesResource {
  @scala.inline
  def apply(
    list: Anon_Accesstoken => Request[LanguagesListResponse],
    language: String = null,
    name: String = null
  ): LanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagesResource]
  }
}

