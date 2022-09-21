package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureProviderRequiredOption extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var requiredSignatureProviderOptionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signerType: js.UndefOr[String] = js.undefined
}
object SignatureProviderRequiredOption {
  
  inline def apply(): SignatureProviderRequiredOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProviderRequiredOption]
  }
  
  extension [Self <: SignatureProviderRequiredOption](x: Self) {
    
    inline def setRequiredSignatureProviderOptionIds(value: js.Array[String]): Self = StObject.set(x, "requiredSignatureProviderOptionIds", value.asInstanceOf[js.Any])
    
    inline def setRequiredSignatureProviderOptionIdsUndefined: Self = StObject.set(x, "requiredSignatureProviderOptionIds", js.undefined)
    
    inline def setRequiredSignatureProviderOptionIdsVarargs(value: String*): Self = StObject.set(x, "requiredSignatureProviderOptionIds", js.Array(value*))
    
    inline def setSignerType(value: String): Self = StObject.set(x, "signerType", value.asInstanceOf[js.Any])
    
    inline def setSignerTypeUndefined: Self = StObject.set(x, "signerType", js.undefined)
  }
}
