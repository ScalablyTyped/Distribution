package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractSigner
  extends StObject
     with BackboneElement {
  
  /**
    * Party which is a signator to this Contract.
    */
  var party: Reference
  
  /**
    * Legally binding Contract DSIG signature contents in Base64.
    */
  var signature: js.Array[Signature]
  
  /**
    * Role of this Contract signer, e.g. notary, grantee.
    */
  var `type`: Coding
}
object ContractSigner {
  
  inline def apply(party: Reference, signature: js.Array[Signature], `type`: Coding): ContractSigner = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractSigner]
  }
  
  extension [Self <: ContractSigner](x: Self) {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.Array[Signature]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureVarargs(value: Signature*): Self = StObject.set(x, "signature", js.Array(value*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
