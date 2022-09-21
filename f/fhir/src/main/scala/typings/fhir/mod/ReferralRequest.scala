package typings.fhir.mod

import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferralRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _dateSent: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Date/DateTime of creation for draft requests and date of activation for active requests.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Date/DateTime the request for referral or transfer of care is sent by the author.
    */
  var dateSent: js.UndefOr[String] = js.undefined
  
  /**
    * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The encounter at which the request for referral or transfer of care is initiated.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Use cases: (1) to indicate that the requested service is not to happen before a specified date, and saving the start date in Period.start; (2) to indicate that the requested service must happen before a specified date, and saving the end date in Period.end; (3) to indicate that the requested service must happen during the specified dates ("start" and "end" values).
    */
  var fulfillmentTime: js.UndefOr[Period] = js.undefined
  
  /**
    * Business identifier that uniquely identifies the referral/care transfer request instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The patient who is the subject of a referral or transfer of care request.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * An indication of the urgency of referral (or where applicable the type of transfer of care) request.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral).
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ReferralRequest: typings.fhir.fhirStrings.ReferralRequest
  
  /**
    * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.
    */
  var serviceRequested: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.
    */
  var specialty: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The workflow status of the referral or transfer of care request.
    */
  var status: draft | requested | active | cancelled | accepted | rejected | completed
  
  /**
    * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An indication of the type of referral (or where applicable the type of transfer of care) request.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ReferralRequest {
  
  inline def apply(status: draft | requested | active | cancelled | accepted | rejected | completed): ReferralRequest = {
    val __obj = js.Dynamic.literal(resourceType = "ReferralRequest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferralRequest]
  }
  
  extension [Self <: ReferralRequest](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateSent(value: String): Self = StObject.set(x, "dateSent", value.asInstanceOf[js.Any])
    
    inline def setDateSentUndefined: Self = StObject.set(x, "dateSent", js.undefined)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFulfillmentTime(value: Period): Self = StObject.set(x, "fulfillmentTime", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTimeUndefined: Self = StObject.set(x, "fulfillmentTime", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ReferralRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceRequested(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceRequested", value.asInstanceOf[js.Any])
    
    inline def setServiceRequestedUndefined: Self = StObject.set(x, "serviceRequested", js.undefined)
    
    inline def setServiceRequestedVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceRequested", js.Array(value*))
    
    inline def setSpecialty(value: CodeableConcept): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setStatus(value: draft | requested | active | cancelled | accepted | rejected | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateSent(value: Element): Self = StObject.set(x, "_dateSent", value.asInstanceOf[js.Any])
    
    inline def set_dateSentUndefined: Self = StObject.set(x, "_dateSent", js.undefined)
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
