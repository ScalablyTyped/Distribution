package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionPlanCommitmentInterval extends js.Object {
  var endTime: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
}

object SubscriptionPlanCommitmentInterval {
  @scala.inline
  def apply(): SubscriptionPlanCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
  }
  @scala.inline
  implicit class SubscriptionPlanCommitmentIntervalOps[Self <: SubscriptionPlanCommitmentInterval] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

