package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remittance resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ClaimResponse
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.undefined
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Response  number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.undefined
  
  /**
    * Insurance issuing organization
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Line items
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Party to be paid any benefits payable
    */
  var payeeType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Payment details, if paid
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.undefined
  
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.undefined
  
  /**
    * Id of resource triggering adjudication
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Funds reserved status
    */
  var reserved: js.UndefOr[Coding] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.undefined
  
  /**
    * Unallocated deductible
    */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}
object ClaimResponse {
  
  inline def apply(): ClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponse]
  }
  
  extension [Self <: ClaimResponse](x: Self) {
    
    inline def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ClaimResponseAddItem*): Self = StObject.set(x, "addItem", js.Array(value :_*))
    
    inline def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    inline def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    inline def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value :_*))
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[ClaimResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: ClaimResponseError*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInsurance(value: js.Array[ClaimResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: ClaimResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value :_*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ClaimResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
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
    
    inline def setProcessNoteVarargs(value: ClaimResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setReserved(value: Coding): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
