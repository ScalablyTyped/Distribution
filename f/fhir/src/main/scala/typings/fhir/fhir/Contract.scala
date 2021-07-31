package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Legal Agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Contract
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Action stipulated by this Contract
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Rationale for the stiplulated action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Entity being ascribed responsibility
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.undefined
  
  /**
    * Effective time
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * Authority under which this Contract has standing
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Binding Contract
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Binding Contract
    */
  var bindingReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Content derived from the basal information
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Decision by Grantor
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Domain in which this Contract applies
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contract Friendly Language
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.undefined
  
  /**
    * Contract number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When this Contract was issued
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Contract Legal Language
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.undefined
  
  /**
    * Computable Contract Language
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.undefined
  
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Contract Signatory
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Subtype within the context of type
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contract Target Entity
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contract Term List
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * Context of the Contract
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type or form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contract Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.undefined
}
object Contract {
  
  @scala.inline
  def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  
  @scala.inline
  implicit class ContractMutableBuilder[Self <: Contract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    @scala.inline
    def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value :_*))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setAgent(value: js.Array[ContractAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setAgentVarargs(value: ContractAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    @scala.inline
    def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    @scala.inline
    def setAuthority(value: js.Array[Reference]): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setAuthorityVarargs(value: Reference*): Self = StObject.set(x, "authority", js.Array(value :_*))
    
    @scala.inline
    def setBindingAttachment(value: Attachment): Self = StObject.set(x, "bindingAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingAttachmentUndefined: Self = StObject.set(x, "bindingAttachment", js.undefined)
    
    @scala.inline
    def setBindingReference(value: Reference): Self = StObject.set(x, "bindingReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingReferenceUndefined: Self = StObject.set(x, "bindingReference", js.undefined)
    
    @scala.inline
    def setContentDerivative(value: CodeableConcept): Self = StObject.set(x, "contentDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDerivativeUndefined: Self = StObject.set(x, "contentDerivative", js.undefined)
    
    @scala.inline
    def setDecisionType(value: CodeableConcept): Self = StObject.set(x, "decisionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTypeUndefined: Self = StObject.set(x, "decisionType", js.undefined)
    
    @scala.inline
    def setDomain(value: js.Array[Reference]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDomainVarargs(value: Reference*): Self = StObject.set(x, "domain", js.Array(value :_*))
    
    @scala.inline
    def setFriendly(value: js.Array[ContractFriendly]): Self = StObject.set(x, "friendly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyUndefined: Self = StObject.set(x, "friendly", js.undefined)
    
    @scala.inline
    def setFriendlyVarargs(value: ContractFriendly*): Self = StObject.set(x, "friendly", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIssued(value: dateTime): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    @scala.inline
    def setLegal(value: js.Array[ContractLegal]): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
    
    @scala.inline
    def setLegalVarargs(value: ContractLegal*): Self = StObject.set(x, "legal", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[ContractRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: ContractRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSigner(value: js.Array[ContractSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    @scala.inline
    def setSignerVarargs(value: ContractSigner*): Self = StObject.set(x, "signer", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value :_*))
    
    @scala.inline
    def setTerm(value: js.Array[ContractTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setTermVarargs(value: ContractTerm*): Self = StObject.set(x, "term", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValuedItem(value: js.Array[ContractValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    @scala.inline
    def setValuedItemVarargs(value: ContractValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value :_*))
    
    @scala.inline
    def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
