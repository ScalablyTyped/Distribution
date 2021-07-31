package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Added items details
  */
trait ClaimResponseAddItemDetail
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Added items detail adjudication
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Professional fee or Product charge
    */
  var fee: js.UndefOr[Money] = js.undefined
  
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Service or Product
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimResponseAddItemDetail {
  
  @scala.inline
  def apply(): ClaimResponseAddItemDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseAddItemDetail]
  }
  
  @scala.inline
  implicit class ClaimResponseAddItemDetailMutableBuilder[Self <: ClaimResponseAddItemDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    @scala.inline
    def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setFee(value: Money): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    @scala.inline
    def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    @scala.inline
    def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    @scala.inline
    def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    @scala.inline
    def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
  }
}
