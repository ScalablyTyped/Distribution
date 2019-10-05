package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsensehost.Anon_AdClientId
import typings.gapiDotClientDotAdsensehost.Anon_AdClientIdAltFields
import typings.gapiDotClientDotAdsensehost.Anon_AdClientIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: Anon_AdClientIdAltFieldsKey): Request[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: Anon_AdClientId): Request[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: Anon_AdClientIdAltFields): Request[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: Anon_AdClientIdAltFieldsKey => Request[UrlChannel],
    insert: Anon_AdClientId => Request[UrlChannel],
    list: Anon_AdClientIdAltFields => Request[UrlChannels]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

