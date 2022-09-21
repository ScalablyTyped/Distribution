package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationIngredient
  extends StObject
     with BackboneElement {
  
  var _isActive: js.UndefOr[Element] = js.undefined
  
  /**
    * Indication of whether this ingredient affects the therapeutic action of the drug.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ingredient (substance or medication) that the ingredient.strength relates to.  This is represented as a concept from a code system or described in another resource (Substance or Medication).
    */
  var item: CodeableReference
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet but can also be expressed a quantity when the denominator is assumed to be 1 tablet.
    */
  var strengthCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet but can also be expressed a quantity when the denominator is assumed to be 1 tablet.
    */
  var strengthQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet but can also be expressed a quantity when the denominator is assumed to be 1 tablet.
    */
  var strengthRatio: js.UndefOr[Ratio] = js.undefined
}
object MedicationIngredient {
  
  inline def apply(item: CodeableReference): MedicationIngredient = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationIngredient]
  }
  
  extension [Self <: MedicationIngredient](x: Self) {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setStrengthCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "strengthCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStrengthCodeableConceptUndefined: Self = StObject.set(x, "strengthCodeableConcept", js.undefined)
    
    inline def setStrengthQuantity(value: Quantity): Self = StObject.set(x, "strengthQuantity", value.asInstanceOf[js.Any])
    
    inline def setStrengthQuantityUndefined: Self = StObject.set(x, "strengthQuantity", js.undefined)
    
    inline def setStrengthRatio(value: Ratio): Self = StObject.set(x, "strengthRatio", value.asInstanceOf[js.Any])
    
    inline def setStrengthRatioUndefined: Self = StObject.set(x, "strengthRatio", js.undefined)
    
    inline def set_isActive(value: Element): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    inline def set_isActiveUndefined: Self = StObject.set(x, "_isActive", js.undefined)
  }
}
