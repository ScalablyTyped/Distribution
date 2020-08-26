package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of diagnosis relevant to this encounter
  */
@js.native
trait EncounterDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.native
  /**
    * Reason the encounter takes place (resource)
    */
  var condition: Reference = js.native
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.native
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}

object EncounterDiagnosis {
  @scala.inline
  def apply(condition: Reference): EncounterDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterDiagnosis]
  }
  @scala.inline
  implicit class EncounterDiagnosisOps[Self <: EncounterDiagnosis] (val x: Self) extends AnyVal {
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
    def setCondition(value: Reference): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def set_rank(value: Element): Self = this.set("_rank", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rank: Self = this.set("_rank", js.undefined)
    @scala.inline
    def setRank(value: positiveInt): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setRole(value: CodeableConcept): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

