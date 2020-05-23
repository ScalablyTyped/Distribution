package typings.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
  */
@JSGlobal("browser.i18n")
@js.native
object i18n extends js.Object {
  /* i18n types */
  /**
    * An ISO language code such as `en` or `fr`. For a complete list of languages supported by this method, see
    * [kLanguageInfoTable](http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc).
    * For an unknown language, `und` will be returned, which means that [percentage] of the text is unknown to CLD
    */
  type LanguageCode = String
}

