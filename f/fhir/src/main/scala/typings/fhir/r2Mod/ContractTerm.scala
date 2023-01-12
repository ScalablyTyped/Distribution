package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTerm
  extends StObject
     with BackboneElement {
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Action stipulated by this Contract Provision.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason or purpose for the action stipulated by this Contract Provision.
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * List of actors participating in this Contract Provision.
    */
  var actor: js.UndefOr[js.Array[ContractTermActor]] = js.undefined
  
  /**
    * Relevant time or time-period when this Contract Provision is applicable.
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * Nested group of Contract Provisions.
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * Unique identifier for this particular Contract Provision.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When this Contract Provision was issued.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Who or what this Contract Provision is about.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Human readable form of this Contract Provision.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contract Provision Valued Item List.
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.undefined
}
object ContractTerm {
  
  inline def apply(): ContractTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTerm] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    inline def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    inline def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value*))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[ContractTermActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ContractTermActor*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setGroup(value: js.Array[ContractTerm]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: ContractTerm*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValuedItem(value: js.Array[ContractTermValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    inline def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    inline def setValuedItemVarargs(value: ContractTermValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value*))
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
