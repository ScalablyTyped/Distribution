package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action to occur as part of plan
  */
@js.native
trait CarePlanActivity extends BackboneElement {
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.native
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.native
}

object CarePlanActivity {
  @scala.inline
  def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  @scala.inline
  implicit class CarePlanActivityOps[Self <: CarePlanActivity] (val x: Self) extends AnyVal {
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
    def setDetail(value: CarePlanActivityDetail): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setOutcomeCodeableConceptVarargs(value: CodeableConcept*): Self = this.set("outcomeCodeableConcept", js.Array(value :_*))
    @scala.inline
    def setOutcomeCodeableConcept(value: js.Array[CodeableConcept]): Self = this.set("outcomeCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomeCodeableConcept: Self = this.set("outcomeCodeableConcept", js.undefined)
    @scala.inline
    def setOutcomeReferenceVarargs(value: Reference*): Self = this.set("outcomeReference", js.Array(value :_*))
    @scala.inline
    def setOutcomeReference(value: js.Array[Reference]): Self = this.set("outcomeReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomeReference: Self = this.set("outcomeReference", js.undefined)
    @scala.inline
    def setProgressVarargs(value: Annotation*): Self = this.set("progress", js.Array(value :_*))
    @scala.inline
    def setProgress(value: js.Array[Annotation]): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setReference(value: Reference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
  
}

