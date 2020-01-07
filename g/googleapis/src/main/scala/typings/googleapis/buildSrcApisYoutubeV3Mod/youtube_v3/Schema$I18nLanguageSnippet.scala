package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n language, such as language code and
  * human-readable name.
  */
@js.native
trait Schema$I18nLanguageSnippet extends js.Object {
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$I18nLanguageSnippet {
  @scala.inline
  def apply(hl: String = null, name: String = null): Schema$I18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$I18nLanguageSnippet]
  }
}

