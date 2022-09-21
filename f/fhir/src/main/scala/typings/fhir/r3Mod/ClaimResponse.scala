package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The first tier service adjudications for payor added services.
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  
  /**
    * Request for additional supporting or authorizing information, such as: documents, images or resources.
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date when the enclosed suite of services were performed or completed.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the status of the adjudication.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Mutually exclusive with Services Provided (Item).
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.undefined
  
  /**
    * The form to be used for printing the content.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Financial instrument by which payment information for health care.
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.undefined
  
  /**
    * The Insurer who produced this adjudicated response.
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The first tier service adjudications for submitted services.
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
  
  /**
    * Processing outcome errror, partial or complete processing.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Patient Resource.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Party to be reimbursed: Subscriber, provider, other.
    */
  var payeeType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Payment details for the claim if the claim has been paid.
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.undefined
  
  /**
    * Note text.
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.undefined
  
  /**
    * Original request resource referrence.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * The organization which is responsible for the services rendered to the patient.
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Status of funds reservation (For provider, for Patient, None).
    */
  var reserved: js.UndefOr[Coding] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClaimResponse: typings.fhir.fhirStrings.ClaimResponse
  
  /**
    * This element is labeled as a modifier because the status contains the code cancelled and entered-in-error that mark the response as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
  
  /**
    * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
    */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  
  /**
    * The total cost of the services reported.
    */
  var totalCost: js.UndefOr[Money] = js.undefined
  
  /**
    * The amount of deductible applied which was not allocated to any particular service line.
    */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}
object ClaimResponse {
  
  inline def apply(): ClaimResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ClaimResponse")
    __obj.asInstanceOf[ClaimResponse]
  }
  
  extension [Self <: ClaimResponse](x: Self) {
    
    inline def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ClaimResponseAddItem*): Self = StObject.set(x, "addItem", js.Array(value*))
    
    inline def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    inline def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    inline def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[ClaimResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: ClaimResponseError*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[ClaimResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: ClaimResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ClaimResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimResponseItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPayeeType(value: CodeableConcept): Self = StObject.set(x, "payeeType", value.asInstanceOf[js.Any])
    
    inline def setPayeeTypeUndefined: Self = StObject.set(x, "payeeType", js.undefined)
    
    inline def setPayment(value: ClaimResponsePayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setProcessNote(value: js.Array[ClaimResponseProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ClaimResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setReserved(value: Coding): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClaimResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalBenefit(value: Money): Self = StObject.set(x, "totalBenefit", value.asInstanceOf[js.Any])
    
    inline def setTotalBenefitUndefined: Self = StObject.set(x, "totalBenefit", js.undefined)
    
    inline def setTotalCost(value: Money): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalCostUndefined: Self = StObject.set(x, "totalCost", js.undefined)
    
    inline def setUnallocDeductable(value: Money): Self = StObject.set(x, "unallocDeductable", value.asInstanceOf[js.Any])
    
    inline def setUnallocDeductableUndefined: Self = StObject.set(x, "unallocDeductable", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
