package typings.gapiDotClientDotAdsensehost.gapiNs.clientNs

import typings.gapiDotClientDotAdsensehost.gapiDotClientDotAdsensehostStrings.adsensehost
import typings.gapiDotClientDotAdsensehost.gapiDotClientDotAdsensehostStrings.v4DOT1
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.AccountsResource
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.AdclientsResource
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.AssociationsessionsResource
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.CustomchannelsResource
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.ReportsResource
import typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs.UrlchannelsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  val adclients: AdclientsResource = js.native
  val associationsessions: AssociationsessionsResource = js.native
  val customchannels: CustomchannelsResource = js.native
  val reports: ReportsResource = js.native
  val urlchannels: UrlchannelsResource = js.native
  /** Load AdSense Host API v4.1 */
  def load(name: adsensehost, version: v4DOT1): js.Thenable[Unit] = js.native
  def load(name: adsensehost, version: v4DOT1, callback: js.Function0[_]): Unit = js.native
}

