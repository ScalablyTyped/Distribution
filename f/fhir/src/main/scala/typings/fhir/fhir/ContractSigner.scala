package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Signatory
  */
@js.native
trait ContractSigner extends BackboneElement {
  
  /**
    * Contract Signatory Party
    */
  var party: Reference = js.native
  
  /**
    * Contract Documentation Signature
    */
  var signature: js.Array[Signature] = js.native
  
  /**
    * Contract Signatory Role
    */
  var `type`: Coding = js.native
}
object ContractSigner {
  
  @scala.inline
  def apply(party: Reference, signature: js.Array[Signature], `type`: Coding): ContractSigner = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractSigner]
  }
  
  @scala.inline
  implicit class ContractSignerMutableBuilder[Self <: ContractSigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.Array[Signature]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVarargs(value: Signature*): Self = StObject.set(x, "signature", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
