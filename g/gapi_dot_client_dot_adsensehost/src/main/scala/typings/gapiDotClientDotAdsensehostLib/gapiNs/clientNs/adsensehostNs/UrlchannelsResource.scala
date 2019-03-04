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
    delete: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
    ],
    insert: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
    ],
    list: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels]
    ]
  ): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list)
  
    __obj.asInstanceOf[UrlchannelsResource]
  }
}

