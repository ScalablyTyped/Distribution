package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseId
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdEntitlementId
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdEntitlementIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: Anon_AltEnterpriseIdEntitlementId): Request[Unit]
  /** Retrieves details of an entitlement. */
  def get(request: Anon_AltEnterpriseIdEntitlementId): Request[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: Anon_AltEnterpriseId): Request[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: Anon_AltEnterpriseIdEntitlementIdFields): Request[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: Anon_AltEnterpriseIdEntitlementIdFields): Request[Entitlement]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: Anon_AltEnterpriseIdEntitlementId => Request[Unit],
    get: Anon_AltEnterpriseIdEntitlementId => Request[Entitlement],
    list: Anon_AltEnterpriseId => Request[EntitlementsListResponse],
    patch: Anon_AltEnterpriseIdEntitlementIdFields => Request[Entitlement],
    update: Anon_AltEnterpriseIdEntitlementIdFields => Request[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

