package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Term List
  */
@js.native
trait ContractTerm extends BackboneElement {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contract Term Activity
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Purpose for the Contract Term Action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contract Term Agent List
    */
  var agent: js.UndefOr[js.Array[ContractTermAgent]] = js.native
  
  /**
    * Contract Term Effective Time
    */
  var applies: js.UndefOr[Period] = js.native
  
  /**
    * Nested Contract Term Group
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.native
  
  /**
    * Contract Term Number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Contract Term Issue Date Time
    */
  var issued: js.UndefOr[dateTime] = js.native
  
  /**
    * Security Labels that define affected terms
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Contract Term Type specific classification
    */
  var subType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Human readable Contract term text
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Context of the Contract term
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Contract Term Type or Form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Contract Term Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.native
}
object ContractTerm {
  
  @scala.inline
  def apply(): ContractTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTerm]
  }
  
  @scala.inline
  implicit class ContractTermOps[Self <: ContractTerm] (val x: Self) extends AnyVal {
    
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
    def set_issued(value: Element): Self = this.set("_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_issued: Self = this.set("_issued", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionReasonVarargs(value: CodeableConcept*): Self = this.set("actionReason", js.Array(value :_*))
    
    @scala.inline
    def setActionReason(value: js.Array[CodeableConcept]): Self = this.set("actionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionReason: Self = this.set("actionReason", js.undefined)
    
    @scala.inline
    def setAgentVarargs(value: ContractTermAgent*): Self = this.set("agent", js.Array(value :_*))
    
    @scala.inline
    def setAgent(value: js.Array[ContractTermAgent]): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setApplies(value: Period): Self = this.set("applies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplies: Self = this.set("applies", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: ContractTerm*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: js.Array[ContractTerm]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIssued(value: dateTime): Self = this.set("issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued: Self = this.set("issued", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = this.set("securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
    
    @scala.inline
    def setSubType(value: CodeableConcept): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: Reference*): Self = this.set("topic", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: js.Array[Reference]): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValuedItemVarargs(value: ContractTermValuedItem*): Self = this.set("valuedItem", js.Array(value :_*))
    
    @scala.inline
    def setValuedItem(value: js.Array[ContractTermValuedItem]): Self = this.set("valuedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuedItem: Self = this.set("valuedItem", js.undefined)
  }
}
