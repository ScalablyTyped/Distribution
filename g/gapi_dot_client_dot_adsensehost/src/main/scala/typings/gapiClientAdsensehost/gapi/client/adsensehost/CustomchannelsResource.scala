package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonAdClientId
import typings.gapiClientAdsensehost.AnonAdClientIdAlt
import typings.gapiClientAdsensehost.AnonAdClientIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: AnonAdClientIdAlt): Request_[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: AnonAdClientIdAlt): Request_[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AnonAdClientId): Request_[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: AnonAdClientIdAltFields): Request_[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: AnonAdClientIdAlt): Request_[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: AnonAdClientId): Request_[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: AnonAdClientIdAlt => Request_[CustomChannel],
    get: AnonAdClientIdAlt => Request_[CustomChannel],
    insert: AnonAdClientId => Request_[CustomChannel],
    list: AnonAdClientIdAltFields => Request_[CustomChannels],
    patch: AnonAdClientIdAlt => Request_[CustomChannel],
    update: AnonAdClientId => Request_[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

