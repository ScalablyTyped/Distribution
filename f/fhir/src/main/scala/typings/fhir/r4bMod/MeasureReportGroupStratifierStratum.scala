package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratum
  extends StObject
     with BackboneElement {
  
  /**
    * A stratifier component value.
    */
  var component: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumComponent]] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScore: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The populations that make up the stratum, one for each type of population appropriate to the measure.
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.undefined
  
  /**
    * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var value: js.UndefOr[CodeableConcept] = js.undefined
}
object MeasureReportGroupStratifierStratum {
  
  inline def apply(): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroupStratifierStratum] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: js.Array[MeasureReportGroupStratifierStratumComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: MeasureReportGroupStratifierStratumComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setMeasureScore(value: Quantity): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setValue(value: CodeableConcept): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
