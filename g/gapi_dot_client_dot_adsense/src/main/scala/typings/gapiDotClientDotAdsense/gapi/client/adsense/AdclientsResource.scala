package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountId
import typings.gapiDotClientDotAdsense.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in the specified account. */
  def list(request: Anon_AccountId): Request[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: Anon_Alt): Request[AdClients] = js.native
}

