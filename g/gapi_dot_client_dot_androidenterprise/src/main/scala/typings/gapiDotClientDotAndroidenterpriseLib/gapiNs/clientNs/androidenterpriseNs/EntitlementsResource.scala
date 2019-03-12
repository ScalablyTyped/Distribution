package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of an entitlement. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementId): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementId => gapiDotClientLib.gapiNs.clientNs.Request[Entitlement],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[EntitlementsListResponse],
    patch: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Entitlement],
    update: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdEntitlementIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

