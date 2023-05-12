package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinitionQuantitativeDetails
  extends StObject
     with BackboneElement {
  
  /**
    * Factor for converting value expressed with SI unit to value expressed with customary unit.
    */
  var conversionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Customary unit used to report quantitative results of observations conforming to this ObservationDefinition.
    */
  var customaryUnit: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Number of digits after decimal separator when the results of such observations are of type Quantity.
    */
  var decimalPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * SI unit used to report quantitative results of observations conforming to this ObservationDefinition.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object ObservationDefinitionQuantitativeDetails {
  
  inline def apply(): ObservationDefinitionQuantitativeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationDefinitionQuantitativeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationDefinitionQuantitativeDetails] (val x: Self) extends AnyVal {
    
    inline def setConversionFactor(value: Double): Self = StObject.set(x, "conversionFactor", value.asInstanceOf[js.Any])
    
    inline def setConversionFactorUndefined: Self = StObject.set(x, "conversionFactor", js.undefined)
    
    inline def setCustomaryUnit(value: CodeableConcept): Self = StObject.set(x, "customaryUnit", value.asInstanceOf[js.Any])
    
    inline def setCustomaryUnitUndefined: Self = StObject.set(x, "customaryUnit", js.undefined)
    
    inline def setDecimalPrecision(value: Double): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
    
    inline def setDecimalPrecisionUndefined: Self = StObject.set(x, "decimalPrecision", js.undefined)
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
