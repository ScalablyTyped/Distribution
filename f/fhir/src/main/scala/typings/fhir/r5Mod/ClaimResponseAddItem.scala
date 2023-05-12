package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseAddItem
  extends StObject
     with BackboneElement {
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The adjudication results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * Physical location where the service is performed or applies.
    */
  var bodySite: js.UndefOr[js.Array[ClaimResponseAddItemBodySite]] = js.undefined
  
  /**
    * The second-tier service adjudications for payor added services.
    */
  var detail: js.UndefOr[js.Array[ClaimResponseAddItemDetail]] = js.undefined
  
  /**
    * The sequence number of the details within the claim item which this line is intended to replace.
    */
  var detailSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * Claim items which this service line is intended to replace.
    */
  var itemSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the product or service was provided.
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical whether the treatment was outside the clinic or outside of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example, the formula: quantity * unitPrice * factor  = net. Quantity and factor are assumed to be 1 if not supplied.
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If this is an actual service or product line, i.e. not a Group, then use code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being grouped e.g. 'glasses' or 'compound'.
    */
  var productOrService: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This contains the end of a range of product, service, drug or other billing codes for the item. This element is not used when the .productOrService is a group code. This value may only be present when a .productOfService code has been provided to convey the start of the range. Typically this value may be used only with preauthorizations and not with claims.
    */
  var productOrServiceEnd: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example: Neonatal program, child dental program or drug users recovery program.
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The providers who are authorized for the services rendered to the patient.
    */
  var provider: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Request or Referral for Goods or Service to be rendered.
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of revenue or cost center providing the product and/or service.
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The high-level results of the adjudication if adjudication has been performed.
    */
  var reviewOutcome: js.UndefOr[ClaimResponseItemReviewOutcome] = js.undefined
  
  /**
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The sequence number of the sub-details within the details within the claim item which this line is intended to replace.
    */
  var subdetailSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The total of taxes applicable for this product or service.
    */
  var tax: js.UndefOr[Money] = js.undefined
  
  /**
    * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
    */
  var traceNumber: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ClaimResponseAddItem {
  
  inline def apply(): ClaimResponseAddItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseAddItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseAddItem] (val x: Self) extends AnyVal {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setBodySite(value: js.Array[ClaimResponseAddItemBodySite]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: ClaimResponseAddItemBodySite*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setDetail(value: js.Array[ClaimResponseAddItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailSequence(value: js.Array[Double]): Self = StObject.set(x, "detailSequence", value.asInstanceOf[js.Any])
    
    inline def setDetailSequenceUndefined: Self = StObject.set(x, "detailSequence", js.undefined)
    
    inline def setDetailSequenceVarargs(value: Double*): Self = StObject.set(x, "detailSequence", js.Array(value*))
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimResponseAddItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setItemSequence(value: js.Array[Double]): Self = StObject.set(x, "itemSequence", value.asInstanceOf[js.Any])
    
    inline def setItemSequenceUndefined: Self = StObject.set(x, "itemSequence", js.undefined)
    
    inline def setItemSequenceVarargs(value: Double*): Self = StObject.set(x, "itemSequence", js.Array(value*))
    
    inline def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    inline def setLocationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "locationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeableConceptUndefined: Self = StObject.set(x, "locationCodeableConcept", js.undefined)
    
    inline def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    inline def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setProductOrService(value: CodeableConcept): Self = StObject.set(x, "productOrService", value.asInstanceOf[js.Any])
    
    inline def setProductOrServiceEnd(value: CodeableConcept): Self = StObject.set(x, "productOrServiceEnd", value.asInstanceOf[js.Any])
    
    inline def setProductOrServiceEndUndefined: Self = StObject.set(x, "productOrServiceEnd", js.undefined)
    
    inline def setProductOrServiceUndefined: Self = StObject.set(x, "productOrService", js.undefined)
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value*))
    
    inline def setProvider(value: js.Array[Reference]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: Reference*): Self = StObject.set(x, "provider", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setReviewOutcome(value: ClaimResponseItemReviewOutcome): Self = StObject.set(x, "reviewOutcome", value.asInstanceOf[js.Any])
    
    inline def setReviewOutcomeUndefined: Self = StObject.set(x, "reviewOutcome", js.undefined)
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setSubdetailSequence(value: js.Array[Double]): Self = StObject.set(x, "subdetailSequence", value.asInstanceOf[js.Any])
    
    inline def setSubdetailSequenceUndefined: Self = StObject.set(x, "subdetailSequence", js.undefined)
    
    inline def setSubdetailSequenceVarargs(value: Double*): Self = StObject.set(x, "subdetailSequence", js.Array(value*))
    
    inline def setTax(value: Money): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setTraceNumber(value: js.Array[Identifier]): Self = StObject.set(x, "traceNumber", value.asInstanceOf[js.Any])
    
    inline def setTraceNumberUndefined: Self = StObject.set(x, "traceNumber", js.undefined)
    
    inline def setTraceNumberVarargs(value: Identifier*): Self = StObject.set(x, "traceNumber", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
