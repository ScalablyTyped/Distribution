package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: gapiDotClientDotAdsensehostLib.Anon_AdClientId): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels]
}

object UrlchannelsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel],
    insert: gapiDotClientDotAdsensehostLib.Anon_AdClientId => gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel],
    list: gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

