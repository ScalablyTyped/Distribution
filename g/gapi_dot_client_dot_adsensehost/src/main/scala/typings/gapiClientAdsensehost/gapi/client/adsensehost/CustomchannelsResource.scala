package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AdClientId
import typings.gapiClientAdsensehost.anon.CustomChannelId
import typings.gapiClientAdsensehost.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: CustomChannelId): Request[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: CustomChannelId): Request[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AdClientId): Request[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: MaxResults): Request[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: CustomChannelId): Request[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: AdClientId): Request[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: CustomChannelId => Request[CustomChannel],
    get: CustomChannelId => Request[CustomChannel],
    insert: AdClientId => Request[CustomChannel],
    list: MaxResults => Request[CustomChannels],
    patch: CustomChannelId => Request[CustomChannel],
    update: AdClientId => Request[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

