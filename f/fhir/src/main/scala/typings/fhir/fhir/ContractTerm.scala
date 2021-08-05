package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Term List
  */
trait ContractTerm
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Contract Term Activity
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Purpose for the Contract Term Action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contract Term Agent List
    */
  var agent: js.UndefOr[js.Array[ContractTermAgent]] = js.undefined
  
  /**
    * Contract Term Effective Time
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * Nested Contract Term Group
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * Contract Term Number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Contract Term Issue Date Time
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Security Labels that define affected terms
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Contract Term Type specific classification
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Human readable Contract term text
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Context of the Contract term
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contract Term Type or Form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contract Term Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.undefined
}
object ContractTerm {
  
  inline def apply(): ContractTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTerm]
  }
  
  extension [Self <: ContractTerm](x: Self) {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    inline def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    inline def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value :_*))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setAgent(value: js.Array[ContractTermAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: ContractTermAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setGroup(value: js.Array[ContractTerm]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: ContractTerm*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: dateTime): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValuedItem(value: js.Array[ContractTermValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    inline def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    inline def setValuedItemVarargs(value: ContractTermValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value :_*))
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
