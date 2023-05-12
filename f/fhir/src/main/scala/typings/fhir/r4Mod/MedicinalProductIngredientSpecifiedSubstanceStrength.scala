package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIngredientSpecifiedSubstanceStrength
  extends StObject
     with BackboneElement {
  
  var _measurementPoint: js.UndefOr[Element] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentration: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A lower limit for the strength per unitary volume (or mass), for when there is a range. The concentration attribute then becomes the upper limit.
    */
  var concentrationLowLimit: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The country or countries for which the strength range applies.
    */
  var country: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For when strength is measured at a particular point or distance.
    */
  var measurementPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.
    */
  var presentation: Ratio
  
  /**
    * A lower limit for the quantity of substance in the unit of presentation. For use when there is a range of strengths, this is the lower limit, with the presentation attribute becoming the upper limit.
    */
  var presentationLowLimit: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Strength expressed in terms of a reference substance.
    */
  var referenceStrength: js.UndefOr[js.Array[MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength]] = js.undefined
}
object MedicinalProductIngredientSpecifiedSubstanceStrength {
  
  inline def apply(presentation: Ratio): MedicinalProductIngredientSpecifiedSubstanceStrength = {
    val __obj = js.Dynamic.literal(presentation = presentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIngredientSpecifiedSubstanceStrength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIngredientSpecifiedSubstanceStrength] (val x: Self) extends AnyVal {
    
    inline def setConcentration(value: Ratio): Self = StObject.set(x, "concentration", value.asInstanceOf[js.Any])
    
    inline def setConcentrationLowLimit(value: Ratio): Self = StObject.set(x, "concentrationLowLimit", value.asInstanceOf[js.Any])
    
    inline def setConcentrationLowLimitUndefined: Self = StObject.set(x, "concentrationLowLimit", js.undefined)
    
    inline def setConcentrationUndefined: Self = StObject.set(x, "concentration", js.undefined)
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setMeasurementPoint(value: String): Self = StObject.set(x, "measurementPoint", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPointUndefined: Self = StObject.set(x, "measurementPoint", js.undefined)
    
    inline def setPresentation(value: Ratio): Self = StObject.set(x, "presentation", value.asInstanceOf[js.Any])
    
    inline def setPresentationLowLimit(value: Ratio): Self = StObject.set(x, "presentationLowLimit", value.asInstanceOf[js.Any])
    
    inline def setPresentationLowLimitUndefined: Self = StObject.set(x, "presentationLowLimit", js.undefined)
    
    inline def setReferenceStrength(value: js.Array[MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength]): Self = StObject.set(x, "referenceStrength", value.asInstanceOf[js.Any])
    
    inline def setReferenceStrengthUndefined: Self = StObject.set(x, "referenceStrength", js.undefined)
    
    inline def setReferenceStrengthVarargs(value: MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength*): Self = StObject.set(x, "referenceStrength", js.Array(value*))
    
    inline def set_measurementPoint(value: Element): Self = StObject.set(x, "_measurementPoint", value.asInstanceOf[js.Any])
    
    inline def set_measurementPointUndefined: Self = StObject.set(x, "_measurementPoint", js.undefined)
  }
}
