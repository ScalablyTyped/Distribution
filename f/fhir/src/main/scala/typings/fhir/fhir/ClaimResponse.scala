package typings.fhir.fhir

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
  implicit class ClaimResponseOps[Self <: ClaimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = this.set("_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disposition: Self = this.set("_disposition", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAddItemVarargs(value: ClaimResponseAddItem*): Self = this.set("addItem", js.Array(value :_*))
    
    @scala.inline
    def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = this.set("addItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddItem: Self = this.set("addItem", js.undefined)
    
    @scala.inline
    def setCommunicationRequestVarargs(value: Reference*): Self = this.set("communicationRequest", js.Array(value :_*))
    
    @scala.inline
    def setCommunicationRequest(value: js.Array[Reference]): Self = this.set("communicationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommunicationRequest: Self = this.set("communicationRequest", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: ClaimResponseError*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: js.Array[ClaimResponseError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInsuranceVarargs(value: ClaimResponseInsurance*): Self = this.set("insurance", js.Array(value :_*))
    
    @scala.inline
    def setInsurance(value: js.Array[ClaimResponseInsurance]): Self = this.set("insurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurance: Self = this.set("insurance", js.undefined)
    
    @scala.inline
    def setInsurer(value: Reference): Self = this.set("insurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsurer: Self = this.set("insurer", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ClaimResponseItem*): Self = this.set("item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[ClaimResponseItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    
    @scala.inline
    def setPayeeType(value: CodeableConcept): Self = this.set("payeeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayeeType: Self = this.set("payeeType", js.undefined)
    
    @scala.inline
    def setPayment(value: ClaimResponsePayment): Self = this.set("payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment: Self = this.set("payment", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: ClaimResponseProcessNote*): Self = this.set("processNote", js.Array(value :_*))
    
    @scala.inline
    def setProcessNote(value: js.Array[ClaimResponseProcessNote]): Self = this.set("processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessNote: Self = this.set("processNote", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = this.set("requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOrganization: Self = this.set("requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = this.set("requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestProvider: Self = this.set("requestProvider", js.undefined)
    
    @scala.inline
    def setReserved(value: Coding): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTotalBenefit(value: Money): Self = this.set("totalBenefit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBenefit: Self = this.set("totalBenefit", js.undefined)
    
    @scala.inline
    def setTotalCost(value: Money): Self = this.set("totalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCost: Self = this.set("totalCost", js.undefined)
    
    @scala.inline
    def setUnallocDeductable(value: Money): Self = this.set("unallocDeductable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnallocDeductable: Self = this.set("unallocDeductable", js.undefined)
  }
}
