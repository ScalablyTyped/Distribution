package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Season extends js.Object {
  /** Inclusive end date of the recurrence period. */
  var end: js.UndefOr[MonthDay] = js.native
  /**
    * Optionally present list of prorations for the season. Each proration is a one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing information.
    */
  var prorations: js.UndefOr[js.Array[Prorate]] = js.native
  /** Inclusive start date of the recurrence period. */
  var start: js.UndefOr[MonthDay] = js.native
}

object Season {
  @scala.inline
  def apply(): Season = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Season]
  }
  @scala.inline
  implicit class SeasonOps[Self <: Season] (val x: Self) extends AnyVal {
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
    def setEnd(value: MonthDay): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setProrationsVarargs(value: Prorate*): Self = this.set("prorations", js.Array(value :_*))
    @scala.inline
    def setProrations(value: js.Array[Prorate]): Self = this.set("prorations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProrations: Self = this.set("prorations", js.undefined)
    @scala.inline
    def setStart(value: MonthDay): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

