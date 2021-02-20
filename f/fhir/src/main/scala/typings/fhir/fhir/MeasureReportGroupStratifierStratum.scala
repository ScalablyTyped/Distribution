package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratum results, one for each unique value in the stratifier
  */
@js.native
trait MeasureReportGroupStratifierStratum extends BackboneElement {
  
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * What score this stratum achieved
    */
  var measureScore: js.UndefOr[decimal] = js.native
  
  /**
    * Population results in this stratum
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.native
  
  /**
    * The stratum value, e.g. male
    */
  var value: String = js.native
}
object MeasureReportGroupStratifierStratum {
  
  @scala.inline
  def apply(value: String): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  
  @scala.inline
  implicit class MeasureReportGroupStratifierStratumMutableBuilder[Self <: MeasureReportGroupStratifierStratum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasureScore(value: decimal): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    @scala.inline
    def setPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    @scala.inline
    def setPopulationVarargs(value: MeasureReportGroupStratifierStratumPopulation*): Self = StObject.set(x, "population", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_measureScore(value: Element): Self = StObject.set(x, "_measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_measureScoreUndefined: Self = StObject.set(x, "_measureScore", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
