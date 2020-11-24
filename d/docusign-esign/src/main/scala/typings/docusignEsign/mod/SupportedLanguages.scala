package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedLanguages extends js.Object {
  
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
  ] = js.native
}
object SupportedLanguages {
  
  @scala.inline
  def apply(): SupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguages]
  }
  
  @scala.inline
  implicit class SupportedLanguagesOps[Self <: SupportedLanguages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguagesVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
}
