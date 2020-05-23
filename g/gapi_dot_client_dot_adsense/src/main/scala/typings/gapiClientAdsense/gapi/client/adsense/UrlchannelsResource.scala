package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.Fields
import typings.gapiClientAdsense.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: Fields): Request[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: MaxResults): Request[UrlChannels] = js.native
}

