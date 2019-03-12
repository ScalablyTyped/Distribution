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
    delete: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId => gapiDotClientLib.gapiNs.clientNs.Request[AdUnit],
    get: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId => gapiDotClientLib.gapiNs.clientNs.Request[AdUnit],
    getAdCode: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAdUnitId => gapiDotClientLib.gapiNs.clientNs.Request[AdCode],
    insert: gapiDotClientDotAdsensehostLib.Anon_AccountId => gapiDotClientLib.gapiNs.clientNs.Request[AdUnit],
    list: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[AdUnits],
    patch: gapiDotClientDotAdsensehostLib.Anon_AccountIdAdClientId => gapiDotClientLib.gapiNs.clientNs.Request[AdUnit],
    update: gapiDotClientDotAdsensehostLib.Anon_AccountId => gapiDotClientLib.gapiNs.clientNs.Request[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdunitsResource]
  }
}

