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
  
  inline def apply(): RecipientSMSAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSMSAuthentication]
  }
  
  extension [Self <: RecipientSMSAuthentication](x: Self) {
    
    inline def setSenderProvidedNumbers(value: js.Array[String]): Self = StObject.set(x, "senderProvidedNumbers", value.asInstanceOf[js.Any])
    
    inline def setSenderProvidedNumbersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "senderProvidedNumbersMetadata", value.asInstanceOf[js.Any])
    
    inline def setSenderProvidedNumbersMetadataUndefined: Self = StObject.set(x, "senderProvidedNumbersMetadata", js.undefined)
    
    inline def setSenderProvidedNumbersUndefined: Self = StObject.set(x, "senderProvidedNumbers", js.undefined)
    
    inline def setSenderProvidedNumbersVarargs(value: String*): Self = StObject.set(x, "senderProvidedNumbers", js.Array(value :_*))
  }
}
