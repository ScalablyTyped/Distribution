package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedLanguages extends StObject {
  
  /**
    * A list of languages that you can use for a recipient's language setting. These are the languages that you can set for the standard email format
    * and signing view for each recipient.
    *
    * For example, in the recipient's email notification, this setting affects elements such as the standard introductory text describing the request to sign.
    * It also determines the language used for buttons and tabs in both the email notification and the signing experience.
    *
    * **Note**: Setting a language for a recipient affects only the DocuSign standard text. Any custom text that you enter for the `emailBody` and `emailSubject`
    * of the notification is not translated, and appears exactly as you enter it.
    *
    * Example:
    *
    * ```
    * {
    *     "languages": [
    *         {
    *             "name": "Arabic (ar)",
    *             "value": "ar"
    *         },
    *         {
    *             "name": "Bulgarian (bg)",
    *             "value": "bg"
    *         },
    *         .
    *         .
    *         .
    * }
    * ```
    */
  var languages: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
}
object SupportedLanguages {
  
  inline def apply(): SupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedLanguages] (val x: Self) extends AnyVal {
    
    inline def setLanguages(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
