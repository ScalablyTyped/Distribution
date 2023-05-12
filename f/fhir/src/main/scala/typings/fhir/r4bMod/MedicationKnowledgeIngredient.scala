package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeIngredient
  extends StObject
     with BackboneElement {
  
  var _isActive: js.UndefOr[Element] = js.undefined
  
  /**
    * Indication of whether this ingredient affects the therapeutic action of the drug.
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
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.
    */
  var strength: js.UndefOr[Ratio] = js.undefined
}
object MedicationKnowledgeIngredient {
  
  inline def apply(): MedicationKnowledgeIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeIngredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeIngredient] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    inline def setStrength(value: Ratio): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def set_isActive(value: Element): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    inline def set_isActiveUndefined: Self = StObject.set(x, "_isActive", js.undefined)
  }
}
