package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Responsible for the account
  */
@js.native
trait AccountGuarantor extends BackboneElement {
  
  /**
    * Contains extended information for property 'onHold'.
    */
  var _onHold: js.UndefOr[Element] = js.native
  
  /**
    * Credit or other hold applied
    */
  var onHold: js.UndefOr[Boolean] = js.native
  
  /**
    * Responsible entity
    */
  var party: Reference = js.native
  
  /**
    * Guarrantee account during
    */
  var period: js.UndefOr[Period] = js.native
}
object AccountGuarantor {
  
  @scala.inline
  def apply(party: Reference): AccountGuarantor = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGuarantor]
  }
  
  @scala.inline
  implicit class AccountGuarantorOps[Self <: AccountGuarantor] (val x: Self) extends AnyVal {
    
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
    def set_onHold(value: Element): Self = this.set("_onHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_onHold: Self = this.set("_onHold", js.undefined)
    
    @scala.inline
    def setOnHold(value: Boolean): Self = this.set("onHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHold: Self = this.set("onHold", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
