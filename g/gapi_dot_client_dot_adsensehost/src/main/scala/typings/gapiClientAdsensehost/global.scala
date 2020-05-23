package typings.gapiClientAdsensehost

import typings.gapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typings.gapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typings.gapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typings.gapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typings.gapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typings.gapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typings.gapiClientAdsensehost.gapiClientAdsensehostStrings.adsensehost
import typings.gapiClientAdsensehost.gapiClientAdsensehostStrings.v4Dot1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val accounts: AccountsResource = js.native
      val adclients: AdclientsResource = js.native
      val associationsessions: AssociationsessionsResource = js.native
      val customchannels: CustomchannelsResource = js.native
      val reports: ReportsResource = js.native
      val urlchannels: UrlchannelsResource = js.native
      /** Load AdSense Host API v4.1 */
      def load(name: adsensehost, version: v4Dot1): js.Thenable[Unit] = js.native
      def load(name: adsensehost, version: v4Dot1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

