package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsensehost.Anon_AccountIdAltFields
import typings.gapiDotClientDotAdsensehost.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var reports: ReportsResource
  /** Get information about the selected associated AdSense account. */
  def get(request: Anon_AccountIdAltFields): Request[Account]
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: Anon_AltFields): Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    get: Anon_AccountIdAltFields => Request[Account],
    list: Anon_AltFields => Request[Accounts],
    reports: ReportsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

