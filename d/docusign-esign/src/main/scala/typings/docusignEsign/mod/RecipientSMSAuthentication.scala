package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientSMSAuthentication extends StObject {
  
  /**
    * An array containing a list of phone numbers that the recipient can use for SMS text authentication.
    */
  var senderProvidedNumbers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Metadata that indicates whether the `senderProvidedNumbers` property can be edited.
    */
  var senderProvidedNumbersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object RecipientSMSAuthentication {
  
  @scala.inline
  def apply(): RecipientSMSAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSMSAuthentication]
  }
  
  @scala.inline
  implicit class RecipientSMSAuthenticationMutableBuilder[Self <: RecipientSMSAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSenderProvidedNumbers(value: js.Array[String]): Self = StObject.set(x, "senderProvidedNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderProvidedNumbersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "senderProvidedNumbersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderProvidedNumbersMetadataUndefined: Self = StObject.set(x, "senderProvidedNumbersMetadata", js.undefined)
    
    @scala.inline
    def setSenderProvidedNumbersUndefined: Self = StObject.set(x, "senderProvidedNumbers", js.undefined)
    
    @scala.inline
    def setSenderProvidedNumbersVarargs(value: String*): Self = StObject.set(x, "senderProvidedNumbers", js.Array(value :_*))
  }
}
