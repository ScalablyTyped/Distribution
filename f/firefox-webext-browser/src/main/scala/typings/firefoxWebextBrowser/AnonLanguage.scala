package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.i18n.LanguageCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  var language: LanguageCode
  /** The percentage of the detected language */
  var percentage: Double
}

object AnonLanguage {
  @scala.inline
  def apply(language: LanguageCode, percentage: Double): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLanguage]
  }
}

