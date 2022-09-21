package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.i18n.DetectLanguageReturnResult
import typings.firefoxWebextBrowser.browser.i18n.LanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
  */
object i18n {
  
  @JSGlobal("browser.i18n")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    */
  inline def detectLanguage(text: String): js.Promise[DetectLanguageReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DetectLanguageReturnResult]]
  
  /* i18n functions */
  /**
    * Gets the accept-languages of the browser. This is different from the locale used by the browser; to get the locale, use `i18n.getUILanguage`.
    */
  inline def getAcceptLanguages(): js.Promise[js.Array[LanguageCode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptLanguages")().asInstanceOf[js.Promise[js.Array[LanguageCode]]]
  
  /**
    * Gets the localized string for the specified message. If the message is missing, this method returns an empty string (''). If the format of the `getMessage()` call is wrong — for example, _messageName_ is not a string or the _substitutions_ array has more than 9 elements — this method returns `undefined`.
    * @param messageName The name of the message, as specified in the `messages.json` file.
    * @param [substitutions] Substitution strings, if the message requires any.
    * @returns Message localized for current locale.
    */
  inline def getMessage(messageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessage(messageName: String, substitutions: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Gets the browser UI language of the browser. This is different from `i18n.getAcceptLanguages` which returns the preferred user languages.
    * @returns The browser UI language code such as en-US or fr-FR.
    */
  inline def getUILanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUILanguage")().asInstanceOf[String]
}
