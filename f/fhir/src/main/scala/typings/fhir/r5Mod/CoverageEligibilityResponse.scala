package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`auth-requirements`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.benefits
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.discovery
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.queued
import typings.fhir.fhirStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _preAuthRef: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date this resource was created.
    */
  var created: String
  
  /**
    * A human readable description of the status of the adjudication.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Errors encountered during the processing of the request.
    */
  var error: js.UndefOr[js.Array[CoverageEligibilityResponseError]] = js.undefined
  
  /**
    * May be needed to identify specific jurisdictional forms.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this coverage eligiblity request.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * All insurance coverages for the patient which may be applicable for reimbursement, of the products and services listed in the claim, are typically provided in the claim to allow insurers to confirm the ordering of the insurance coverages relative to local 'coordination of benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication of this claim. Coverages appearing before the focal Coverage in the list, and where 'subrogation=false', should provide a reference to the ClaimResponse containing the adjudication results of the prior claim.
    */
  var insurance: js.UndefOr[js.Array[CoverageEligibilityResponseInsurance]] = js.undefined
  
  /**
    * The Insurer who issued the coverage in question and is the author of the response.
    */
  var insurer: Reference
  
  /**
    * The resource may be used to indicate that: the request has been held (queued) for processing; that it has been processed and errors found (error); that no errors were found and that some of the adjudication has been undertaken (partial) or that all of the adjudication has been undertaken (complete).
    */
  var outcome: queued | complete | error | partial
  
  /**
    * The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
    */
  var patient: Reference
  
  /**
    * A reference from the Insurer to which these services pertain to be used on further communication and as proof that the request occurred.
    */
  var preAuthRef: js.UndefOr[String] = js.undefined
  
  /**
    * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
    */
  var purpose: js.Array[`auth-requirements` | benefits | discovery | validation]
  
  /**
    * Reference to the original request resource.
    */
  var request: Reference
  
  /**
    * Typically this field would be 1..1 where this party is responsible for the claim but not necessarily professionally responsible for the provision of the individual products and services listed below.
    */
  var requestor: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CoverageEligibilityResponse: typings.fhir.fhirStrings.CoverageEligibilityResponse
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
}
object CoverageEligibilityResponse {
  
  inline def apply(
    created: String,
    insurer: Reference,
    outcome: queued | complete | error | partial,
    patient: Reference,
    purpose: js.Array[`auth-requirements` | benefits | discovery | validation],
    request: Reference,
    status: active | cancelled | draft | `entered-in-error`
  ): CoverageEligibilityResponse = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], insurer = insurer.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resourceType = "CoverageEligibilityResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityResponse]
  }
  
  extension [Self <: CoverageEligibilityResponse](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[CoverageEligibilityResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: CoverageEligibilityResponseError*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[CoverageEligibilityResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: CoverageEligibilityResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: queued | complete | error | partial): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRef(value: String): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPurpose(value: js.Array[`auth-requirements` | benefits | discovery | validation]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeVarargs(value: (`auth-requirements` | benefits | discovery | validation)*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestor(value: Reference): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CoverageEligibilityResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_preAuthRef(value: Element): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_purpose(value: js.Array[Element]): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_purposeVarargs(value: Element*): Self = StObject.set(x, "_purpose", js.Array(value*))
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
