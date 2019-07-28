package typings.gapiDotClientDotAdsense.gapiNs.clientNs

import typings.gapiDotClientDotAdsense.gapiDotClientDotAdsenseStrings.adsense
import typings.gapiDotClientDotAdsense.gapiDotClientDotAdsenseStrings.v1DOT4
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.AccountsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.AdclientsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.AdunitsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.AlertsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.CustomchannelsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.MetadataResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.PaymentsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.ReportsResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.SavedadstylesResource
import typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs.UrlchannelsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  val adclients: AdclientsResource = js.native
  val adunits: AdunitsResource = js.native
  val alerts: AlertsResource = js.native
  val customchannels: CustomchannelsResource = js.native
  val metadata: MetadataResource = js.native
  val payments: PaymentsResource = js.native
  val reports: ReportsResource = js.native
  val savedadstyles: SavedadstylesResource = js.native
  val urlchannels: UrlchannelsResource = js.native
  /** Load AdSense Management API v1.4 */
  def load(name: adsense, version: v1DOT4): js.Thenable[Unit] = js.native
  def load(name: adsense, version: v1DOT4, callback: js.Function0[_]): Unit = js.native
}

