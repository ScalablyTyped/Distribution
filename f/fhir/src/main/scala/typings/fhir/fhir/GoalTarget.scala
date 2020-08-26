package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
@js.native
trait GoalTarget extends BackboneElement {
  /**
    * Contains extended information for property 'dueDate'.
    */
  var _dueDate: js.UndefOr[Element] = js.native
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
    * Reach goal on or before
    */
  var dueDate: js.UndefOr[date] = js.native
  /**
    * Reach goal on or before
    */
  var dueDuration: js.UndefOr[Duration] = js.native
  /**
    * The parameter whose value is being tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}

object GoalTarget {
  @scala.inline
  def apply(): GoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalTarget]
  }
  @scala.inline
  implicit class GoalTargetOps[Self <: GoalTarget] (val x: Self) extends AnyVal {
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
    def set_dueDate(value: Element): Self = this.set("_dueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_dueDate: Self = this.set("_dueDate", js.undefined)
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
    def setDueDate(value: date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    @scala.inline
    def setDueDuration(value: Duration): Self = this.set("dueDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDuration: Self = this.set("dueDuration", js.undefined)
    @scala.inline
    def setMeasure(value: CodeableConcept): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
  }
  
}

