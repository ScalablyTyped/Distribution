package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What other data should be reported with the measure
  */
@js.native
trait MeasureSupplementalData extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Expression describing additional data to be reported
    */
  var criteria: js.UndefOr[String] = js.native
  /**
    * Identifier, unique within the measure
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Path to the supplemental data element
    */
  var path: js.UndefOr[String] = js.native
  /**
    * supplemental-data | risk-adjustment-factor
    */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object MeasureSupplementalData {
  @scala.inline
  def apply(): MeasureSupplementalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureSupplementalData]
  }
  @scala.inline
  implicit class MeasureSupplementalDataOps[Self <: MeasureSupplementalData] (val x: Self) extends AnyVal {
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
    def set_criteria(value: Element): Self = this.set("_criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_criteria: Self = this.set("_criteria", js.undefined)
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    @scala.inline
    def setCriteria(value: String): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUsageVarargs(value: CodeableConcept*): Self = this.set("usage", js.Array(value :_*))
    @scala.inline
    def setUsage(value: js.Array[CodeableConcept]): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

