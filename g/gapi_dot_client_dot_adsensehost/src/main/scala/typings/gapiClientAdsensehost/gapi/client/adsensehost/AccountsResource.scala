package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.FilterAdClientId
import typings.gapiClientAdsensehost.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var reports: ReportsResource
  /** Get information about the selected associated AdSense account. */
  def get(request: Key): Request[Account]
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: FilterAdClientId): Request[Accounts]
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
}

