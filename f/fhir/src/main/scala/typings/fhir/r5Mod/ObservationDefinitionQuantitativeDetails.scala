package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinitionQuantitativeDetails
  extends StObject
     with BackboneElement {
  
  /**
    * Factor for converting value expressed with primary unit to value expressed with secondary unit.
    */
  var conversionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Secondary unit used to report quantitative results of observations conforming to this ObservationDefinition.
    */
  var customaryUnit: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Number of digits after decimal separator when the results of such observations are of type Quantity.
    */
  var decimalPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Primary unit used to report quantitative results of observations conforming to this ObservationDefinition.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object ObservationDefinitionQuantitativeDetails {
  
  inline def apply(): ObservationDefinitionQuantitativeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationDefinitionQuantitativeDetails]
  }
  
  extension [Self <: ObservationDefinitionQuantitativeDetails](x: Self) {
    
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
