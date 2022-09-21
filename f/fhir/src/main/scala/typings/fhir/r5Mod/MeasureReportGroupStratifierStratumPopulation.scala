package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratumPopulation
  extends StObject
     with BackboneElement {
  
  /**
    * The type of the population.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The number of members of the population in this stratum.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * This element refers to a List of subject level MeasureReport resources, one for each subject in this population in this stratum.
    */
  var subjectResults: js.UndefOr[Reference] = js.undefined
}
object MeasureReportGroupStratifierStratumPopulation {
  
  inline def apply(): MeasureReportGroupStratifierStratumPopulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifierStratumPopulation]
  }
  
  extension [Self <: MeasureReportGroupStratifierStratumPopulation](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSubjectResults(value: Reference): Self = StObject.set(x, "subjectResults", value.asInstanceOf[js.Any])
    
    inline def setSubjectResultsUndefined: Self = StObject.set(x, "subjectResults", js.undefined)
  }
}
