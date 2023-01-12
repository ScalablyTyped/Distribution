package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractSigner
  extends StObject
     with BackboneElement {
  
  var _signature: js.UndefOr[Element] = js.undefined
  
  /**
    * Party which is a signator to this Contract.
    */
  var party: Reference
  
  /**
    * Legally binding Contract DSIG signature contents in Base64.
    */
  var signature: String
  
  /**
    * Role of this Contract signer, e.g. notary, grantee.
    */
  var `type`: Coding
}
object ContractSigner {
  
  inline def apply(party: Reference, signature: String, `type`: Coding): ContractSigner = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractSigner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractSigner] (val x: Self) extends AnyVal {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_signature(value: Element): Self = StObject.set(x, "_signature", value.asInstanceOf[js.Any])
    
    inline def set_signatureUndefined: Self = StObject.set(x, "_signature", js.undefined)
  }
}
