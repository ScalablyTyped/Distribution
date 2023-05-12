package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientSubstance
  extends StObject
     with BackboneElement {
  
  /**
    * A code or full resource that represents the ingredient's substance.
    */
  var code: CodeableReference
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. The allowed repetitions do not represent different strengths, but are different representations - mathematically equivalent - of a single strength.
    */
  var strength: js.UndefOr[js.Array[IngredientSubstanceStrength]] = js.undefined
}
object IngredientSubstance {
  
  inline def apply(code: CodeableReference): IngredientSubstance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngredientSubstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngredientSubstance] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableReference): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: js.Array[IngredientSubstanceStrength]): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setStrengthVarargs(value: IngredientSubstanceStrength*): Self = StObject.set(x, "strength", js.Array(value*))
  }
}
