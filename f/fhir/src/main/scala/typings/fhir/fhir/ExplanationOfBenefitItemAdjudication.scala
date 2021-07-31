package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adjudication details
  */
trait ExplanationOfBenefitItemAdjudication
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Monetary amount
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Adjudication category such as co-pay, eligible, benefit, etc.
    */
  var category: CodeableConcept
  
  /**
    * Explanation of Adjudication outcome
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Non-monitory value
    */
  var value: js.UndefOr[decimal] = js.undefined
}
object ExplanationOfBenefitItemAdjudication {
  
  @scala.inline
  def apply(category: CodeableConcept): ExplanationOfBenefitItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitItemAdjudication]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitItemAdjudicationMutableBuilder[Self <: ExplanationOfBenefitItemAdjudication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setValue(value: decimal): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
