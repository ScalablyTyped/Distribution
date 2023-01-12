package typings.fhir.r4Mod

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
  
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subtitle: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Relevant time or time-period when this Contract is applicable.
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * The individual or organization that authored the Contract definition, derivative, or instance in any legal state.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Precusory content developed with a focus and intent of supporting the formation a Contract instance, which may be associated with and transformable into a Contract.
    */
  var contentDefinition: js.UndefOr[ContractContentDefinition] = js.undefined
  
  /**
    * The minimal content derived from the basal information source at a specific stage in its lifecycle.
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Event resulting in discontinuation or termination of this Contract instance by one or more parties to the contract.
    */
  var expirationType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.undefined
  
  /**
    * Unique identifier for this Contract or a derivative that references a Source Contract.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The URL pointing to a FHIR-defined Contract Definition that is adhered to in whole or part by this Contract.
    */
  var instantiatesCanonical: js.UndefOr[Reference] = js.undefined
  
  /**
    * The URL pointing to an externally maintained definition that is adhered to in whole or in part by this Contract.
    */
  var instantiatesUri: js.UndefOr[String] = js.undefined
  
  /**
    * When this  Contract was issued.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * List of Legal expressions or representations of this Contract.
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.undefined
  
  /**
    * Legal states of the formation of a legal instrument, which is a formally executed written document that can be formally attributed to its author, records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right, and therefore evidences that act, process, or agreement.
    */
  var legalState: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
    */
  var legallyBindingAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
    */
  var legallyBindingReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Contract: typings.fhir.fhirStrings.Contract
  
  /**
    * List of Computable Policy Rule Language Representations of this Contract.
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.undefined
  
  /**
    * A selector of legal concerns for this Contract definition, derivative, or instance in any legal state.
    */
  var scope: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Signers who are principal parties to the contract are bound by the Contract.activity related to the Contract.topic, and the Contract.term(s), which either extend or restrict the overall action on the topic by, for example, stipulating specific policies or obligations constraining actions, action reason, or agents with respect to some or all of the topic.
    * For example, specifying how policies or obligations shall constrain actions and action reasons permitted or denied on all or a subset of the Contract.topic (e.g., all or a portion of property being transferred by the contract), agents (e.g., who can resell, assign interests, or alter the property being transferred by the contract), actions, and action reasons; or with respect to Contract.terms, stipulating, extending, or limiting the Contract.period of applicability or valuation of items under consideration.
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  
  /**
    * Sites in which the contract is complied with,  exercised, or in force.
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the contract as not currently valid or active.
    */
  var status: js.UndefOr[
    amended | appended | cancelled | disputed | `entered-in-error` | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
  ] = js.undefined
  
  /**
    * Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The Contract.subject is an entity that has some role with respect to the Contract.topic and Contract.topic.term, which is of focal interest to the parties to the contract and likely impacted in a significant way by the Contract.action/Contract.action.reason and the Contract.term.action/Contract.action.reason.
    * In many cases, the Contract.subject is a Contract.signer if the subject is an adult; has a legal interest in the contract; and incompetent to participate in the contract agreement.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An explanatory or alternate user-friendly title for this Contract definition, derivative, or instance in any legal state.t giving additional information about its content.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Information that may be needed by/relevant to the performer in their execution of this term action.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * A short, descriptive, user-friendly title for this Contract definition, derivative, or instance in any legal state.t giving additional information about its content.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Narrows the range of legal concerns to focus on the achievement of specific contractual objectives.
    */
  var topicCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Narrows the range of legal concerns to focus on the achievement of specific contractual objectives.
    */
  var topicReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A high-level category for the legal instrument, whether constructed as a Contract definition, derivative, or instance in any legal state.  Provides additional information about its content within the context of the Contract's scope to distinguish the kinds of systems that would be interested in the contract.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Used in a domain that uses a supplied contract repository.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Note -  This is a business versionId, not a resource version id (see discussion http://build.fhir.org/resource.html#versions)
    * Comments - There may be different contract instances that have the same identifier but different versions. The version can be appended to the url in a reference to allow a reference to a particular business version of the plan definition with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object Contract {
  
  inline def apply(): Contract = {
    val __obj = js.Dynamic.literal(resourceType = "Contract")
    __obj.asInstanceOf[Contract]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contract] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthority(value: js.Array[Reference]): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setAuthorityVarargs(value: Reference*): Self = StObject.set(x, "authority", js.Array(value*))
    
    inline def setContentDefinition(value: ContractContentDefinition): Self = StObject.set(x, "contentDefinition", value.asInstanceOf[js.Any])
    
    inline def setContentDefinitionUndefined: Self = StObject.set(x, "contentDefinition", js.undefined)
    
    inline def setContentDerivative(value: CodeableConcept): Self = StObject.set(x, "contentDerivative", value.asInstanceOf[js.Any])
    
    inline def setContentDerivativeUndefined: Self = StObject.set(x, "contentDerivative", js.undefined)
    
    inline def setDomain(value: js.Array[Reference]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Reference*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setExpirationType(value: CodeableConcept): Self = StObject.set(x, "expirationType", value.asInstanceOf[js.Any])
    
    inline def setExpirationTypeUndefined: Self = StObject.set(x, "expirationType", js.undefined)
    
    inline def setFriendly(value: js.Array[ContractFriendly]): Self = StObject.set(x, "friendly", value.asInstanceOf[js.Any])
    
    inline def setFriendlyUndefined: Self = StObject.set(x, "friendly", js.undefined)
    
    inline def setFriendlyVarargs(value: ContractFriendly*): Self = StObject.set(x, "friendly", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: Reference): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesUri(value: String): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setLegal(value: js.Array[ContractLegal]): Self = StObject.set(x, "legal", value.asInstanceOf[js.Any])
    
    inline def setLegalState(value: CodeableConcept): Self = StObject.set(x, "legalState", value.asInstanceOf[js.Any])
    
    inline def setLegalStateUndefined: Self = StObject.set(x, "legalState", js.undefined)
    
    inline def setLegalUndefined: Self = StObject.set(x, "legal", js.undefined)
    
    inline def setLegalVarargs(value: ContractLegal*): Self = StObject.set(x, "legal", js.Array(value*))
    
    inline def setLegallyBindingAttachment(value: Attachment): Self = StObject.set(x, "legallyBindingAttachment", value.asInstanceOf[js.Any])
    
    inline def setLegallyBindingAttachmentUndefined: Self = StObject.set(x, "legallyBindingAttachment", js.undefined)
    
    inline def setLegallyBindingReference(value: Reference): Self = StObject.set(x, "legallyBindingReference", value.asInstanceOf[js.Any])
    
    inline def setLegallyBindingReferenceUndefined: Self = StObject.set(x, "legallyBindingReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Contract): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[ContractRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: ContractRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setScope(value: CodeableConcept): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSigner(value: js.Array[ContractSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSignerVarargs(value: ContractSigner*): Self = StObject.set(x, "signer", js.Array(value*))
    
    inline def setSite(value: js.Array[Reference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setSiteVarargs(value: Reference*): Self = StObject.set(x, "site", js.Array(value*))
    
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
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setTerm(value: js.Array[ContractTerm]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTermVarargs(value: ContractTerm*): Self = StObject.set(x, "term", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopicCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "topicCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setTopicCodeableConceptUndefined: Self = StObject.set(x, "topicCodeableConcept", js.undefined)
    
    inline def setTopicReference(value: Reference): Self = StObject.set(x, "topicReference", value.asInstanceOf[js.Any])
    
    inline def setTopicReferenceUndefined: Self = StObject.set(x, "topicReference", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    inline def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    inline def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value*))
    
    inline def set_instantiatesUri(value: Element): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subtitle(value: Element): Self = StObject.set(x, "_subtitle", value.asInstanceOf[js.Any])
    
    inline def set_subtitleUndefined: Self = StObject.set(x, "_subtitle", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
