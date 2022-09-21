package typings.fhir.r4Mod

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
  var adjudication: js.Array[ClaimResponseItemAdjudication]
  
  /**
    * For example: Providing a tooth code allows an insurer to identify a provider performing a filling on a tooth that was previously removed.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
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
  var productOrService: CodeableConcept
  
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
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date or dates when the service or product was supplied, performed or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The sequence number of the sub-details within the details within the claim item which this line is intended to replace.
    */
  var subdetailSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ClaimResponseAddItem {
  
  inline def apply(adjudication: js.Array[ClaimResponseItemAdjudication], productOrService: CodeableConcept): ClaimResponseAddItem = {
    val __obj = js.Dynamic.literal(adjudication = adjudication.asInstanceOf[js.Any], productOrService = productOrService.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseAddItem]
  }
  
  extension [Self <: ClaimResponseAddItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
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
    
    inline def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    inline def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    inline def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value*))
    
    inline def setProvider(value: js.Array[Reference]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: Reference*): Self = StObject.set(x, "provider", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def setSubSite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    inline def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    inline def setSubSiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "subSite", js.Array(value*))
    
    inline def setSubdetailSequence(value: js.Array[Double]): Self = StObject.set(x, "subdetailSequence", value.asInstanceOf[js.Any])
    
    inline def setSubdetailSequenceUndefined: Self = StObject.set(x, "subdetailSequence", js.undefined)
    
    inline def setSubdetailSequenceVarargs(value: Double*): Self = StObject.set(x, "subdetailSequence", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
