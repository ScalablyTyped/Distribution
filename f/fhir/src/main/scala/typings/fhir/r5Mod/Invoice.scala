package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.balanced
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.issued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invoice
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _cancelledReason: js.UndefOr[Element] = js.undefined
  
  var _creation: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _paymentTerms: js.UndefOr[Element] = js.undefined
  
  var _periodDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Systems posting the ChargeItems might not always be able to determine, which accounts the Items need to be places into. It is up to the potprocessing Financial System to apply internal rules to decide based on the Encounter/EpisodeOfCare/Patient/Coverage context and the type of ChargeItem, which Account is appropriate.
    */
  var account: js.UndefOr[Reference] = js.undefined
  
  /**
    * Derived Profiles may choose to add invariants requiring this field to be populated if either priceOverride or factorOverride have been filled.
    */
  var cancelledReason: js.UndefOr[String] = js.undefined
  
  /**
    * The list of types may be constrained as appropriate for the type of charge item.
    */
  var creation: js.UndefOr[String] = js.undefined
  
  /**
    * Depricared by the element below.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Practitioners and Devices can be associated with multiple organizations. It has to be made clear, on behalf of which Organization the services have been rendered.
    */
  var issuer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Each line item represents one charge for goods and services rendered. Details such.ofType(date), code and amount are found in the referenced ChargeItem resource.
    */
  var lineItem: js.UndefOr[js.Array[InvoiceLineItem]] = js.undefined
  
  /**
    * Comments made about the invoice by the issuer, subject, or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Indicates who or what performed or participated in the charged service.
    */
  var participant: js.UndefOr[js.Array[InvoiceParticipant]] = js.undefined
  
  /**
    * Derived Profiles may chose to add invariants requiring this field to be populated if either priceOverride or factorOverride have been filled.
    */
  var paymentTerms: js.UndefOr[String] = js.undefined
  
  /**
    * Date/time(s) range of services included in this invoice.
    */
  var periodDate: js.UndefOr[String] = js.undefined
  
  /**
    * Date/time(s) range of services included in this invoice.
    */
  var periodPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The individual or Organization responsible for balancing of this invoice.
    */
  var recipient: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Invoice: typings.fhir.fhirStrings.Invoice
  
  /**
    * The current state of the Invoice.
    */
  var status: draft | issued | balanced | cancelled | `entered-in-error`
  
  /**
    * The individual or set of individuals receiving the goods and services billed in this invoice.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * There is no reason to carry the price in the instance of a ChargeItem unless circumstances require a manual override. The list prices or are usually defined in a back catalogue of the billing codes  (see ChargeItem.definition). Derived profiles may require a ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
    */
  var totalGross: js.UndefOr[Money] = js.undefined
  
  /**
    * There is no reason to carry the price in the instance of a ChargeItem unless circumstances require a manual override. The list prices or are usually defined in a back catalogue of the billing codes  (see ChargeItem.definition). Derived profiles may require a ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
    */
  var totalNet: js.UndefOr[Money] = js.undefined
  
  /**
    * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
    */
  var totalPriceComponent: js.UndefOr[js.Array[MonetaryComponent]] = js.undefined
  
  /**
    * Type of Invoice depending on domain, realm an usage (e.g. internal/external, dental, preliminary).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Invoice {
  
  inline def apply(status: draft | issued | balanced | cancelled | `entered-in-error`): Invoice = {
    val __obj = js.Dynamic.literal(resourceType = "Invoice", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invoice] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Reference): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCancelledReason(value: String): Self = StObject.set(x, "cancelledReason", value.asInstanceOf[js.Any])
    
    inline def setCancelledReasonUndefined: Self = StObject.set(x, "cancelledReason", js.undefined)
    
    inline def setCreation(value: String): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIssuer(value: Reference): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setLineItem(value: js.Array[InvoiceLineItem]): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
    
    inline def setLineItemUndefined: Self = StObject.set(x, "lineItem", js.undefined)
    
    inline def setLineItemVarargs(value: InvoiceLineItem*): Self = StObject.set(x, "lineItem", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setParticipant(value: js.Array[InvoiceParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: InvoiceParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPaymentTerms(value: String): Self = StObject.set(x, "paymentTerms", value.asInstanceOf[js.Any])
    
    inline def setPaymentTermsUndefined: Self = StObject.set(x, "paymentTerms", js.undefined)
    
    inline def setPeriodDate(value: String): Self = StObject.set(x, "periodDate", value.asInstanceOf[js.Any])
    
    inline def setPeriodDateUndefined: Self = StObject.set(x, "periodDate", js.undefined)
    
    inline def setPeriodPeriod(value: Period): Self = StObject.set(x, "periodPeriod", value.asInstanceOf[js.Any])
    
    inline def setPeriodPeriodUndefined: Self = StObject.set(x, "periodPeriod", js.undefined)
    
    inline def setRecipient(value: Reference): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Invoice): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | issued | balanced | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTotalGross(value: Money): Self = StObject.set(x, "totalGross", value.asInstanceOf[js.Any])
    
    inline def setTotalGrossUndefined: Self = StObject.set(x, "totalGross", js.undefined)
    
    inline def setTotalNet(value: Money): Self = StObject.set(x, "totalNet", value.asInstanceOf[js.Any])
    
    inline def setTotalNetUndefined: Self = StObject.set(x, "totalNet", js.undefined)
    
    inline def setTotalPriceComponent(value: js.Array[MonetaryComponent]): Self = StObject.set(x, "totalPriceComponent", value.asInstanceOf[js.Any])
    
    inline def setTotalPriceComponentUndefined: Self = StObject.set(x, "totalPriceComponent", js.undefined)
    
    inline def setTotalPriceComponentVarargs(value: MonetaryComponent*): Self = StObject.set(x, "totalPriceComponent", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_cancelledReason(value: Element): Self = StObject.set(x, "_cancelledReason", value.asInstanceOf[js.Any])
    
    inline def set_cancelledReasonUndefined: Self = StObject.set(x, "_cancelledReason", js.undefined)
    
    inline def set_creation(value: Element): Self = StObject.set(x, "_creation", value.asInstanceOf[js.Any])
    
    inline def set_creationUndefined: Self = StObject.set(x, "_creation", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_paymentTerms(value: Element): Self = StObject.set(x, "_paymentTerms", value.asInstanceOf[js.Any])
    
    inline def set_paymentTermsUndefined: Self = StObject.set(x, "_paymentTerms", js.undefined)
    
    inline def set_periodDate(value: Element): Self = StObject.set(x, "_periodDate", value.asInstanceOf[js.Any])
    
    inline def set_periodDateUndefined: Self = StObject.set(x, "_periodDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
