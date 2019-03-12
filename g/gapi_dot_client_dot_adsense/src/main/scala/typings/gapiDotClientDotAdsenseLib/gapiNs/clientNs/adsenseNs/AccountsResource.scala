package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var alerts: AlertsResource
  var customchannels: CustomchannelsResource
  var payments: PaymentsResource
  var reports: ReportsResource
  var savedadstyles: SavedadstylesResource
  var urlchannels: UrlchannelsResource
  /** Get information about the selected AdSense account. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** List all accounts available to this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: gapiDotClientDotAdsenseLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    list: gapiDotClientDotAdsenseLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Accounts],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients, adunits = adunits, alerts = alerts, customchannels = customchannels, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), payments = payments, reports = reports, savedadstyles = savedadstyles, urlchannels = urlchannels)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

