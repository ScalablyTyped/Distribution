package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength
  extends StObject
     with BackboneElement {
  
  var _measurementPoint: js.UndefOr[Element] = js.undefined
  
  /**
    * The country or countries for which the strength range applies.
    */
  var country: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For when strength is measured at a particular point or distance.
    */
  var measurementPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Strength expressed in terms of a reference substance.
    */
  var strength: Ratio
  
  /**
    * Strength expressed in terms of a reference substance.
    */
  var strengthLowLimit: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Relevant reference substance.
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength {
  
  inline def apply(strength: Ratio): MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setMeasurementPoint(value: String): Self = StObject.set(x, "measurementPoint", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPointUndefined: Self = StObject.set(x, "measurementPoint", js.undefined)
    
    inline def setStrength(value: Ratio): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthLowLimit(value: Ratio): Self = StObject.set(x, "strengthLowLimit", value.asInstanceOf[js.Any])
    
    inline def setStrengthLowLimitUndefined: Self = StObject.set(x, "strengthLowLimit", js.undefined)
    
    inline def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    inline def set_measurementPoint(value: Element): Self = StObject.set(x, "_measurementPoint", value.asInstanceOf[js.Any])
    
    inline def set_measurementPointUndefined: Self = StObject.set(x, "_measurementPoint", js.undefined)
  }
}
