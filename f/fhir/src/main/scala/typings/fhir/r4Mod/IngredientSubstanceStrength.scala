package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientSubstanceStrength
  extends StObject
     with BackboneElement {
  
  var _concentrationText: js.UndefOr[Element] = js.undefined
  
  var _measurementPoint: js.UndefOr[Element] = js.undefined
  
  var _presentationText: js.UndefOr[Element] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * A textual represention of either the whole of the concentration strength or a part of it - with the rest being in Strength.concentration as a ratio.
    */
  var concentrationText: js.UndefOr[String] = js.undefined
  
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
  var presentationRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.
    */
  var presentationRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * A textual represention of either the whole of the presentation strength or a part of it - with the rest being in Strength.presentation as a ratio.
    */
  var presentationText: js.UndefOr[String] = js.undefined
  
  /**
    * Strength expressed in terms of a reference substance.
    */
  var referenceStrength: js.UndefOr[js.Array[IngredientSubstanceStrengthReferenceStrength]] = js.undefined
}
object IngredientSubstanceStrength {
  
  inline def apply(): IngredientSubstanceStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngredientSubstanceStrength]
  }
  
  extension [Self <: IngredientSubstanceStrength](x: Self) {
    
    inline def setConcentrationRatio(value: Ratio): Self = StObject.set(x, "concentrationRatio", value.asInstanceOf[js.Any])
    
    inline def setConcentrationRatioRange(value: RatioRange): Self = StObject.set(x, "concentrationRatioRange", value.asInstanceOf[js.Any])
    
    inline def setConcentrationRatioRangeUndefined: Self = StObject.set(x, "concentrationRatioRange", js.undefined)
    
    inline def setConcentrationRatioUndefined: Self = StObject.set(x, "concentrationRatio", js.undefined)
    
    inline def setConcentrationText(value: String): Self = StObject.set(x, "concentrationText", value.asInstanceOf[js.Any])
    
    inline def setConcentrationTextUndefined: Self = StObject.set(x, "concentrationText", js.undefined)
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setMeasurementPoint(value: String): Self = StObject.set(x, "measurementPoint", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPointUndefined: Self = StObject.set(x, "measurementPoint", js.undefined)
    
    inline def setPresentationRatio(value: Ratio): Self = StObject.set(x, "presentationRatio", value.asInstanceOf[js.Any])
    
    inline def setPresentationRatioRange(value: RatioRange): Self = StObject.set(x, "presentationRatioRange", value.asInstanceOf[js.Any])
    
    inline def setPresentationRatioRangeUndefined: Self = StObject.set(x, "presentationRatioRange", js.undefined)
    
    inline def setPresentationRatioUndefined: Self = StObject.set(x, "presentationRatio", js.undefined)
    
    inline def setPresentationText(value: String): Self = StObject.set(x, "presentationText", value.asInstanceOf[js.Any])
    
    inline def setPresentationTextUndefined: Self = StObject.set(x, "presentationText", js.undefined)
    
    inline def setReferenceStrength(value: js.Array[IngredientSubstanceStrengthReferenceStrength]): Self = StObject.set(x, "referenceStrength", value.asInstanceOf[js.Any])
    
    inline def setReferenceStrengthUndefined: Self = StObject.set(x, "referenceStrength", js.undefined)
    
    inline def setReferenceStrengthVarargs(value: IngredientSubstanceStrengthReferenceStrength*): Self = StObject.set(x, "referenceStrength", js.Array(value*))
    
    inline def set_concentrationText(value: Element): Self = StObject.set(x, "_concentrationText", value.asInstanceOf[js.Any])
    
    inline def set_concentrationTextUndefined: Self = StObject.set(x, "_concentrationText", js.undefined)
    
    inline def set_measurementPoint(value: Element): Self = StObject.set(x, "_measurementPoint", value.asInstanceOf[js.Any])
    
    inline def set_measurementPointUndefined: Self = StObject.set(x, "_measurementPoint", js.undefined)
    
    inline def set_presentationText(value: Element): Self = StObject.set(x, "_presentationText", value.asInstanceOf[js.Any])
    
    inline def set_presentationTextUndefined: Self = StObject.set(x, "_presentationText", js.undefined)
  }
}
