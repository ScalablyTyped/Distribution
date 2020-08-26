package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ActivitiesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.CustomerUsageReportsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.EntityUsageReportsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.UserUsageReportCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminReports_ extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.native
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.native
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
}

object AdminReports_ {
  @scala.inline
  def apply(newChannel: () => Channel): AdminReports_ = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    __obj.asInstanceOf[AdminReports_]
  }
  @scala.inline
  implicit class AdminReports_Ops[Self <: AdminReports_] (val x: Self) extends AnyVal {
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
    def setNewChannel(value: () => Channel): Self = this.set("newChannel", js.Any.fromFunction0(value))
    @scala.inline
    def setActivities(value: ActivitiesCollection): Self = this.set("Activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("Activities", js.undefined)
    @scala.inline
    def setChannels(value: ChannelsCollection): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    @scala.inline
    def setCustomerUsageReports(value: CustomerUsageReportsCollection): Self = this.set("CustomerUsageReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerUsageReports: Self = this.set("CustomerUsageReports", js.undefined)
    @scala.inline
    def setEntityUsageReports(value: EntityUsageReportsCollection): Self = this.set("EntityUsageReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityUsageReports: Self = this.set("EntityUsageReports", js.undefined)
    @scala.inline
    def setUserUsageReport(value: UserUsageReportCollection): Self = this.set("UserUsageReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserUsageReport: Self = this.set("UserUsageReport", js.undefined)
  }
  
}

