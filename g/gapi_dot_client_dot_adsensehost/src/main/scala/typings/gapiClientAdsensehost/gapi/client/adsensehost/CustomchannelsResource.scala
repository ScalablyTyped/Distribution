package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonAdClientId
import typings.gapiClientAdsensehost.AnonCustomChannelId
import typings.gapiClientAdsensehost.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: AnonMaxResults): Request_[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: AnonCustomChannelId): Request_[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: AnonAdClientId): Request_[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: AnonCustomChannelId => Request_[CustomChannel],
    get: AnonCustomChannelId => Request_[CustomChannel],
    insert: AnonAdClientId => Request_[CustomChannel],
    list: AnonMaxResults => Request_[CustomChannels],
    patch: AnonCustomChannelId => Request_[CustomChannel],
    update: AnonAdClientId => Request_[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

