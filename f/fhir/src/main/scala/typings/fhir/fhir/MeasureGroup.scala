package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria group
  */
@js.native
trait MeasureGroup extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Summary description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique identifier
    */
  var identifier: Identifier = js.native
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Population criteria
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.native
  /**
    * Stratifier criteria for the measure
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.native
}

object MeasureGroup {
  @scala.inline
  def apply(identifier: Identifier): MeasureGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroup]
  }
  @scala.inline
  implicit class MeasureGroupOps[Self <: MeasureGroup] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPopulationVarargs(value: MeasureGroupPopulation*): Self = this.set("population", js.Array(value :_*))
    @scala.inline
    def setPopulation(value: js.Array[MeasureGroupPopulation]): Self = this.set("population", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulation: Self = this.set("population", js.undefined)
    @scala.inline
    def setStratifierVarargs(value: MeasureGroupStratifier*): Self = this.set("stratifier", js.Array(value :_*))
    @scala.inline
    def setStratifier(value: js.Array[MeasureGroupStratifier]): Self = this.set("stratifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStratifier: Self = this.set("stratifier", js.undefined)
  }
  
}

