package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratum
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
    */
  var measureScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The populations that make up the stratum, one for each type of population appropriate to the measure.
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.undefined
  
  /**
    * The value for this stratum, expressed as a string. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
    */
  var value: String
}
object MeasureReportGroupStratifierStratum {
  
  inline def apply(value: String): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroupStratifierStratum] (val x: Self) extends AnyVal {
    
    inline def setMeasureScore(value: Double): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
