package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional items
  */
trait ExplanationOfBenefitItemDetail
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Detail level adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Total additional item cost
    */
  var net: js.UndefOr[Money] = js.undefined
  
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Service instance
    */
  var sequence: positiveInt
  
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional items
    */
  var subDetail: js.UndefOr[js.Array[ExplanationOfBenefitItemDetailSubDetail]] = js.undefined
  
  /**
    * Group or type of product or service
    */
  var `type`: CodeableConcept
  
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object ExplanationOfBenefitItemDetail {
  
  @scala.inline
  def apply(sequence: positiveInt, `type`: CodeableConcept): ExplanationOfBenefitItemDetail = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitItemDetail]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitItemDetailMutableBuilder[Self <: ExplanationOfBenefitItemDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    @scala.inline
    def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setFactor(value: decimal): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    @scala.inline
    def setNet(value: Money): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    @scala.inline
    def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    @scala.inline
    def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    @scala.inline
    def setProgramCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramCodeUndefined: Self = StObject.set(x, "programCode", js.undefined)
    
    @scala.inline
    def setProgramCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "programCode", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    @scala.inline
    def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setSubDetail(value: js.Array[ExplanationOfBenefitItemDetailSubDetail]): Self = StObject.set(x, "subDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDetailUndefined: Self = StObject.set(x, "subDetail", js.undefined)
    
    @scala.inline
    def setSubDetailVarargs(value: ExplanationOfBenefitItemDetailSubDetail*): Self = StObject.set(x, "subDetail", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    @scala.inline
    def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value :_*))
    
    @scala.inline
    def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    @scala.inline
    def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
    
    @scala.inline
    def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    @scala.inline
    def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
