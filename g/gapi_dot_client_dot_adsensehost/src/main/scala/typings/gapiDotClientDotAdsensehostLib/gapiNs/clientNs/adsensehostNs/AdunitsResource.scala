package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAdUnitId): gapiDotClientLib.gapiNs.clientNs.Request[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: gapiDotClientDotAdsensehostLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: gapiDotClientDotAdsensehostLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
    ],
    get: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
    ],
    getAdCode: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAdUnitId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdCode]
    ],
    insert: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
    ],
    list: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnits]
    ],
    patch: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
    ],
    update: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
    ]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, getAdCode = getAdCode, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[AdunitsResource]
  }
}

