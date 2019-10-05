package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsensehost.Anon_AdClientId
import typings.gapiDotClientDotAdsensehost.Anon_AdClientIdAlt
import typings.gapiDotClientDotAdsensehost.Anon_AdClientIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: Anon_AdClientIdAlt): Request[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: Anon_AdClientIdAlt): Request[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: Anon_AdClientId): Request[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: Anon_AdClientIdAltFields): Request[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: Anon_AdClientIdAlt): Request[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: Anon_AdClientId): Request[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: Anon_AdClientIdAlt => Request[CustomChannel],
    get: Anon_AdClientIdAlt => Request[CustomChannel],
    insert: Anon_AdClientId => Request[CustomChannel],
    list: Anon_AdClientIdAltFields => Request[CustomChannels],
    patch: Anon_AdClientIdAlt => Request[CustomChannel],
    update: Anon_AdClientId => Request[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

