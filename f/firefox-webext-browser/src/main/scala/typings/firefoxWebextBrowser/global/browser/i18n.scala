package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.i18n.DetectLanguageReturnResult
import typings.firefoxWebextBrowser.browser.i18n.LanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
  */
object i18n {
  
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    */
  @JSGlobal("browser.i18n.detectLanguage")
  @js.native
  def detectLanguage(text: String): js.Promise[DetectLanguageReturnResult] = js.native
  
  /* i18n functions */
  /**
    * Gets the accept-languages of the browser. This is different from the locale used by the browser; to get the locale, use `i18n.getUILanguage`.
    */
  @JSGlobal("browser.i18n.getAcceptLanguages")
  @js.native
  def getAcceptLanguages(): js.Promise[js.Array[LanguageCode]] = js.native
  
  /**
    * Gets the localized string for the specified message. If the message is missing, this method returns an empty string (''). If the format of the `getMessage()` call is wrong — for example, _messageName_ is not a string or the _substitutions_ array has more than 9 elements — this method returns `undefined`.
    * @param messageName The name of the message, as specified in the `messages.json` file.
    * @param [substitutions] Substitution strings, if the message requires any.
    * @returns Message localized for current locale.
    */
  @JSGlobal("browser.i18n.getMessage")
  @js.native
  def getMessage(messageName: String): String = js.native
  @JSGlobal("browser.i18n.getMessage")
  @js.native
  def getMessage(messageName: String, substitutions: js.Any): String = js.native
  
  /**
    * Gets the browser UI language of the browser. This is different from `i18n.getAcceptLanguages` which returns the preferred user languages.
    * @returns The browser UI language code such as en-US or fr-FR.
    */
  @JSGlobal("browser.i18n.getUILanguage")
  @js.native
  def getUILanguage(): String = js.native
}
