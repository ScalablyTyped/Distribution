package typings.firefoxDashWebextDashBrowser.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nNs {
  /* i18n types */
  /**
    * An ISO language code such as `en` or `fr`. For a complete list of languages supported by this method, see
    * [kLanguageInfoTable](http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc).
    * For an unknown language, `und` will be returned, which means that [percentage] of the text is unknown to CLD
    */
  type LanguageCode = String
}
