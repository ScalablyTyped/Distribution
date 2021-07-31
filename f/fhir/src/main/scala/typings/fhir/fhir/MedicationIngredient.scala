package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Active or inactive ingredient
  */
trait MedicationIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'isActive'.
    */
  var _isActive: js.UndefOr[Element] = js.undefined
  
  /**
    * Quantity of ingredient present
    */
  var amount: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Active ingredient indicator
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The product contained
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The product contained
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object MedicationIngredient {
  
  @scala.inline
  def apply(): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationIngredient]
  }
  
  @scala.inline
  implicit class MedicationIngredientMutableBuilder[Self <: MedicationIngredient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Ratio): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    @scala.inline
    def set_isActive(value: Element): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isActiveUndefined: Self = StObject.set(x, "_isActive", js.undefined)
  }
}
