package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.claim_
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.preauthorization
import typings.fhir.fhirStrings.predetermination
import typings.fhir.fhirStrings.queued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _preAuthRef: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * The first-tier service adjudications for payor added product or service lines.
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  
  /**
    * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * For example: professional reports, documents, images, clinical resources, or accident reports.
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date this resource was created.
    */
  var created: String
  
  /**
    * A human readable description of the status of the adjudication.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * If the request contains errors then an error element should be provided and no adjudication related sections (item, addItem, or payment) should be present.
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.undefined
  
  /**
    * Needed to permit insurers to include the actual form.
    */
  var form: js.UndefOr[Attachment] = js.undefined
  
  /**
    * May be needed to identify specific jurisdictional forms.
    */
  var formCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Fund would be release by a future claim quoting the preAuthRef of this response. Examples of values include: provider, patient, none.
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this claim response.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * All insurance coverages for the patient which may be applicable for reimbursement, of the products and services listed in the claim, are typically provided in the claim to allow insurers to confirm the ordering of the insurance coverages relative to local 'coordination of benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication of this claim. Coverages appearing before the focal Coverage in the list, and where 'subrogation=false', should provide a reference to the ClaimResponse containing the adjudication results of the prior claim.
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.undefined
  
  /**
    * The party responsible for authorization, adjudication and reimbursement.
    */
  var insurer: Reference
  
  /**
    * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
  
  /**
    * The resource may be used to indicate that: the request has been held (queued) for processing; that it has been processed and errors found (error); that no errors were found and that some of the adjudication has been undertaken (partial) or that all of the adjudication has been undertaken (complete).
    */
  var outcome: queued | complete | error | partial
  
  /**
    * The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for facast reimbursement is sought.
    */
  var patient: Reference
  
  /**
    * Type of Party to be reimbursed: subscriber, provider, other.
    */
  var payeeType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Payment details for the adjudication of the claim.
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.undefined
  
  /**
    * The time frame during which this authorization is effective.
    */
  var preAuthPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This value is only present on preauthorization adjudications.
    */
  var preAuthRef: js.UndefOr[String] = js.undefined
  
  /**
    * A note that describes or explains adjudication results in a human readable form.
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.undefined
  
  /**
    * Original request resource reference.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Typically this field would be 1..1 where this party is responsible for the claim but not necessarily professionally responsible for the provision of the individual products and services listed below.
    */
  var requestor: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClaimResponse: typings.fhir.fhirStrings.ClaimResponse
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
  
  /**
    * This may contain the local bill type codes, for example the US UB-04 bill type code or the CMS bill type.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Totals for amounts submitted, co-pays, benefits payable etc.
    */
  var total: js.UndefOr[js.Array[ClaimResponseTotal]] = js.undefined
  
  /**
    * This may contain the local bill type codes, for example the US UB-04 bill type code or the CMS bill type.
    */
  var `type`: CodeableConcept
  
  /**
    * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
    */
  var use: claim_ | preauthorization | predetermination
}
object ClaimResponse {
  
  inline def apply(
    created: String,
    insurer: Reference,
    outcome: queued | complete | error | partial,
    patient: Reference,
    status: active | cancelled | draft | `entered-in-error`,
    `type`: CodeableConcept,
    use: claim_ | preauthorization | predetermination
  ): ClaimResponse = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], insurer = insurer.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ClaimResponse", status = status.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponse] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ClaimResponseAddItem*): Self = StObject.set(x, "addItem", js.Array(value*))
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    inline def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    inline def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[ClaimResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: ClaimResponseError*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setForm(value: Attachment): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormCode(value: CodeableConcept): Self = StObject.set(x, "formCode", value.asInstanceOf[js.Any])
    
    inline def setFormCodeUndefined: Self = StObject.set(x, "formCode", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFundsReserve(value: CodeableConcept): Self = StObject.set(x, "fundsReserve", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveUndefined: Self = StObject.set(x, "fundsReserve", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[ClaimResponseInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: ClaimResponseInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Array[ClaimResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimResponseItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setOutcome(value: queued | complete | error | partial): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPayeeType(value: CodeableConcept): Self = StObject.set(x, "payeeType", value.asInstanceOf[js.Any])
    
    inline def setPayeeTypeUndefined: Self = StObject.set(x, "payeeType", js.undefined)
    
    inline def setPayment(value: ClaimResponsePayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setPreAuthPeriod(value: Period): Self = StObject.set(x, "preAuthPeriod", value.asInstanceOf[js.Any])
    
    inline def setPreAuthPeriodUndefined: Self = StObject.set(x, "preAuthPeriod", js.undefined)
    
    inline def setPreAuthRef(value: String): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setProcessNote(value: js.Array[ClaimResponseProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ClaimResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestor(value: Reference): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClaimResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setTotal(value: js.Array[ClaimResponseTotal]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotalVarargs(value: ClaimResponseTotal*): Self = StObject.set(x, "total", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse(value: claim_ | preauthorization | predetermination): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_preAuthRef(value: Element): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
