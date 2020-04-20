package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonAdClientId
import typings.gapiClientAdsensehost.AnonMaxResults
import typings.gapiClientAdsensehost.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: AnonQuotaUser): Request_[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: AnonMaxResults): Request_[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[UrlChannel],
    insert: AnonAdClientId => Request_[UrlChannel],
    list: AnonMaxResults => Request_[UrlChannels]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

