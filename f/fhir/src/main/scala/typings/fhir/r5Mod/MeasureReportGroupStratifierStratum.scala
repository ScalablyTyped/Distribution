package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratum
  extends StObject
     with BackboneElement {
  
  var _measureScoreDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * A stratifier component value.
    */
  var component: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumComponent]] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScoreCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScoreDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScoreDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScorePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScoreQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScoreRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The populations that make up the stratum, one for each type of population appropriate to the measure.
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
}
object MeasureReportGroupStratifierStratum {
  
  inline def apply(): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  
  extension [Self <: MeasureReportGroupStratifierStratum](x: Self) {
    
    inline def setComponent(value: js.Array[MeasureReportGroupStratifierStratumComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: MeasureReportGroupStratifierStratumComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setMeasureScoreCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "measureScoreCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreCodeableConceptUndefined: Self = StObject.set(x, "measureScoreCodeableConcept", js.undefined)
    
    inline def setMeasureScoreDateTime(value: String): Self = StObject.set(x, "measureScoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreDateTimeUndefined: Self = StObject.set(x, "measureScoreDateTime", js.undefined)
    
    inline def setMeasureScoreDuration(value: Duration): Self = StObject.set(x, "measureScoreDuration", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreDurationUndefined: Self = StObject.set(x, "measureScoreDuration", js.undefined)
    
    inline def setMeasureScorePeriod(value: Period): Self = StObject.set(x, "measureScorePeriod", value.asInstanceOf[js.Any])
    
    inline def setMeasureScorePeriodUndefined: Self = StObject.set(x, "measureScorePeriod", js.undefined)
    
    inline def setMeasureScoreQuantity(value: Quantity): Self = StObject.set(x, "measureScoreQuantity", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreQuantityUndefined: Self = StObject.set(x, "measureScoreQuantity", js.undefined)
    
    inline def setMeasureScoreRange(value: Range): Self = StObject.set(x, "measureScoreRange", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreRangeUndefined: Self = StObject.set(x, "measureScoreRange", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def set_measureScoreDateTime(value: Element): Self = StObject.set(x, "_measureScoreDateTime", value.asInstanceOf[js.Any])
    
    inline def set_measureScoreDateTimeUndefined: Self = StObject.set(x, "_measureScoreDateTime", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
