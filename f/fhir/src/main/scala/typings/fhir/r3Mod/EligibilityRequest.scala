package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EligibilityRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Dental, Vision, Medical, Pharmacy, Rehab etc.
    */
  var benefitCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
    */
  var benefitSubCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The contract number of a business agreement which describes the terms and conditions.
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  
  /**
    * 1..1.
    */
  var coverage: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date when this resource was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Person who created the invoice/claim/pre-determination or pre-authorization.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Facility where the services were provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The Insurer who is target  of the request.
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The organization which is responsible for the services rendered to the patient.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * 1..1.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Immediate (STAT), best effort (NORMAL), deferred (DEFER).
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EligibilityRequest: typings.fhir.fhirStrings.EligibilityRequest
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the enclosed suite of services were performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The status of the resource instance.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
}
object EligibilityRequest {
  
  inline def apply(): EligibilityRequest = {
    val __obj = js.Dynamic.literal(resourceType = "EligibilityRequest")
    __obj.asInstanceOf[EligibilityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EligibilityRequest] (val x: Self) extends AnyVal {
    
    inline def setBenefitCategory(value: CodeableConcept): Self = StObject.set(x, "benefitCategory", value.asInstanceOf[js.Any])
    
    inline def setBenefitCategoryUndefined: Self = StObject.set(x, "benefitCategory", js.undefined)
    
    inline def setBenefitSubCategory(value: CodeableConcept): Self = StObject.set(x, "benefitSubCategory", value.asInstanceOf[js.Any])
    
    inline def setBenefitSubCategoryUndefined: Self = StObject.set(x, "benefitSubCategory", js.undefined)
    
    inline def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    inline def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EligibilityRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_businessArrangement(value: Element): Self = StObject.set(x, "_businessArrangement", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangementUndefined: Self = StObject.set(x, "_businessArrangement", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
