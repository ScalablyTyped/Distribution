package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountId
import typings.gapiClientAdsense.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in the specified account. */
  def list(request: AnonAccountId): Request_[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: AnonAlt): Request_[AdClients] = js.native
}

