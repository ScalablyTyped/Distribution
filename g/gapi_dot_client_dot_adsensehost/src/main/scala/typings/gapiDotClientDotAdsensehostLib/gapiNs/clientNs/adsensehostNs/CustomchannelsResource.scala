package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: gapiDotClientDotAdsensehostLib.Anon_AdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** List all host custom channels in this AdSense account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels]
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** Update a custom channel in the host AdSense account. */
  def update(request: gapiDotClientDotAdsensehostLib.Anon_AdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel],
    get: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel],
    insert: gapiDotClientDotAdsensehostLib.Anon_AdClientId => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel],
    list: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels],
    patch: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel],
    update: gapiDotClientDotAdsensehostLib.Anon_AdClientId => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

