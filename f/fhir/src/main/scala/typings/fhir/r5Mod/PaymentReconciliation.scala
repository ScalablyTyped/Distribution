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
  
  var _accountNumber: js.UndefOr[Element] = js.undefined
  
  var _authorization: js.UndefOr[Element] = js.undefined
  
  var _cardBrand: js.UndefOr[Element] = js.undefined
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _processor: js.UndefOr[Element] = js.undefined
  
  var _referenceNumber: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A portion of the account number, often the last 4 digits, used for verification not charging purposes.
    */
  var accountNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Distribution of the payment amount for a previously acknowledged payable.
    */
  var allocation: js.UndefOr[js.Array[PaymentReconciliationAllocation]] = js.undefined
  
  /**
    * Total payment amount as indicated on the financial instrument.
    */
  var amount: Money
  
  /**
    * An alphanumeric issued by the processor to confirm the successful issuance of payment.
    */
  var authorization: js.UndefOr[String] = js.undefined
  
  /**
    * The card brand such as debit, Visa, Amex etc. used if a card is the method of payment.
    */
  var cardBrand: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the resource was created.
    */
  var created: String
  
  /**
    * The date of payment as indicated on the financial instrument.
    */
  var date: String
  
  /**
    * A human readable description of the status of the request for the reconciliation.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Payment enterer if not the actual payment issuer.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The year and month (YYYY-MM) when the instrument, typically card, expires.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * May be needed to identify specific jurisdictional forms.
    */
  var formCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this payment reconciliation.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The type of the source such as patient or insurance.
    */
  var issuerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The workflow or activity which gave rise to or during which the payment ocurred such as a kiosk, deposit on account, periodic payment etc.
    */
  var kind: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location of the site or device for electronic transfers or physical location for cash payments.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The means of payment such as check, card cash, or electronic funds transfer.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The resource may be used to indicate that: the request has been held (queued) for processing; that it has been processed and errors found (error); that no errors were found and that some of the adjudication has been undertaken (partial) or that all of the adjudication has been undertaken (complete).
    */
  var outcome: js.UndefOr[queued | complete | error | partial] = js.undefined
  
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
    * The name of the card processor, etf processor, bank for checks.
    */
  var processor: js.UndefOr[String] = js.undefined
  
  /**
    * The check number, eft reference, car processor reference.
    */
  var referenceNumber: js.UndefOr[String] = js.undefined
  
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
    * The amount returned by the receiver which is excess to the amount payable, often referred to as 'change'.
    */
  var returnedAmount: js.UndefOr[Money] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
  
  /**
    * The amount offered by the issuer, typically applies to cash when the issuer provides an amount in bank note denominations equal to or excess of the amount actually being paid.
    */
  var tenderedAmount: js.UndefOr[Money] = js.undefined
  
  /**
    * Code to indicate the nature of the payment such as payment, adjustment.
    */
  var `type`: CodeableConcept
}
object PaymentReconciliation {
  
  inline def apply(
    amount: Money,
    created: String,
    date: String,
    status: active | cancelled | draft | `entered-in-error`,
    `type`: CodeableConcept
  ): PaymentReconciliation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = "PaymentReconciliation", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentReconciliation] (val x: Self) extends AnyVal {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
    
    inline def setAllocation(value: js.Array[PaymentReconciliationAllocation]): Self = StObject.set(x, "allocation", value.asInstanceOf[js.Any])
    
    inline def setAllocationUndefined: Self = StObject.set(x, "allocation", js.undefined)
    
    inline def setAllocationVarargs(value: PaymentReconciliationAllocation*): Self = StObject.set(x, "allocation", js.Array(value*))
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setCardBrand(value: String): Self = StObject.set(x, "cardBrand", value.asInstanceOf[js.Any])
    
    inline def setCardBrandUndefined: Self = StObject.set(x, "cardBrand", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setFormCode(value: CodeableConcept): Self = StObject.set(x, "formCode", value.asInstanceOf[js.Any])
    
    inline def setFormCodeUndefined: Self = StObject.set(x, "formCode", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIssuerType(value: CodeableConcept): Self = StObject.set(x, "issuerType", value.asInstanceOf[js.Any])
    
    inline def setIssuerTypeUndefined: Self = StObject.set(x, "issuerType", js.undefined)
    
    inline def setKind(value: CodeableConcept): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOutcome(value: queued | complete | error | partial): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPaymentIdentifier(value: Identifier): Self = StObject.set(x, "paymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdentifierUndefined: Self = StObject.set(x, "paymentIdentifier", js.undefined)
    
    inline def setPaymentIssuer(value: Reference): Self = StObject.set(x, "paymentIssuer", value.asInstanceOf[js.Any])
    
    inline def setPaymentIssuerUndefined: Self = StObject.set(x, "paymentIssuer", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProcessNote(value: js.Array[PaymentReconciliationProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: PaymentReconciliationProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    inline def setReferenceNumber(value: String): Self = StObject.set(x, "referenceNumber", value.asInstanceOf[js.Any])
    
    inline def setReferenceNumberUndefined: Self = StObject.set(x, "referenceNumber", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestor(value: Reference): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PaymentReconciliation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setReturnedAmount(value: Money): Self = StObject.set(x, "returnedAmount", value.asInstanceOf[js.Any])
    
    inline def setReturnedAmountUndefined: Self = StObject.set(x, "returnedAmount", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTenderedAmount(value: Money): Self = StObject.set(x, "tenderedAmount", value.asInstanceOf[js.Any])
    
    inline def setTenderedAmountUndefined: Self = StObject.set(x, "tenderedAmount", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_accountNumber(value: Element): Self = StObject.set(x, "_accountNumber", value.asInstanceOf[js.Any])
    
    inline def set_accountNumberUndefined: Self = StObject.set(x, "_accountNumber", js.undefined)
    
    inline def set_authorization(value: Element): Self = StObject.set(x, "_authorization", value.asInstanceOf[js.Any])
    
    inline def set_authorizationUndefined: Self = StObject.set(x, "_authorization", js.undefined)
    
    inline def set_cardBrand(value: Element): Self = StObject.set(x, "_cardBrand", value.asInstanceOf[js.Any])
    
    inline def set_cardBrandUndefined: Self = StObject.set(x, "_cardBrand", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_processor(value: Element): Self = StObject.set(x, "_processor", value.asInstanceOf[js.Any])
    
    inline def set_processorUndefined: Self = StObject.set(x, "_processor", js.undefined)
    
    inline def set_referenceNumber(value: Element): Self = StObject.set(x, "_referenceNumber", value.asInstanceOf[js.Any])
    
    inline def set_referenceNumberUndefined: Self = StObject.set(x, "_referenceNumber", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
