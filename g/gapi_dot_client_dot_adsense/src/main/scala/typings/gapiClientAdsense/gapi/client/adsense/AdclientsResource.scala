package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AccountId
import typings.gapiClientAdsense.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in the specified account. */
  def list(request: AccountId): Request[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: Alt): Request[AdClients] = js.native
}

