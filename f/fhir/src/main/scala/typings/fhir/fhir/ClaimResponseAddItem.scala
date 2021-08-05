package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurer added line items
  */
trait ClaimResponseAddItem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Added items adjudication
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Added items details
    */
  var detail: js.UndefOr[js.Array[ClaimResponseAddItemDetail]] = js.undefined
  
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
    * Service instances
    */
  var sequenceLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Group, Service or Product
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimResponseAddItem {
  
  inline def apply(): ClaimResponseAddItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseAddItem]
  }
  
  extension [Self <: ClaimResponseAddItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[ClaimResponseAddItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimResponseAddItemDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    inline def setFee(value: Money): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value :_*))
    
    inline def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequenceLinkId(value: js.Array[positiveInt]): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSequenceLinkIdUndefined: Self = StObject.set(x, "sequenceLinkId", js.undefined)
    
    inline def setSequenceLinkIdVarargs(value: positiveInt*): Self = StObject.set(x, "sequenceLinkId", js.Array(value :_*))
    
    inline def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    inline def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    inline def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
    
    inline def set_sequenceLinkId(value: js.Array[Element]): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
    
    inline def set_sequenceLinkIdVarargs(value: Element*): Self = StObject.set(x, "_sequenceLinkId", js.Array(value :_*))
  }
}
