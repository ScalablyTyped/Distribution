package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a language entry.
  */
@js.native
trait Schema$UserLanguage extends js.Object {
  /**
    * Other language. User can provide own language name if there is no
    * corresponding Google III language code. If this is set LanguageCode
    * can&#39;t be set
    */
  var customLanguage: js.UndefOr[String] = js.native
  /**
    * Language Code. Should be used for storing Google III LanguageCode string
    * representation for language. Illegal values cause SchemaException.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$UserLanguage {
  @scala.inline
  def apply(customLanguage: String = null, languageCode: String = null): Schema$UserLanguage = {
    val __obj = js.Dynamic.literal()
    if (customLanguage != null) __obj.updateDynamic("customLanguage")(customLanguage.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserLanguage]
  }
}

