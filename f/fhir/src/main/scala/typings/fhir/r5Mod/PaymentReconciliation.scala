package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.queued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _paymentDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date when the resource was created.
    */
  var created: String
  
  /**
    * Distribution of the payment amount for a previously acknowledged payable.
    */
  var detail: js.UndefOr[js.Array[PaymentReconciliationDetail]] = js.undefined
  
  /**
    * A human readable description of the status of the request for the reconciliation.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * May be needed to identify specific jurisdictional forms.
    */
  var formCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this payment reconciliation.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The resource may be used to indicate that: the request has been held (queued) for processing; that it has been processed and errors found (error); that no errors were found and that some of the adjudication has been undertaken (partial) or that all of the adjudication has been undertaken (complete).
    */
  var outcome: js.UndefOr[queued | complete | error | partial] = js.undefined
  
  /**
    * Total payment amount as indicated on the financial instrument.
    */
  var paymentAmount: Money
  
  /**
    * The date of payment as indicated on the financial instrument.
    */
  var paymentDate: String
  
  /**
    * For example: EFT number or check number.
    */
  var paymentIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This party is also responsible for the reconciliation.
    */
  var paymentIssuer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period of time for which payments have been gathered into this bulk payment for settlement.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * A note that describes or explains the processing in a human readable form.
    */
  var processNote: js.UndefOr[js.Array[PaymentReconciliationProcessNote]] = js.undefined
  
  /**
    * Original request resource reference.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var requestor: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_PaymentReconciliation: typings.fhir.fhirStrings.PaymentReconciliation
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
}
object PaymentReconciliation {
  
  inline def apply(
    created: String,
    paymentAmount: Money,
    paymentDate: String,
    status: active | cancelled | draft | `entered-in-error`
  ): PaymentReconciliation = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], paymentAmount = paymentAmount.asInstanceOf[js.Any], paymentDate = paymentDate.asInstanceOf[js.Any], resourceType = "PaymentReconciliation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliation]
  }
  
  extension [Self <: PaymentReconciliation](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: js.Array[PaymentReconciliationDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: PaymentReconciliationDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setFormCode(value: CodeableConcept): Self = StObject.set(x, "formCode", value.asInstanceOf[js.Any])
    
    inline def setFormCodeUndefined: Self = StObject.set(x, "formCode", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOutcome(value: queued | complete | error | partial): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPaymentAmount(value: Money): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdentifier(value: Identifier): Self = StObject.set(x, "paymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdentifierUndefined: Self = StObject.set(x, "paymentIdentifier", js.undefined)
    
    inline def setPaymentIssuer(value: Reference): Self = StObject.set(x, "paymentIssuer", value.asInstanceOf[js.Any])
    
    inline def setPaymentIssuerUndefined: Self = StObject.set(x, "paymentIssuer", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProcessNote(value: js.Array[PaymentReconciliationProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: PaymentReconciliationProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestor(value: Reference): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PaymentReconciliation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_paymentDate(value: Element): Self = StObject.set(x, "_paymentDate", value.asInstanceOf[js.Any])
    
    inline def set_paymentDateUndefined: Self = StObject.set(x, "_paymentDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
