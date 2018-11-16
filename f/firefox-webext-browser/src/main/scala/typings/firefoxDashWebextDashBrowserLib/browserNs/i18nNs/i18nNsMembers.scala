package typings
package firefoxDashWebextDashBrowserLib.browserNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.i18n")
@js.native
object i18nNsMembers extends js.Object {
  /**
       * Detects the language of the provided text using CLD.
       * @param text User input string to be translated.
       */
  def detectLanguage(text: java.lang.String): stdLib.Promise[firefoxDashWebextDashBrowserLib.Anon_Languages] = js.native
  /* i18n functions */
  /**
       * Gets the accept-languages of the browser. This is different from the locale used by the browser; to get the
       * locale, use `i18n.getUILanguage`.
       */
  def getAcceptLanguages(): stdLib.Promise[js.Array[LanguageCode]] = js.native
  /**
       * Gets the localized string for the specified message. If the message is missing, this method returns an empty
       * string (''). If the format of the `getMessage()` call is wrong — for example, _messageName_ is not a string or
       * the _substitutions_ array has more than 9 elements — this method returns `undefined`.
       * @param messageName The name of the message, as specified in the `messages.json` file.
       * @param [substitutions] Substitution strings, if the message requires any.
       * @returns Message localized for current locale.
       */
  def getMessage(messageName: java.lang.String): java.lang.String = js.native
  /**
       * Gets the localized string for the specified message. If the message is missing, this method returns an empty
       * string (''). If the format of the `getMessage()` call is wrong — for example, _messageName_ is not a string or
       * the _substitutions_ array has more than 9 elements — this method returns `undefined`.
       * @param messageName The name of the message, as specified in the `messages.json` file.
       * @param [substitutions] Substitution strings, if the message requires any.
       * @returns Message localized for current locale.
       */
  def getMessage(messageName: java.lang.String, substitutions: js.Any): java.lang.String = js.native
  /**
       * Gets the browser UI language of the browser. This is different from `i18n.getAcceptLanguages` which returns the
       * preferred user languages.
       * @returns The browser UI language code such as en-US or fr-FR.
       */
  def getUILanguage(): java.lang.String = js.native
}

