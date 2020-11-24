package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientSMSAuthentication extends js.Object {
  
  /**
    * An array containing a list of phone numbers that the recipient can use for SMS text authentication.
    */
  var senderProvidedNumbers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `senderProvidedNumbers` property can be edited.
    */
  var senderProvidedNumbersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object RecipientSMSAuthentication {
  
  @scala.inline
  def apply(): RecipientSMSAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSMSAuthentication]
  }
  
  @scala.inline
  implicit class RecipientSMSAuthenticationOps[Self <: RecipientSMSAuthentication] (val x: Self) extends AnyVal {
    
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
    def setSenderProvidedNumbersVarargs(value: String*): Self = this.set("senderProvidedNumbers", js.Array(value :_*))
    
    @scala.inline
    def setSenderProvidedNumbers(value: js.Array[String]): Self = this.set("senderProvidedNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderProvidedNumbers: Self = this.set("senderProvidedNumbers", js.undefined)
    
    @scala.inline
    def setSenderProvidedNumbersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("senderProvidedNumbersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderProvidedNumbersMetadata: Self = this.set("senderProvidedNumbersMetadata", js.undefined)
  }
}
