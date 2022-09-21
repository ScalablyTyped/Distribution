package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroup
  extends StObject
     with BackboneElement {
  
  /**
    * The identifier of the population group as defined in the measure definition.
    */
  var identifier: Identifier
  
  /**
    * The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
    */
  var measureScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The populations that make up the population group, one for each type of population appropriate for the measure.
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.undefined
  
  /**
    * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.undefined
}
object MeasureReportGroup {
  
  inline def apply(identifier: Identifier): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroup]
  }
  
  extension [Self <: MeasureReportGroup](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setMeasureScore(value: Double): Self = StObject.set(x, "measureScore", value.asInstanceOf[js.Any])
    
    inline def setMeasureScoreUndefined: Self = StObject.set(x, "measureScore", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureReportGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureReportGroupPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setStratifier(value: js.Array[MeasureReportGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureReportGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value*))
  }
}
