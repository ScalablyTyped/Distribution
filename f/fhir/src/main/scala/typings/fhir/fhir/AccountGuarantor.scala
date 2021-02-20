package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class AccountGuarantorMutableBuilder[Self <: AccountGuarantor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHold(value: Boolean): Self = StObject.set(x, "onHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHoldUndefined: Self = StObject.set(x, "onHold", js.undefined)
    
    @scala.inline
    def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def set_onHold(value: Element): Self = StObject.set(x, "_onHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onHoldUndefined: Self = StObject.set(x, "_onHold", js.undefined)
  }
}
