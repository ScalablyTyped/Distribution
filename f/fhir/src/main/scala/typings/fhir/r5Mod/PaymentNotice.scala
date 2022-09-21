package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentNotice
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _paymentDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The amount sent to the payee.
    */
  var amount: Money
  
  /**
    * The date when this resource was created.
    */
  var created: String
  
  /**
    * A unique identifier assigned to this payment notice.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The party who will receive or has received payment that is the subject of this notification.
    */
  var payee: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to the payment which is the subject of this notice.
    */
  var payment: Reference
  
  /**
    * The date when the above payment action occurred.
    */
  var paymentDate: js.UndefOr[String] = js.undefined
  
  /**
    * Typically paid: payment sent, cleared: payment received.
    */
  var paymentStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The party who is notified of the payment status.
    */
  var recipient: Reference
  
  /**
    * Reference of resource for which payment is being made.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_PaymentNotice: typings.fhir.fhirStrings.PaymentNotice
  
  /**
    * Reference of response to resource for which payment is being made.
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
}
object PaymentNotice {
  
  inline def apply(
    amount: Money,
    created: String,
    payment: Reference,
    recipient: Reference,
    status: active | cancelled | draft | `entered-in-error`
  ): PaymentNotice = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], resourceType = "PaymentNotice", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentNotice]
  }
  
  extension [Self <: PaymentNotice](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPayee(value: Reference): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayment(value: Reference): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
    
    inline def setPaymentStatus(value: CodeableConcept): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    inline def setPaymentStatusUndefined: Self = StObject.set(x, "paymentStatus", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRecipient(value: Reference): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PaymentNotice): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_paymentDate(value: Element): Self = StObject.set(x, "_paymentDate", value.asInstanceOf[js.Any])
    
    inline def set_paymentDateUndefined: Self = StObject.set(x, "_paymentDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
