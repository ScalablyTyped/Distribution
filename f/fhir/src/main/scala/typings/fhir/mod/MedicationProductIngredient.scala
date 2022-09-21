package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationProductIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.
    */
  var amount: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The actual ingredient - either a substance (simple ingredient) or another medication.
    */
  var item: Reference
}
object MedicationProductIngredient {
  
  inline def apply(item: Reference): MedicationProductIngredient = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationProductIngredient]
  }
  
  extension [Self <: MedicationProductIngredient](x: Self) {
    
    inline def setAmount(value: Ratio): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setItem(value: Reference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
