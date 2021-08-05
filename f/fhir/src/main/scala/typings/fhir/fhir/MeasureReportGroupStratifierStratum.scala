package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratum results, one for each unique value in the stratifier
  */
trait MeasureReportGroupStratifierStratum
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * What score this stratum achieved
    */
  var measureScore: js.UndefOr[decimal] = js.undefined
  
  /**
    * Population results in this stratum
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.undefined
  
  /**
    * The stratum value, e.g. male
    */
  var value: String
}
object MeasureReportGroupStratifierStratum {
  
  inline def apply(value: String): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  
  extension [Self <: MeasureReportGroupStratifierStratum](x: Self) {
    
    inline def setMeasureScore(value: decimal): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = StObject.set(x, "population", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_measureScore(value: Element): Self = StObject.set(x, "_measureScore", value.asInstanceOf[js.Any])
    
    inline def set_measureScoreUndefined: Self = StObject.set(x, "_measureScore", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
