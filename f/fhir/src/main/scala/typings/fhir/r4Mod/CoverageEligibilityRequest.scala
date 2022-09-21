package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`auth-requirements`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.benefits
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.discovery
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date when this resource was created.
    */
  var created: String
  
  /**
    * Person who created the request.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Facility where the services are intended to be provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * A unique identifier assigned to this coverage eligiblity request.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * All insurance coverages for the patient which may be applicable for reimbursement, of the products and services listed in the claim, are typically provided in the claim to allow insurers to confirm the ordering of the insurance coverages relative to local 'coordination of benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication of this claim. Coverages appearing before the focal Coverage in the list, and where 'subrogation=false', should provide a reference to the ClaimResponse containing the adjudication results of the prior claim.
    */
  var insurance: js.UndefOr[js.Array[CoverageEligibilityRequestInsurance]] = js.undefined
  
  /**
    * The Insurer who issued the coverage in question and is the recipient of the request.
    */
  var insurer: Reference
  
  /**
    * Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.
    */
  var item: js.UndefOr[js.Array[CoverageEligibilityRequestItem]] = js.undefined
  
  /**
    * 1..1.
    */
  var patient: Reference
  
  /**
    * When the requestor expects the processor to complete processing.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Typically this field would be 1..1 where this party is responsible for the eligibility request but not necessarily professionally responsible for the provision of the individual products and services listed below.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
    */
  var purpose: js.Array[`auth-requirements` | benefits | discovery | validation]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CoverageEligibilityRequest: typings.fhir.fhirStrings.CoverageEligibilityRequest
  
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
  
  /**
    * Often there are multiple jurisdiction specific valuesets which are required.
    */
  var supportingInfo: js.UndefOr[js.Array[CoverageEligibilityRequestSupportingInfo]] = js.undefined
}
object CoverageEligibilityRequest {
  
  inline def apply(
    created: String,
    insurer: Reference,
    patient: Reference,
    purpose: js.Array[`auth-requirements` | benefits | discovery | validation],
    status: active | cancelled | draft | `entered-in-error`
  ): CoverageEligibilityRequest = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], insurer = insurer.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], resourceType = "CoverageEligibilityRequest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityRequest]
  }
  
  extension [Self <: CoverageEligibilityRequest](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[CoverageEligibilityRequestInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: CoverageEligibilityRequestInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Array[CoverageEligibilityRequestItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: CoverageEligibilityRequestItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setPurpose(value: js.Array[`auth-requirements` | benefits | discovery | validation]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeVarargs(value: (`auth-requirements` | benefits | discovery | validation)*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CoverageEligibilityRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[CoverageEligibilityRequestSupportingInfo]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: CoverageEligibilityRequestSupportingInfo*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_purpose(value: js.Array[Element]): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_purposeVarargs(value: Element*): Self = StObject.set(x, "_purpose", js.Array(value*))
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
