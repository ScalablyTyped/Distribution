package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.disputed
import typings.fhir.fhirStrings.executable
import typings.fhir.fhirStrings.executed
import typings.fhir.fhirStrings.negotiable
import typings.fhir.fhirStrings.offered
import typings.fhir.fhirStrings.policy
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.renewed
import typings.fhir.fhirStrings.resolved
import typings.fhir.fhirStrings.revoked
import typings.fhir.fhirStrings.terminated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contract
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Action stipulated by this Contract.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason for action stipulated by this Contract.
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Several agents may be associated (i.e. has some responsibility for an activity) with an activity and vice-versa.
    * For example, in cases of actions initiated by one user for other users, or in events that involve more than one user, hardware device, software, or system process. However, only one user may be the initiator/requestor for the event.
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.undefined
  
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
    * The minimal content derived from the basal information source at a specific stage in its lifecycle.
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of decision made by a grantor with respect to an offer made by a grantee.
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.undefined
  
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
    * A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Signers who are principal parties to the contract are bound by the Contract.activity related to the Contract.topic, and the Contract.term(s), which either extend or restrict the overall action on the topic by, for example, stipulating specific policies or obligations constraining actions, action reason, or agents with respect to some or all of the topic.
    * For example, specifying how policies or obligations shall constrain actions and action reasons permitted or denied on all or a subset of the Contract.topic (e.g., all or a portion of property being transferred by the contract), agents (e.g., who can resell, assign interests, or alter the property being transferred by the contract), actions, and action reasons; or with respect to Contract.terms, stipulating, extending, or limiting the Contract.period of applicability or valuation of items under consideration.
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the contract as not currently valid or active.
    */
  var status: js.UndefOr[
    amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
  ] = js.undefined
  
  /**
    * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The Contract.subject is an entity that has some role with respect to the Contract.topic and Contract.topic.term, which is of focal interest to the parties to the contract and likely impacted in a significant way by the Contract.action/Contract.action.reason and the Contract.term.action/Contract.action.reason.
    * In many cases, the Contract.subject is a Contract.signer if the subject is an adult; has a legal interest in the contract; and incompetent to participate in the contract agreement.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * The Contract.topic may be an application for or offer of a policy or service (e.g., uri to a consent directive form or a health insurance policy), which becomes the Contract once accepted by both the grantor and grantee.
    * The Contract Resource may function simply as the computable representation of the executed contract, which may be the attached to the Contract Resource as the “binding” or as the “friendly” electronic form.  For example, a Contract Resource may be automatically populated with the values expressed in a related QuestionnaireResponse.
    * However, the Contract Resource may be considered the legally binding contract if it is the only “executed” form of this contract, and includes the signatures as *The Contract Resource may function as the computable representation of an application or offer in a pre-executed Contract if the grantor has not entered any values.  In this case, it is populated with values in a “legal” form of the application or offer or by the values in an associated Questionnaire.  If the grantor has filled in the legal form or the associated Questionnaire Response, then these values are used to populate a pre-executed Contract Resource.
    * If the Contract.topic is considered an application or offer, then the policy is often required to be attached as the “legal” basis for the application to ensure “informed consent” to the contract, and that any discrepancy between the application and the policy are interpreted against the policy.  Implementers should check organizational and jurisdictional policies to determine the relationship among multiple representations of a contract pre- and post-execution.
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contract] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "actionReason", value.asInstanceOf[js.Any])
    
    inline def setActionReasonUndefined: Self = StObject.set(x, "actionReason", js.undefined)
    
    inline def setActionReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "actionReason", js.Array(value*))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setAgent(value: js.Array[ContractAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: ContractAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setAuthority(value: js.Array[Reference]): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setAuthorityVarargs(value: Reference*): Self = StObject.set(x, "authority", js.Array(value*))
    
    inline def setBindingAttachment(value: Attachment): Self = StObject.set(x, "bindingAttachment", value.asInstanceOf[js.Any])
    
    inline def setBindingAttachmentUndefined: Self = StObject.set(x, "bindingAttachment", js.undefined)
    
    inline def setBindingReference(value: Reference): Self = StObject.set(x, "bindingReference", value.asInstanceOf[js.Any])
    
    inline def setBindingReferenceUndefined: Self = StObject.set(x, "bindingReference", js.undefined)
    
    inline def setContentDerivative(value: CodeableConcept): Self = StObject.set(x, "contentDerivative", value.asInstanceOf[js.Any])
    
    inline def setContentDerivativeUndefined: Self = StObject.set(x, "contentDerivative", js.undefined)
    
    inline def setDecisionType(value: CodeableConcept): Self = StObject.set(x, "decisionType", value.asInstanceOf[js.Any])
    
    inline def setDecisionTypeUndefined: Self = StObject.set(x, "decisionType", js.undefined)
    
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
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setSigner(value: js.Array[ContractSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSignerVarargs(value: ContractSigner*): Self = StObject.set(x, "signer", js.Array(value*))
    
    inline def setStatus(
      value: amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value*))
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setTerm(value: js.Array[ContractTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTermVarargs(value: ContractTerm*): Self = StObject.set(x, "term", js.Array(value*))
    
    inline def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValuedItem(value: js.Array[ContractValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    inline def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    inline def setValuedItemVarargs(value: ContractValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value*))
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
