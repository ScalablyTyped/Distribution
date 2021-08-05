package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Population results in this stratum
  */
trait MeasureReportGroupStratifierStratumPopulation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
  
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Size of the population
    */
  var count: js.UndefOr[integer] = js.undefined
  
  /**
    * Population identifier as defined in the measure
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * For patient-list reports, the patients in this population
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
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatients(value: Reference): Self = StObject.set(x, "patients", value.asInstanceOf[js.Any])
    
    inline def setPatientsUndefined: Self = StObject.set(x, "patients", js.undefined)
    
    inline def set_count(value: Element): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_countUndefined: Self = StObject.set(x, "_count", js.undefined)
  }
}
