package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The populations in the group
  */
@js.native
trait MeasureReportGroupPopulation extends BackboneElement {
  
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
object MeasureReportGroupPopulation {
  
  @scala.inline
  def apply(): MeasureReportGroupPopulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupPopulation]
  }
  
  @scala.inline
  implicit class MeasureReportGroupPopulationOps[Self <: MeasureReportGroupPopulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_count(value: Element): Self = this.set("_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_count: Self = this.set("_count", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCount(value: integer): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setPatients(value: Reference): Self = this.set("patients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatients: Self = this.set("patients", js.undefined)
  }
}
