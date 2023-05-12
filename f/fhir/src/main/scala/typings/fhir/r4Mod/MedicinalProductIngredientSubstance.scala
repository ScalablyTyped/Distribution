package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIngredientSubstance
  extends StObject
     with BackboneElement {
  
  /**
    * The ingredient substance.
    */
  var code: CodeableConcept
  
  /**
    * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
    */
  var strength: js.UndefOr[js.Array[MedicinalProductIngredientSpecifiedSubstanceStrength]] = js.undefined
}
object MedicinalProductIngredientSubstance {
  
  inline def apply(code: CodeableConcept): MedicinalProductIngredientSubstance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIngredientSubstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIngredientSubstance] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: js.Array[MedicinalProductIngredientSpecifiedSubstanceStrength]): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setStrengthVarargs(value: MedicinalProductIngredientSpecifiedSubstanceStrength*): Self = StObject.set(x, "strength", js.Array(value*))
  }
}
