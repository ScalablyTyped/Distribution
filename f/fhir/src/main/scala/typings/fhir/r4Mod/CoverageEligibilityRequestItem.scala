package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityRequestItem
  extends StObject
     with BackboneElement {
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The plan/proposal/order describing the proposed service in detail.
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Patient diagnosis for which care is sought.
    */
  var diagnosis: js.UndefOr[js.Array[CoverageEligibilityRequestItemDiagnosis]] = js.undefined
  
  /**
    * Facility where the services will be provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical whether the treatment was outside the clinic or out of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm, ACHI, CCI).
    */
  var productOrService: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The practitioner who is responsible for the product or service to be rendered to the patient.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Exceptions, special conditions and supporting information applicable for this service or product line.
    */
  var supportingInfoSequence: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The amount charged to the patient by the provider for a single unit.
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object CoverageEligibilityRequestItem {
  
  inline def apply(): CoverageEligibilityRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageEligibilityRequestItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityRequestItem] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDiagnosis(value: js.Array[CoverageEligibilityRequestItemDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: CoverageEligibilityRequestItemDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setProductOrService(value: CodeableConcept): Self = StObject.set(x, "productOrService", value.asInstanceOf[js.Any])
    
    inline def setProductOrServiceUndefined: Self = StObject.set(x, "productOrService", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSupportingInfoSequence(value: js.Array[Double]): Self = StObject.set(x, "supportingInfoSequence", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoSequenceUndefined: Self = StObject.set(x, "supportingInfoSequence", js.undefined)
    
    inline def setSupportingInfoSequenceVarargs(value: Double*): Self = StObject.set(x, "supportingInfoSequence", js.Array(value*))
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
