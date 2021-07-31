package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measure results for each group
  */
trait MeasureReportGroup
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.undefined
  
  /**
    * What group of the measure
    */
  var identifier: Identifier
  
  /**
    * What score this group achieved
    */
  var measureScore: js.UndefOr[decimal] = js.undefined
  
  /**
    * The populations in the group
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.undefined
  
  /**
    * Stratification results
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.undefined
}
object MeasureReportGroup {
  
  @scala.inline
  def apply(identifier: Identifier): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroup]
  }
  
  @scala.inline
  implicit class MeasureReportGroupMutableBuilder[Self <: MeasureReportGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureScore(value: decimal): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    @scala.inline
    def setPopulation(value: js.Array[MeasureReportGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    @scala.inline
    def setPopulationVarargs(value: MeasureReportGroupPopulation*): Self = StObject.set(x, "population", js.Array(value :_*))
    
    @scala.inline
    def setStratifier(value: js.Array[MeasureReportGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    @scala.inline
    def setStratifierVarargs(value: MeasureReportGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value :_*))
    
    @scala.inline
    def set_measureScore(value: Element): Self = StObject.set(x, "_measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_measureScoreUndefined: Self = StObject.set(x, "_measureScore", js.undefined)
  }
}
