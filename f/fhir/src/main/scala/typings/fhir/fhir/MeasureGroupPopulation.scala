package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria
  */
@js.native
trait MeasureGroupPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
    */
  var criteria: String = js.native
  /**
    * The human readable description of this population criteria
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.native
}

object MeasureGroupPopulation {
  @scala.inline
  def apply(criteria: String): MeasureGroupPopulation = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroupPopulation]
  }
  @scala.inline
  implicit class MeasureGroupPopulationOps[Self <: MeasureGroupPopulation] (val x: Self) extends AnyVal {
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
    def setCriteria(value: String): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def set_criteria(value: Element): Self = this.set("_criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_criteria: Self = this.set("_criteria", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

