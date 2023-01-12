package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationIngredient
  extends StObject
     with BackboneElement {
  
  var _isActive: js.UndefOr[Element] = js.undefined
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.
    */
  var amount: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Indication of whether this ingredient affects the therapeutic action of the drug.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The actual ingredient - either a substance (simple ingredient) or another medication.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The actual ingredient - either a substance (simple ingredient) or another medication.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object MedicationIngredient {
  
  inline def apply(): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationIngredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationIngredient] (val x: Self) extends AnyVal {
    
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
