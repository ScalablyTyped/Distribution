package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Population results in this stratum
  */
@js.native
trait MeasureReportGroupStratifierStratumPopulation extends BackboneElement {
  
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.native
  
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Size of the population
    */
  var count: js.UndefOr[integer] = js.native
  
  /**
    * Population identifier as defined in the measure
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * For patient-list reports, the patients in this population
    */
  var patients: js.UndefOr[Reference] = js.native
}
object MeasureReportGroupStratifierStratumPopulation {
  
  @scala.inline
  def apply(): MeasureReportGroupStratifierStratumPopulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifierStratumPopulation]
  }
  
  @scala.inline
  implicit class MeasureReportGroupStratifierStratumPopulationMutableBuilder[Self <: MeasureReportGroupStratifierStratumPopulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setPatients(value: Reference): Self = StObject.set(x, "patients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientsUndefined: Self = StObject.set(x, "patients", js.undefined)
    
    @scala.inline
    def set_count(value: Element): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_countUndefined: Self = StObject.set(x, "_count", js.undefined)
  }
}
