package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.FilterAdClientId
import typings.gapiClientAdsensehost.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var adclients: AdclientsResource = js.native
  var adunits: AdunitsResource = js.native
  var reports: ReportsResource = js.native
  /** Get information about the selected associated AdSense account. */
  def get(request: Key): Request[Account] = js.native
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: FilterAdClientId): Request[Accounts] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    get: Key => Request[Account],
    list: FilterAdClientId => Request[Accounts],
    reports: ReportsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
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
    def setGet(value: Key => Request[Account]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: FilterAdClientId => Request[Accounts]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setReports(value: ReportsResource): Self = this.set("reports", value.asInstanceOf[js.Any])
  }
  
}

