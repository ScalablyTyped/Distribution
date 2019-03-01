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
    get: js.Function1[
      gapiDotClientDotAdsenseLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    list: js.Function1[
      gapiDotClientDotAdsenseLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
    ],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adclients")(adclients)
    __obj.updateDynamic("adunits")(adunits)
    __obj.updateDynamic("alerts")(alerts)
    __obj.updateDynamic("customchannels")(customchannels)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("payments")(payments)
    __obj.updateDynamic("reports")(reports)
    __obj.updateDynamic("savedadstyles")(savedadstyles)
    __obj.updateDynamic("urlchannels")(urlchannels)
    __obj.asInstanceOf[AccountsResource]
  }
}

