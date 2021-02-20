package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remittance resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ClaimResponse extends DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.native
  
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.native
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Response  number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.native
  
  /**
    * Insurance issuing organization
    */
  var insurer: js.UndefOr[Reference] = js.native
  
  /**
    * Line items
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.native
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  
  /**
    * Party to be paid any benefits payable
    */
  var payeeType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Payment details, if paid
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.native
  
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.native
  
  /**
    * Id of resource triggering adjudication
    */
  var request: js.UndefOr[Reference] = js.native
  
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.native
  
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.native
  
  /**
    * Funds reserved status
    */
  var reserved: js.UndefOr[Coding] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.native
  
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.native
  
  /**
    * Unallocated deductible
    */
  var unallocDeductable: js.UndefOr[Money] = js.native
}
object ClaimResponse {
  
  @scala.inline
  def apply(): ClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponse]
  }
  
  @scala.inline
  implicit class ClaimResponseMutableBuilder[Self <: ClaimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    @scala.inline
    def setAddItemVarargs(value: ClaimResponseAddItem*): Self = StObject.set(x, "addItem", js.Array(value :_*))
    
    @scala.inline
    def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    @scala.inline
    def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value :_*))
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    @scala.inline
    def setError(value: js.Array[ClaimResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: ClaimResponseError*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInsurance(value: js.Array[ClaimResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    @scala.inline
    def setInsuranceVarargs(value: ClaimResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value :_*))
    
    @scala.inline
    def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    @scala.inline
    def setItem(value: js.Array[ClaimResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ClaimResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setPayeeType(value: CodeableConcept): Self = StObject.set(x, "payeeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayeeTypeUndefined: Self = StObject.set(x, "payeeType", js.undefined)
    
    @scala.inline
    def setPayment(value: ClaimResponsePayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    @scala.inline
    def setProcessNote(value: js.Array[ClaimResponseProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: ClaimResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setReserved(value: Coding): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTotalBenefit(value: Money): Self = StObject.set(x, "totalBenefit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBenefitUndefined: Self = StObject.set(x, "totalBenefit", js.undefined)
    
    @scala.inline
    def setTotalCost(value: Money): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCostUndefined: Self = StObject.set(x, "totalCost", js.undefined)
    
    @scala.inline
    def setUnallocDeductable(value: Money): Self = StObject.set(x, "unallocDeductable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnallocDeductableUndefined: Self = StObject.set(x, "unallocDeductable", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
