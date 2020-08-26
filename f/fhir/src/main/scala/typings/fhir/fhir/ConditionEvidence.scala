package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supporting evidence
  */
@js.native
trait ConditionEvidence extends BackboneElement {
  /**
    * Manifestation/symptom
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Supporting information found elsewhere
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.native
}

object ConditionEvidence {
  @scala.inline
  def apply(): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvidence]
  }
  @scala.inline
  implicit class ConditionEvidenceOps[Self <: ConditionEvidence] (val x: Self) extends AnyVal {
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
    def setCodeVarargs(value: CodeableConcept*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDetailVarargs(value: Reference*): Self = this.set("detail", js.Array(value :_*))
    @scala.inline
    def setDetail(value: js.Array[Reference]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
  }
  
}

