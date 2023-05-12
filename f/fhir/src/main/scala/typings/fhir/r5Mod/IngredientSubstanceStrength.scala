package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientSubstanceStrength
  extends StObject
     with BackboneElement {
  
  var _measurementPoint: js.UndefOr[Element] = js.undefined
  
  var _textConcentration: js.UndefOr[Element] = js.undefined
  
  var _textPresentation: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that indicates if the strength is, for example, based on the ingredient substance as stated or on the substance base (when the ingredient is a salt).
    */
  var basis: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The strength per unitary volume (or mass).
    */
  var concentrationRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * The country or countries for which the strength range applies.
    */
  var country: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For when strength is measured at a particular point or distance. There are products where strength is measured at a particular point. For example, the strength of the ingredient in some inhalers is measured at a particular position relative to the point of aerosolization.
    */
  var measurementPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg').
    */
  var presentationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg').
    */
  var presentationQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg').
    */
  var presentationRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item. Unit of presentation refers to the quantity that the item occurs in e.g. a strength per tablet size, perhaps 'per 20mg' (the size of the tablet). It is not generally normalized as a unitary unit, which would be 'per mg').
    */
  var presentationRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * Strength expressed in terms of a reference substance. For when the ingredient strength is additionally expressed as equivalent to the strength of some other closely related substance (e.g. salt vs. base). Reference strength represents the strength (quantitative composition) of the active moiety of the active substance. There are situations when the active substance and active moiety are different, therefore both a strength and a reference strength are needed.
    */
  var referenceStrength: js.UndefOr[js.Array[IngredientSubstanceStrengthReferenceStrength]] = js.undefined
  
  /**
    * A textual represention of either the whole of the concentration strength or a part of it - with the rest being in Strength.concentration as a ratio.
    */
  var textConcentration: js.UndefOr[String] = js.undefined
  
  /**
    * A textual represention of either the whole of the presentation strength or a part of it - with the rest being in Strength.presentation as a ratio.
    */
  var textPresentation: js.UndefOr[String] = js.undefined
}
object IngredientSubstanceStrength {
  
  inline def apply(): IngredientSubstanceStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngredientSubstanceStrength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngredientSubstanceStrength] (val x: Self) extends AnyVal {
    
    inline def setBasis(value: CodeableConcept): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setConcentrationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "concentrationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setConcentrationCodeableConceptUndefined: Self = StObject.set(x, "concentrationCodeableConcept", js.undefined)
    
    inline def setConcentrationQuantity(value: Quantity): Self = StObject.set(x, "concentrationQuantity", value.asInstanceOf[js.Any])
    
    inline def setConcentrationQuantityUndefined: Self = StObject.set(x, "concentrationQuantity", js.undefined)
    
    inline def setConcentrationRatio(value: Ratio): Self = StObject.set(x, "concentrationRatio", value.asInstanceOf[js.Any])
    
    inline def setConcentrationRatioRange(value: RatioRange): Self = StObject.set(x, "concentrationRatioRange", value.asInstanceOf[js.Any])
    
    inline def setConcentrationRatioRangeUndefined: Self = StObject.set(x, "concentrationRatioRange", js.undefined)
    
    inline def setConcentrationRatioUndefined: Self = StObject.set(x, "concentrationRatio", js.undefined)
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setMeasurementPoint(value: String): Self = StObject.set(x, "measurementPoint", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPointUndefined: Self = StObject.set(x, "measurementPoint", js.undefined)
    
    inline def setPresentationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "presentationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setPresentationCodeableConceptUndefined: Self = StObject.set(x, "presentationCodeableConcept", js.undefined)
    
    inline def setPresentationQuantity(value: Quantity): Self = StObject.set(x, "presentationQuantity", value.asInstanceOf[js.Any])
    
    inline def setPresentationQuantityUndefined: Self = StObject.set(x, "presentationQuantity", js.undefined)
    
    inline def setPresentationRatio(value: Ratio): Self = StObject.set(x, "presentationRatio", value.asInstanceOf[js.Any])
    
    inline def setPresentationRatioRange(value: RatioRange): Self = StObject.set(x, "presentationRatioRange", value.asInstanceOf[js.Any])
    
    inline def setPresentationRatioRangeUndefined: Self = StObject.set(x, "presentationRatioRange", js.undefined)
    
    inline def setPresentationRatioUndefined: Self = StObject.set(x, "presentationRatio", js.undefined)
    
    inline def setReferenceStrength(value: js.Array[IngredientSubstanceStrengthReferenceStrength]): Self = StObject.set(x, "referenceStrength", value.asInstanceOf[js.Any])
    
    inline def setReferenceStrengthUndefined: Self = StObject.set(x, "referenceStrength", js.undefined)
    
    inline def setReferenceStrengthVarargs(value: IngredientSubstanceStrengthReferenceStrength*): Self = StObject.set(x, "referenceStrength", js.Array(value*))
    
    inline def setTextConcentration(value: String): Self = StObject.set(x, "textConcentration", value.asInstanceOf[js.Any])
    
    inline def setTextConcentrationUndefined: Self = StObject.set(x, "textConcentration", js.undefined)
    
    inline def setTextPresentation(value: String): Self = StObject.set(x, "textPresentation", value.asInstanceOf[js.Any])
    
    inline def setTextPresentationUndefined: Self = StObject.set(x, "textPresentation", js.undefined)
    
    inline def set_measurementPoint(value: Element): Self = StObject.set(x, "_measurementPoint", value.asInstanceOf[js.Any])
    
    inline def set_measurementPointUndefined: Self = StObject.set(x, "_measurementPoint", js.undefined)
    
    inline def set_textConcentration(value: Element): Self = StObject.set(x, "_textConcentration", value.asInstanceOf[js.Any])
    
    inline def set_textConcentrationUndefined: Self = StObject.set(x, "_textConcentration", js.undefined)
    
    inline def set_textPresentation(value: Element): Self = StObject.set(x, "_textPresentation", value.asInstanceOf[js.Any])
    
    inline def set_textPresentationUndefined: Self = StObject.set(x, "_textPresentation", js.undefined)
  }
}
