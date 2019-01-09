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

