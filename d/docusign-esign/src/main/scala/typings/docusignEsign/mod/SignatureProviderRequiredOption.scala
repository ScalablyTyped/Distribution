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
  
  @scala.inline
  def apply(): SignatureProviderRequiredOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProviderRequiredOption]
  }
  
  @scala.inline
  implicit class SignatureProviderRequiredOptionMutableBuilder[Self <: SignatureProviderRequiredOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredSignatureProviderOptionIds(value: js.Array[String]): Self = StObject.set(x, "requiredSignatureProviderOptionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredSignatureProviderOptionIdsUndefined: Self = StObject.set(x, "requiredSignatureProviderOptionIds", js.undefined)
    
    @scala.inline
    def setRequiredSignatureProviderOptionIdsVarargs(value: String*): Self = StObject.set(x, "requiredSignatureProviderOptionIds", js.Array(value :_*))
    
    @scala.inline
    def setSignerType(value: String): Self = StObject.set(x, "signerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerTypeUndefined: Self = StObject.set(x, "signerType", js.undefined)
  }
}
