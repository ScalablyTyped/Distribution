package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. &#39;en&#39;, &#39;ja&#39;). In certain cases, BCP-47
    * codes including language + region identifiers are returned (e.g.
    * &#39;zh-TW&#39; and &#39;zh-CH&#39;)
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Human readable name of the language localized to the target language.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$LanguagesResource {
  @scala.inline
  def apply(language: String = null, name: String = null): Schema$LanguagesResource = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LanguagesResource]
  }
}

