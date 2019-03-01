package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: firefoxDashWebextDashBrowserLib.browserNs.i18nNs.LanguageCode
  /** The percentage of the detected language */
  var percentage: scala.Double
}

object Anon_Language {
  @scala.inline
  def apply(language: firefoxDashWebextDashBrowserLib.browserNs.i18nNs.LanguageCode, percentage: scala.Double): Anon_Language = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("percentage")(percentage)
    __obj.asInstanceOf[Anon_Language]
  }
}

