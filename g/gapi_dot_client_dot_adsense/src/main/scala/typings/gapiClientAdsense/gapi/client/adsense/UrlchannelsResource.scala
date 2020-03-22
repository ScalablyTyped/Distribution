package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonFields
import typings.gapiClientAdsense.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: AnonFields): Request_[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: AnonMaxResults): Request_[UrlChannels] = js.native
}

