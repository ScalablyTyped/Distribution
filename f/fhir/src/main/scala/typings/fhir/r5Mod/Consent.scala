package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The actor that controls/enforces the access according to the consent.
    */
  var controller: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Date and time the consent instance was agreed to.
    */
  var dateTime: js.UndefOr[String] = js.undefined
  
  /**
    * In a fully computable consent, both grantee and grantor  will be listed as actors within the consent. The Grantee and Grantor elements are for ease of search only.
    */
  var grantee: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The entity responsible for granting the rights listed in a Consent Directive.
    */
  var grantor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This identifier identifies this copy of the consent. Where this identifier is also used elsewhere as the identifier for a consent record (e.g. a CDA consent document) then the consent details are expected to be the same.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The actor that manages the consent through its lifecycle.
    */
  var manager: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * if policy and policyRule are not present, the resource must include the policy being agreed to, or complied with, and that policy and/or policyRule SHOULD be populated as soon as is practical to support workflows that require computability. In addition, the policy could be indicated via the sourceReference or sourceAttachment content.
    * Alternately, creating an invariant for individual scopes that forces one or more of the elements to be populated as part of a profile or Implementation Guide may be advisable.
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.undefined
  
  /**
    * If the policyRule is absent, computable consent would need to be constructed from the elements of the Consent resource.
    */
  var policyRule: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
    */
  var provision: js.UndefOr[ConsentProvision] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Consent: typings.fhir.fhirStrings.Consent
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceAttachment: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes rejected and entered-in-error that mark the Consent as not currently valid.
    */
  var status: draft | active | inactive | `entered-in-error` | unknown
  
  /**
    * The patient/healthcare practitioner or group of persons to whom this consent applies.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
    */
  var verification: js.UndefOr[js.Array[ConsentVerification]] = js.undefined
}
object Consent {
  
  inline def apply(status: draft | active | inactive | `entered-in-error` | unknown): Consent = {
    val __obj = js.Dynamic.literal(resourceType = "Consent", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  
  extension [Self <: Consent](x: Self) {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setController(value: js.Array[Reference]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: Reference*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setGrantee(value: js.Array[Reference]): Self = StObject.set(x, "grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "grantee", js.undefined)
    
    inline def setGranteeVarargs(value: Reference*): Self = StObject.set(x, "grantee", js.Array(value*))
    
    inline def setGrantor(value: js.Array[Reference]): Self = StObject.set(x, "grantor", value.asInstanceOf[js.Any])
    
    inline def setGrantorUndefined: Self = StObject.set(x, "grantor", js.undefined)
    
    inline def setGrantorVarargs(value: Reference*): Self = StObject.set(x, "grantor", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManager(value: js.Array[Reference]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setManagerVarargs(value: Reference*): Self = StObject.set(x, "manager", js.Array(value*))
    
    inline def setPolicy(value: js.Array[ConsentPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyRule(value: CodeableConcept): Self = StObject.set(x, "policyRule", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleUndefined: Self = StObject.set(x, "policyRule", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: ConsentPolicy*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setProvision(value: ConsentProvision): Self = StObject.set(x, "provision", value.asInstanceOf[js.Any])
    
    inline def setProvisionUndefined: Self = StObject.set(x, "provision", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Consent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachment(value: js.Array[Attachment]): Self = StObject.set(x, "sourceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachmentUndefined: Self = StObject.set(x, "sourceAttachment", js.undefined)
    
    inline def setSourceAttachmentVarargs(value: Attachment*): Self = StObject.set(x, "sourceAttachment", js.Array(value*))
    
    inline def setSourceReference(value: js.Array[Reference]): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setSourceReferenceVarargs(value: Reference*): Self = StObject.set(x, "sourceReference", js.Array(value*))
    
    inline def setStatus(value: draft | active | inactive | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setVerification(value: js.Array[ConsentVerification]): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    
    inline def setVerificationVarargs(value: ConsentVerification*): Self = StObject.set(x, "verification", js.Array(value*))
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
