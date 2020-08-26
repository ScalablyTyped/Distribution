package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of past encounter statuses
  */
@js.native
trait EncounterStatusHistory extends BackboneElement {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The time that the episode was in the specified status
    */
  var period: Period = js.native
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code = js.native
}

object EncounterStatusHistory {
  @scala.inline
  def apply(period: Period, status: code): EncounterStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterStatusHistory]
  }
  @scala.inline
  implicit class EncounterStatusHistoryOps[Self <: EncounterStatusHistory] (val x: Self) extends AnyVal {
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
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
  }
  
}

