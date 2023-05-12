package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIngredientSpecifiedSubstance
  extends StObject
     with BackboneElement {
  
  /**
    * The specified substance.
    */
  var code: CodeableConcept
  
  /**
    * Confidentiality level of the specified substance as the ingredient.
    */
  var confidentiality: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The group of specified substance, e.g. group 1 to 4.
    */
  var group: CodeableConcept
  
  /**
    * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
    */
  var strength: js.UndefOr[js.Array[MedicinalProductIngredientSpecifiedSubstanceStrength]] = js.undefined
}
object MedicinalProductIngredientSpecifiedSubstance {
  
  inline def apply(code: CodeableConcept, group: CodeableConcept): MedicinalProductIngredientSpecifiedSubstance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIngredientSpecifiedSubstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIngredientSpecifiedSubstance] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConfidentiality(value: CodeableConcept): Self = StObject.set(x, "confidentiality", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityUndefined: Self = StObject.set(x, "confidentiality", js.undefined)
    
    inline def setGroup(value: CodeableConcept): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: js.Array[MedicinalProductIngredientSpecifiedSubstanceStrength]): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setStrengthVarargs(value: MedicinalProductIngredientSpecifiedSubstanceStrength*): Self = StObject.set(x, "strength", js.Array(value*))
  }
}
