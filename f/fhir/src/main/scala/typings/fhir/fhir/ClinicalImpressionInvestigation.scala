package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more sets of investigations (signs, symptions, etc.)
  */
@js.native
trait ClinicalImpressionInvestigation extends BackboneElement {
  /**
    * A name/code for the set
    */
  var code: CodeableConcept = js.native
  /**
    * Record of a specific investigation
    */
  var item: js.UndefOr[js.Array[Reference]] = js.native
}

object ClinicalImpressionInvestigation {
  @scala.inline
  def apply(code: CodeableConcept): ClinicalImpressionInvestigation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionInvestigation]
  }
  @scala.inline
  implicit class ClinicalImpressionInvestigationOps[Self <: ClinicalImpressionInvestigation] (val x: Self) extends AnyVal {
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemVarargs(value: Reference*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[Reference]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

