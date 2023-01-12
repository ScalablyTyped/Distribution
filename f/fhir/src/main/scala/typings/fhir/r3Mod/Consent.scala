package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _policyRule: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Note that this is the direct action (not the grounds for the action covered in the purpose element). At present, the only action in the understood and tested scope of this resource is 'read'.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.undefined
  
  /**
    * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Commonly, the patient the consent pertains to is the consentor, but particularly for young and old people, it may be some other person - e.g. a legal guardian.
    */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The resources controlled by this consent, if specific resources are referenced.
    */
  var data: js.UndefOr[js.Array[ConsentData]] = js.undefined
  
  /**
    * This has a different sense to the Consent.period - that is when the consent agreement holds. This is the time period of the data that is controlled by the agreement.
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This is not the time of the original consent, but the time that this statement was made or derived.
    */
  var dateTime: js.UndefOr[String] = js.undefined
  
  /**
    * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
    */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.undefined
  
  /**
    * This identifier is identifies this copy of the consent. Where this identifier is also used elsewhere as the identifier for a consent record (e.g. a CDA consent document) then the consent details are expected to be the same.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The organization that manages the consent, and the framework within which it is executed.
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Commonly, the patient the consent pertains to is the author, but for young and old people, it may be some other person.
    */
  var patient: Reference
  
  /**
    * This can be a subset of the period of the original statement.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.undefined
  
  /**
    * If the policy reference is not known, the resource cannot be processed. Where the reference is absent, there is no particular policy other than what is expressed directly in the consent resource.
    */
  var policyRule: js.UndefOr[String] = js.undefined
  
  /**
    * This element is for discoverability / documentation, and does not modify or qualify the policy (e.g. the policy itself describes the purposes for which it applies).
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Consent: typings.fhir.fhirStrings.Consent
  
  /**
    * If the consent specifies a security label of "R" then it applies to all resources that are labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of security labels, subsumption logic applies. Not all of the security labels make sense for use in this element (may define a narrower value set?).
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes rejected and entered-in-error that mark the Consent as not currently valid.
    */
  var status: draft | proposed | active | rejected | inactive | `entered-in-error`
}
object Consent {
  
  inline def apply(patient: Reference, status: draft | proposed | active | rejected | inactive | `entered-in-error`): Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "Consent", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[ConsentActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ConsentActor*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setConsentingParty(value: js.Array[Reference]): Self = StObject.set(x, "consentingParty", value.asInstanceOf[js.Any])
    
    inline def setConsentingPartyUndefined: Self = StObject.set(x, "consentingParty", js.undefined)
    
    inline def setConsentingPartyVarargs(value: Reference*): Self = StObject.set(x, "consentingParty", js.Array(value*))
    
    inline def setData(value: js.Array[ConsentData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setExcept(value: js.Array[ConsentExcept]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setExceptVarargs(value: ConsentExcept*): Self = StObject.set(x, "except", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOrganization(value: js.Array[Reference]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationVarargs(value: Reference*): Self = StObject.set(x, "organization", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicy(value: js.Array[ConsentPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyRule(value: String): Self = StObject.set(x, "policyRule", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleUndefined: Self = StObject.set(x, "policyRule", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: ConsentPolicy*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Consent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setSourceAttachment(value: Attachment): Self = StObject.set(x, "sourceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachmentUndefined: Self = StObject.set(x, "sourceAttachment", js.undefined)
    
    inline def setSourceIdentifier(value: Identifier): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentifierUndefined: Self = StObject.set(x, "sourceIdentifier", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setStatus(value: draft | proposed | active | rejected | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_policyRule(value: Element): Self = StObject.set(x, "_policyRule", value.asInstanceOf[js.Any])
    
    inline def set_policyRuleUndefined: Self = StObject.set(x, "_policyRule", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
