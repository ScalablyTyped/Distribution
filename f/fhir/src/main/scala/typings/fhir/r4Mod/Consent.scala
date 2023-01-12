package typings.fhir.r4Mod

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
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
    */
  var category: js.Array[CodeableConcept]
  
  /**
    * This is not the time of the original consent, but the time that this statement was made or derived.
    */
  var dateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This identifier identifies this copy of the consent. Where this identifier is also used elsewhere as the identifier for a consent record (e.g. a CDA consent document) then the consent details are expected to be the same.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization that manages the consent, and the framework within which it is executed.
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Commonly, the patient the consent pertains to is the author, but for young and old people, it may be some other person.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Commonly, the patient the consent pertains to is the consentor, but particularly for young and old people, it may be some other person - e.g. a legal guardian.
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
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
    * A selector of the type of consent being presented: ADR, Privacy, Treatment, Research.  This list is now extensible.
    */
  var scope: CodeableConcept
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The source can be contained inline (Attachment), referenced directly (Consent), referenced in a consent repository (DocumentReference), or simply by an identifier (Identifier), e.g. a CDA document id.
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes rejected and entered-in-error that mark the Consent as not currently valid.
    */
  var status: draft | proposed | active | rejected | inactive | `entered-in-error`
  
  /**
    * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
    */
  var verification: js.UndefOr[js.Array[ConsentVerification]] = js.undefined
}
object Consent {
  
  inline def apply(
    category: js.Array[CodeableConcept],
    scope: CodeableConcept,
    status: draft | proposed | active | rejected | inactive | `entered-in-error`
  ): Consent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], resourceType = "Consent", scope = scope.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consent] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOrganization(value: js.Array[Reference]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationVarargs(value: Reference*): Self = StObject.set(x, "organization", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPolicy(value: js.Array[ConsentPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyRule(value: CodeableConcept): Self = StObject.set(x, "policyRule", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuleUndefined: Self = StObject.set(x, "policyRule", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: ConsentPolicy*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setProvision(value: ConsentProvision): Self = StObject.set(x, "provision", value.asInstanceOf[js.Any])
    
    inline def setProvisionUndefined: Self = StObject.set(x, "provision", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Consent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScope(value: CodeableConcept): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachment(value: Attachment): Self = StObject.set(x, "sourceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSourceAttachmentUndefined: Self = StObject.set(x, "sourceAttachment", js.undefined)
    
    inline def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setStatus(value: draft | proposed | active | rejected | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: js.Array[ConsentVerification]): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    
    inline def setVerificationVarargs(value: ConsentVerification*): Self = StObject.set(x, "verification", js.Array(value*))
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
