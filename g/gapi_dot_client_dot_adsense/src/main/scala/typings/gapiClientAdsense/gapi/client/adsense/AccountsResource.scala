package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.Alt
import typings.gapiClientAdsense.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var adunits: AdunitsResource = js.native
  var alerts: AlertsResource = js.native
  var customchannels: CustomchannelsResource = js.native
  var payments: PaymentsResource = js.native
  var reports: ReportsResource = js.native
  var savedadstyles: SavedadstylesResource = js.native
  var urlchannels: UrlchannelsResource = js.native
  /** Get information about the selected AdSense account. */
  def get(request: Tree): Request[Account] = js.native
  /** List all accounts available to this AdSense account. */
  def list(request: Alt): Request[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: Tree => Request[Account],
    list: Alt => Request[Accounts],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), payments = payments.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], savedadstyles = savedadstyles.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
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
    def setAdclients(value: AdclientsResource): Self = this.set("adclients", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdunits(value: AdunitsResource): Self = this.set("adunits", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlerts(value: AlertsResource): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomchannels(value: CustomchannelsResource): Self = this.set("customchannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Tree => Request[Account]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[Accounts]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPayments(value: PaymentsResource): Self = this.set("payments", value.asInstanceOf[js.Any])
    @scala.inline
    def setReports(value: ReportsResource): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavedadstyles(value: SavedadstylesResource): Self = this.set("savedadstyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlchannels(value: UrlchannelsResource): Self = this.set("urlchannels", value.asInstanceOf[js.Any])
  }
  
}

