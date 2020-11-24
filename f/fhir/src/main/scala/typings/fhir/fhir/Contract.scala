package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Legal Agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Contract extends DomainResource {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Action stipulated by this Contract
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Rationale for the stiplulated action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Entity being ascribed responsibility
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.native
  
  /**
    * Effective time
    */
  var applies: js.UndefOr[Period] = js.native
  
  /**
    * Authority under which this Contract has standing
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Binding Contract
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Binding Contract
    */
  var bindingReference: js.UndefOr[Reference] = js.native
  
  /**
    * Content derived from the basal information
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Decision by Grantor
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Domain in which this Contract applies
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Contract Friendly Language
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.native
  
  /**
    * Contract number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * When this Contract was issued
    */
  var issued: js.UndefOr[dateTime] = js.native
  
  /**
    * Contract Legal Language
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.native
  
  /**
    * Computable Contract Language
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.native
  
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Contract Signatory
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.native
  
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Subtype within the context of type
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contract Target Entity
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Contract Term List
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.native
  
  /**
    * Context of the Contract
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Type or form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Contract Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.native
}
object Contract {
  
  @scala.inline
  def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  
  @scala.inline
  implicit class ContractOps[Self <: Contract] (val x: Self) extends AnyVal {
    
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
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
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
    def setAgentVarargs(value: ContractAgent*): Self = this.set("agent", js.Array(value :_*))
    
    @scala.inline
    def setAgent(value: js.Array[ContractAgent]): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setApplies(value: Period): Self = this.set("applies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplies: Self = this.set("applies", js.undefined)
    
    @scala.inline
    def setAuthorityVarargs(value: Reference*): Self = this.set("authority", js.Array(value :_*))
    
    @scala.inline
    def setAuthority(value: js.Array[Reference]): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    
    @scala.inline
    def setBindingAttachment(value: Attachment): Self = this.set("bindingAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingAttachment: Self = this.set("bindingAttachment", js.undefined)
    
    @scala.inline
    def setBindingReference(value: Reference): Self = this.set("bindingReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingReference: Self = this.set("bindingReference", js.undefined)
    
    @scala.inline
    def setContentDerivative(value: CodeableConcept): Self = this.set("contentDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDerivative: Self = this.set("contentDerivative", js.undefined)
    
    @scala.inline
    def setDecisionType(value: CodeableConcept): Self = this.set("decisionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecisionType: Self = this.set("decisionType", js.undefined)
    
    @scala.inline
    def setDomainVarargs(value: Reference*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: js.Array[Reference]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setFriendlyVarargs(value: ContractFriendly*): Self = this.set("friendly", js.Array(value :_*))
    
    @scala.inline
    def setFriendly(value: js.Array[ContractFriendly]): Self = this.set("friendly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendly: Self = this.set("friendly", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIssued(value: dateTime): Self = this.set("issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued: Self = this.set("issued", js.undefined)
    
    @scala.inline
    def setLegalVarargs(value: ContractLegal*): Self = this.set("legal", js.Array(value :_*))
    
    @scala.inline
    def setLegal(value: js.Array[ContractLegal]): Self = this.set("legal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegal: Self = this.set("legal", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: ContractRule*): Self = this.set("rule", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[ContractRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = this.set("securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
    
    @scala.inline
    def setSignerVarargs(value: ContractSigner*): Self = this.set("signer", js.Array(value :_*))
    
    @scala.inline
    def setSigner(value: js.Array[ContractSigner]): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubTypeVarargs(value: CodeableConcept*): Self = this.set("subType", js.Array(value :_*))
    
    @scala.inline
    def setSubType(value: js.Array[CodeableConcept]): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    
    @scala.inline
    def setSubjectVarargs(value: Reference*): Self = this.set("subject", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: js.Array[Reference]): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTermVarargs(value: ContractTerm*): Self = this.set("term", js.Array(value :_*))
    
    @scala.inline
    def setTerm(value: js.Array[ContractTerm]): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    
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
    def setValuedItemVarargs(value: ContractValuedItem*): Self = this.set("valuedItem", js.Array(value :_*))
    
    @scala.inline
    def setValuedItem(value: js.Array[ContractValuedItem]): Self = this.set("valuedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuedItem: Self = this.set("valuedItem", js.undefined)
  }
}
