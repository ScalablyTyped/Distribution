package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionTrialSettings extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
}

object SubscriptionTrialSettings {
  @scala.inline
  def apply(): SubscriptionTrialSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionTrialSettings]
  }
  @scala.inline
  implicit class SubscriptionTrialSettingsOps[Self <: SubscriptionTrialSettings] (val x: Self) extends AnyVal {
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
    def setIsInTrial(value: Boolean): Self = this.set("isInTrial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInTrial: Self = this.set("isInTrial", js.undefined)
    @scala.inline
    def setTrialEndTime(value: String): Self = this.set("trialEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialEndTime: Self = this.set("trialEndTime", js.undefined)
  }
  
}

