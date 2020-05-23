package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AdClientId
import typings.gapiClientAdsensehost.anon.MaxResults
import typings.gapiClientAdsensehost.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: QuotaUser): Request[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AdClientId): Request[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: MaxResults): Request[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[UrlChannel],
    insert: AdClientId => Request[UrlChannel],
    list: MaxResults => Request[UrlChannels]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

