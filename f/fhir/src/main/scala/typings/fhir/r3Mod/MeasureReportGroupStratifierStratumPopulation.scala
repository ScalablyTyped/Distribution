package typings.fhir.r3Mod

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
    * The identifier of the population being reported, as defined by the population element of the measure.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This element refers to a List of patient level MeasureReport resources, one for each patient in this population in this stratum.
    */
  var patients: js.UndefOr[Reference] = js.undefined
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
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatients(value: Reference): Self = StObject.set(x, "patients", value.asInstanceOf[js.Any])
    
    inline def setPatientsUndefined: Self = StObject.set(x, "patients", js.undefined)
  }
}
