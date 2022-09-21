package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeDefinitionalIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * A reference to the resource that provides information about the ingredient.
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
  
  /**
    * Indication of whether this ingredient affects the therapeutic action of the drug.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationKnowledgeDefinitionalIngredient {
  
  inline def apply(item: CodeableReference): MedicationKnowledgeDefinitionalIngredient = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeDefinitionalIngredient]
  }
  
  extension [Self <: MedicationKnowledgeDefinitionalIngredient](x: Self) {
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setStrengthCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "strengthCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStrengthCodeableConceptUndefined: Self = StObject.set(x, "strengthCodeableConcept", js.undefined)
    
    inline def setStrengthQuantity(value: Quantity): Self = StObject.set(x, "strengthQuantity", value.asInstanceOf[js.Any])
    
    inline def setStrengthQuantityUndefined: Self = StObject.set(x, "strengthQuantity", js.undefined)
    
    inline def setStrengthRatio(value: Ratio): Self = StObject.set(x, "strengthRatio", value.asInstanceOf[js.Any])
    
    inline def setStrengthRatioUndefined: Self = StObject.set(x, "strengthRatio", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
