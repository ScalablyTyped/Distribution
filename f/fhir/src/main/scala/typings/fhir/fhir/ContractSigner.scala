package typings.fhir.fhir

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
  implicit class ContractSignerOps[Self <: ContractSigner] (val x: Self) extends AnyVal {
    
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
    def setParty(value: Reference): Self = this.set("party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVarargs(value: Signature*): Self = this.set("signature", js.Array(value :_*))
    
    @scala.inline
    def setSignature(value: js.Array[Signature]): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Coding): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
