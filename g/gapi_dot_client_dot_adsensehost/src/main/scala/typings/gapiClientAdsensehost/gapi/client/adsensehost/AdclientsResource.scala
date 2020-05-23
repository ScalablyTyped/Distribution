package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AccountId
import typings.gapiClientAdsensehost.anon.AdClientId
import typings.gapiClientAdsensehost.anon.Alt
import typings.gapiClientAdsensehost.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: AccountId): Request[AdClient] = js.native
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: AdClientId): Request[AdClient] = js.native
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: Alt): Request[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: Fields): Request[AdClients] = js.native
}

