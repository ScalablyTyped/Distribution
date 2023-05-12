package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientSubstanceStrengthReferenceStrength
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
  var strengthRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Strength expressed in terms of a reference substance.
    */
  var strengthRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * Relevant reference substance.
    */
  var substance: js.UndefOr[CodeableReference] = js.undefined
}
object IngredientSubstanceStrengthReferenceStrength {
  
  inline def apply(): IngredientSubstanceStrengthReferenceStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngredientSubstanceStrengthReferenceStrength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngredientSubstanceStrengthReferenceStrength] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setMeasurementPoint(value: String): Self = StObject.set(x, "measurementPoint", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPointUndefined: Self = StObject.set(x, "measurementPoint", js.undefined)
    
    inline def setStrengthRatio(value: Ratio): Self = StObject.set(x, "strengthRatio", value.asInstanceOf[js.Any])
    
    inline def setStrengthRatioRange(value: RatioRange): Self = StObject.set(x, "strengthRatioRange", value.asInstanceOf[js.Any])
    
    inline def setStrengthRatioRangeUndefined: Self = StObject.set(x, "strengthRatioRange", js.undefined)
    
    inline def setStrengthRatioUndefined: Self = StObject.set(x, "strengthRatio", js.undefined)
    
    inline def setSubstance(value: CodeableReference): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    inline def set_measurementPoint(value: Element): Self = StObject.set(x, "_measurementPoint", value.asInstanceOf[js.Any])
    
    inline def set_measurementPointUndefined: Self = StObject.set(x, "_measurementPoint", js.undefined)
  }
}
