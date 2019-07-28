package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.i18nNs.LanguageCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: LanguageCode
  /** The percentage of the detected language */
  var percentage: Double
}

object Anon_Language {
  @scala.inline
  def apply(language: LanguageCode, percentage: Double): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language, percentage = percentage)
  
    __obj.asInstanceOf[Anon_Language]
  }
}

