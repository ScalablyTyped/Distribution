package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Past list of status codes (the current status may be included to cover the start date of the status)
  */
@js.native
trait EpisodeOfCareStatusHistory extends BackboneElement {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Duration the EpisodeOfCare was in the specified status
    */
  var period: Period = js.native
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code = js.native
}

object EpisodeOfCareStatusHistory {
  @scala.inline
  def apply(period: Period, status: code): EpisodeOfCareStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareStatusHistory]
  }
  @scala.inline
  implicit class EpisodeOfCareStatusHistoryOps[Self <: EpisodeOfCareStatusHistory] (val x: Self) extends AnyVal {
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

