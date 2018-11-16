package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val accounts: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.AccountsResource = js.native
  val adclients: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.AdclientsResource = js.native
  val adunits: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.AdunitsResource = js.native
  val alerts: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.AlertsResource = js.native
  val customchannels: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.CustomchannelsResource = js.native
  val metadata: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.MetadataResource = js.native
  val payments: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.PaymentsResource = js.native
  val reports: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.ReportsResource = js.native
  val savedadstyles: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.SavedadstylesResource = js.native
  val urlchannels: gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs.UrlchannelsResource = js.native
  /** Load AdSense Management API v1.4 */
  def load(
    name: gapiDotClientDotAdsenseLib.gapiDotClientDotAdsenseLibStrings.adsense,
    version: gapiDotClientDotAdsenseLib.gapiDotClientDotAdsenseLibStrings.v1DOT4
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAdsenseLib.gapiDotClientDotAdsenseLibStrings.adsense,
    version: gapiDotClientDotAdsenseLib.gapiDotClientDotAdsenseLibStrings.v1DOT4,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

