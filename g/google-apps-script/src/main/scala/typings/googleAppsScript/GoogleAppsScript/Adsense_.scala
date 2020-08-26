package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdclientsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdunitsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AlertsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.CustomchannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.MetadataCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.PaymentsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.ReportsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.SavedadstylesCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.UrlchannelsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adsense_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var Adclients: js.UndefOr[AdclientsCollection] = js.native
  var Adunits: js.UndefOr[AdunitsCollection] = js.native
  var Alerts: js.UndefOr[AlertsCollection] = js.native
  var Customchannels: js.UndefOr[CustomchannelsCollection] = js.native
  var Metadata: js.UndefOr[MetadataCollection] = js.native
  var Payments: js.UndefOr[PaymentsCollection] = js.native
  var Reports: js.UndefOr[ReportsCollection] = js.native
  var Savedadstyles: js.UndefOr[SavedadstylesCollection] = js.native
  var Urlchannels: js.UndefOr[UrlchannelsCollection] = js.native
}

object Adsense_ {
  @scala.inline
  def apply(): Adsense_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adsense_]
  }
  @scala.inline
  implicit class Adsense_Ops[Self <: Adsense_] (val x: Self) extends AnyVal {
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
    def setAccounts(value: AccountsCollection): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    @scala.inline
    def setAdclients(value: AdclientsCollection): Self = this.set("Adclients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdclients: Self = this.set("Adclients", js.undefined)
    @scala.inline
    def setAdunits(value: AdunitsCollection): Self = this.set("Adunits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdunits: Self = this.set("Adunits", js.undefined)
    @scala.inline
    def setAlerts(value: AlertsCollection): Self = this.set("Alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlerts: Self = this.set("Alerts", js.undefined)
    @scala.inline
    def setCustomchannels(value: CustomchannelsCollection): Self = this.set("Customchannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomchannels: Self = this.set("Customchannels", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataCollection): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    @scala.inline
    def setPayments(value: PaymentsCollection): Self = this.set("Payments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayments: Self = this.set("Payments", js.undefined)
    @scala.inline
    def setReports(value: ReportsCollection): Self = this.set("Reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("Reports", js.undefined)
    @scala.inline
    def setSavedadstyles(value: SavedadstylesCollection): Self = this.set("Savedadstyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedadstyles: Self = this.set("Savedadstyles", js.undefined)
    @scala.inline
    def setUrlchannels(value: UrlchannelsCollection): Self = this.set("Urlchannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlchannels: Self = this.set("Urlchannels", js.undefined)
  }
  
}

