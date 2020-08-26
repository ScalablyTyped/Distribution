package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
@js.native
trait PlanDefinitionGoalTarget extends BackboneElement {
  /**
    * The target value to be achieved
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * The target value to be achieved
    */
  var detailQuantity: js.UndefOr[Quantity] = js.native
  /**
    * The target value to be achieved
    */
  var detailRange: js.UndefOr[Range] = js.native
  /**
    * Reach goal within
    */
  var due: js.UndefOr[Duration] = js.native
  /**
    * The parameter whose value is to be tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}

object PlanDefinitionGoalTarget {
  @scala.inline
  def apply(): PlanDefinitionGoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionGoalTarget]
  }
  @scala.inline
  implicit class PlanDefinitionGoalTargetOps[Self <: PlanDefinitionGoalTarget] (val x: Self) extends AnyVal {
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
    def setDetailCodeableConcept(value: CodeableConcept): Self = this.set("detailCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailCodeableConcept: Self = this.set("detailCodeableConcept", js.undefined)
    @scala.inline
    def setDetailQuantity(value: Quantity): Self = this.set("detailQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailQuantity: Self = this.set("detailQuantity", js.undefined)
    @scala.inline
    def setDetailRange(value: Range): Self = this.set("detailRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailRange: Self = this.set("detailRange", js.undefined)
    @scala.inline
    def setDue(value: Duration): Self = this.set("due", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDue: Self = this.set("due", js.undefined)
    @scala.inline
    def setMeasure(value: CodeableConcept): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
  }
  
}

