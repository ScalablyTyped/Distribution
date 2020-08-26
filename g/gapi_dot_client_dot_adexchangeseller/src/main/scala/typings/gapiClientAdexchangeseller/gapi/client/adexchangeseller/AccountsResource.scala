package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.Key
import typings.gapiClientAdexchangeseller.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var alerts: AlertsResource = js.native
  var customchannels: CustomchannelsResource = js.native
  var metadata: MetadataResource = js.native
  var preferreddeals: PreferreddealsResource = js.native
  var reports: ReportsResource = js.native
  var urlchannels: UrlchannelsResource = js.native
  /** Get information about the selected Ad Exchange account. */
  def get(request: Key): Request[Account] = js.native
  /** List all accounts available to this Ad Exchange account. */
  def list(request: MaxResults): Request[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: Key => Request[Account],
    list: MaxResults => Request[Accounts],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), metadata = metadata.asInstanceOf[js.Any], preferreddeals = preferreddeals.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
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
    def setAlerts(value: AlertsResource): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomchannels(value: CustomchannelsResource): Self = this.set("customchannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Key => Request[Account]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[Accounts]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMetadata(value: MetadataResource): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferreddeals(value: PreferreddealsResource): Self = this.set("preferreddeals", value.asInstanceOf[js.Any])
    @scala.inline
    def setReports(value: ReportsResource): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlchannels(value: UrlchannelsResource): Self = this.set("urlchannels", value.asInstanceOf[js.Any])
  }
  
}

