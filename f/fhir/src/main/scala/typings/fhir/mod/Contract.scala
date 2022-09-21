package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contract
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Action stipulated by this Contract.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason for action stipulated by this Contract.
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * List of Contract actors.
    */
  var actor: js.UndefOr[js.Array[ContractActor]] = js.undefined
  
  /**
    * Relevant time or time-period when this Contract is applicable.
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
    */
  var bindingReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.undefined
  
  /**
    * Unique identifier for this Contract.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When this  Contract was issued.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * List of Legal expressions or representations of this Contract.
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Contract: typings.fhir.fhirStrings.Contract
  
  /**
    * List of Computable Policy Rule Language Representations of this Contract.
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.undefined
  
  /**
    * Party signing this Contract.
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  
  /**
    * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contract Valued Item List.
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.undefined
}
object Contract {
  
  inline def apply(): Contract = {
    val __obj = js.Dynamic.literal(resourceType = "Contract")
    __obj.asInstanceOf[Contract]
  }
  
  extension [Self <: Contract](x: Self) {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    inline def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    inline def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value*))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[ContractActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ContractActor*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setAuthority(value: js.Array[Reference]): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setAuthorityVarargs(value: Reference*): Self = StObject.set(x, "authority", js.Array(value*))
    
    inline def setBindingAttachment(value: Attachment): Self = StObject.set(x, "bindingAttachment", value.asInstanceOf[js.Any])
    
    inline def setBindingAttachmentUndefined: Self = StObject.set(x, "bindingAttachment", js.undefined)
    
    inline def setBindingReference(value: Reference): Self = StObject.set(x, "bindingReference", value.asInstanceOf[js.Any])
    
    inline def setBindingReferenceUndefined: Self = StObject.set(x, "bindingReference", js.undefined)
    
    inline def setDomain(value: js.Array[Reference]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Reference*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setFriendly(value: js.Array[ContractFriendly]): Self = StObject.set(x, "friendly", value.asInstanceOf[js.Any])
    
    inline def setFriendlyUndefined: Self = StObject.set(x, "friendly", js.undefined)
    
    inline def setFriendlyVarargs(value: ContractFriendly*): Self = StObject.set(x, "friendly", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setLegal(value: js.Array[ContractLegal]): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
    
    inline def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
    
    inline def setLegalVarargs(value: ContractLegal*): Self = StObject.set(x, "legal", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Contract): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[ContractRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: ContractRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setSigner(value: js.Array[ContractSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSignerVarargs(value: ContractSigner*): Self = StObject.set(x, "signer", js.Array(value*))
    
    inline def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value*))
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setTerm(value: js.Array[ContractTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTermVarargs(value: ContractTerm*): Self = StObject.set(x, "term", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValuedItem(value: js.Array[ContractValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    inline def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    inline def setValuedItemVarargs(value: ContractValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value*))
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
  }
}
