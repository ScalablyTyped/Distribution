package typings.googleDashAppsDashScript.GoogleAppsScript.Language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageApp extends js.Object {
  def translate(text: String, sourceLanguage: String, targetLanguage: String): String = js.native
  def translate(
    text: String,
    sourceLanguage: String,
    targetLanguage: String,
    advancedArgs: LanguageAdvancedParameters
  ): String = js.native
}

