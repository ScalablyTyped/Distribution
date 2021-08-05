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
  
  inline def apply(): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationIngredient]
  }
  
  extension [Self <: MedicationIngredient](x: Self) {
    
    inline def setAmount(value: Ratio): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    inline def set_isActive(value: Element): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    inline def set_isActiveUndefined: Self = StObject.set(x, "_isActive", js.undefined)
  }
}
