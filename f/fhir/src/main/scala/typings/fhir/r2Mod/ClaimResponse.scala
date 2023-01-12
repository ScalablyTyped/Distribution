package typings.fhir.r2Mod

import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.error
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
  
  var _paymentDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The first tier service adjudications for payor added services.
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  
  /**
    * Health care programs and insurers are significant payors of health service costs.
    */
  var coverage: js.UndefOr[js.Array[ClaimResponseCoverage]] = js.undefined
  
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
  var form: js.UndefOr[Coding] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The first tier service adjudications for submitted services.
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
  
  /**
    * Note text.
    */
  var note: js.UndefOr[js.Array[ClaimResponseNote]] = js.undefined
  
  /**
    * The Insurer who produced this adjudicated response.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Knowledge of the original version can inform the processing of this instance so that information which is processable by the originating system may be generated.
    */
  var originalRuleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * Transaction status: error, complete.
    */
  var outcome: js.UndefOr[complete | error] = js.undefined
  
  /**
    * Party to be reimbursed: Subscriber, provider, other.
    */
  var payeeType: js.UndefOr[Coding] = js.undefined
  
  /**
    * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
    */
  var paymentAdjustment: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Reason for the payment adjustment.
    */
  var paymentAdjustmentReason: js.UndefOr[Coding] = js.undefined
  
  /**
    * Payable less any payment adjustment.
    */
  var paymentAmount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Estimated payment data.
    */
  var paymentDate: js.UndefOr[String] = js.undefined
  
  /**
    * Payment identifier.
    */
  var paymentRef: js.UndefOr[Identifier] = js.undefined
  
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
    * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
    */
  var ruleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
    */
  var totalBenefit: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This is a check value that the receiver calculates and returns.
    */
  var totalCost: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The amount of deductible applied which was not allocated to any particular service line.
    */
  var unallocDeductable: js.UndefOr[Quantity] = js.undefined
}
object ClaimResponse {
  
  inline def apply(): ClaimResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ClaimResponse")
    __obj.asInstanceOf[ClaimResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponse] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: js.Array[ClaimResponseAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ClaimResponseAddItem*): Self = StObject.set(x, "addItem", js.Array(value*))
    
    inline def setCoverage(value: js.Array[ClaimResponseCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCoverageVarargs(value: ClaimResponseCoverage*): Self = StObject.set(x, "coverage", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[ClaimResponseError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: ClaimResponseError*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setForm(value: Coding): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setItem(value: js.Array[ClaimResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimResponseItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setNote(value: js.Array[ClaimResponseNote]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: ClaimResponseNote*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOriginalRuleset(value: Coding): Self = StObject.set(x, "originalRuleset", value.asInstanceOf[js.Any])
    
    inline def setOriginalRulesetUndefined: Self = StObject.set(x, "originalRuleset", js.undefined)
    
    inline def setOutcome(value: complete | error): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPayeeType(value: Coding): Self = StObject.set(x, "payeeType", value.asInstanceOf[js.Any])
    
    inline def setPayeeTypeUndefined: Self = StObject.set(x, "payeeType", js.undefined)
    
    inline def setPaymentAdjustment(value: Quantity): Self = StObject.set(x, "paymentAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPaymentAdjustmentReason(value: Coding): Self = StObject.set(x, "paymentAdjustmentReason", value.asInstanceOf[js.Any])
    
    inline def setPaymentAdjustmentReasonUndefined: Self = StObject.set(x, "paymentAdjustmentReason", js.undefined)
    
    inline def setPaymentAdjustmentUndefined: Self = StObject.set(x, "paymentAdjustment", js.undefined)
    
    inline def setPaymentAmount(value: Quantity): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentAmountUndefined: Self = StObject.set(x, "paymentAmount", js.undefined)
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
    
    inline def setPaymentRef(value: Identifier): Self = StObject.set(x, "paymentRef", value.asInstanceOf[js.Any])
    
    inline def setPaymentRefUndefined: Self = StObject.set(x, "paymentRef", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setReserved(value: Coding): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClaimResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRuleset(value: Coding): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "ruleset", js.undefined)
    
    inline def setTotalBenefit(value: Quantity): Self = StObject.set(x, "totalBenefit", value.asInstanceOf[js.Any])
    
    inline def setTotalBenefitUndefined: Self = StObject.set(x, "totalBenefit", js.undefined)
    
    inline def setTotalCost(value: Quantity): Self = StObject.set(x, "totalCost", value.asInstanceOf[js.Any])
    
    inline def setTotalCostUndefined: Self = StObject.set(x, "totalCost", js.undefined)
    
    inline def setUnallocDeductable(value: Quantity): Self = StObject.set(x, "unallocDeductable", value.asInstanceOf[js.Any])
    
    inline def setUnallocDeductableUndefined: Self = StObject.set(x, "unallocDeductable", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_paymentDate(value: Element): Self = StObject.set(x, "_paymentDate", value.asInstanceOf[js.Any])
    
    inline def set_paymentDateUndefined: Self = StObject.set(x, "_paymentDate", js.undefined)
  }
}
