package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitAddItem
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudications results.
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  
  /**
    * Health Care Service Type Codes  to identify the classification of service or benefits.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The second tier service adjudications for payor added services.
    */
  var detail: js.UndefOr[js.Array[ExplanationOfBenefitAddItemDetail]] = js.undefined
  
  /**
    * The fee charged for the professional service or product.
    */
  var fee: js.UndefOr[Money] = js.undefined
  
  /**
    * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A list of note references to the notes provided below.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The type of reveneu or cost center providing the product and/or service.
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * List of input service items which this service line is intended to replace.
    */
  var sequenceLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitAddItem {
  
  inline def apply(): ExplanationOfBenefitAddItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitAddItem]
  }
  
  extension [Self <: ExplanationOfBenefitAddItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetail(value: js.Array[ExplanationOfBenefitAddItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ExplanationOfBenefitAddItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setFee(value: Money): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setRevenue(value: CodeableConcept): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setSequenceLinkId(value: js.Array[Double]): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSequenceLinkIdUndefined: Self = StObject.set(x, "sequenceLinkId", js.undefined)
    
    inline def setSequenceLinkIdVarargs(value: Double*): Self = StObject.set(x, "sequenceLinkId", js.Array(value*))
    
    inline def setService(value: CodeableConcept): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
