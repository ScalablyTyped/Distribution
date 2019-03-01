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
    delete: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
    ],
    get: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
    ],
    insert: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
    ],
    list: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels]
    ],
    patch: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
    ],
    update: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
    ]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

