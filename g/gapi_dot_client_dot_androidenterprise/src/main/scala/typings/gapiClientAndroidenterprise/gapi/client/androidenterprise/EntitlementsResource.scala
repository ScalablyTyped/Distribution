package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseId
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdEntitlementId
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdEntitlementIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: AnonAltEnterpriseIdEntitlementId): Request_[Unit]
  /** Retrieves details of an entitlement. */
  def get(request: AnonAltEnterpriseIdEntitlementId): Request_[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: AnonAltEnterpriseId): Request_[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: AnonAltEnterpriseIdEntitlementIdFields): Request_[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: AnonAltEnterpriseIdEntitlementIdFields): Request_[Entitlement]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: AnonAltEnterpriseIdEntitlementId => Request_[Unit],
    get: AnonAltEnterpriseIdEntitlementId => Request_[Entitlement],
    list: AnonAltEnterpriseId => Request_[EntitlementsListResponse],
    patch: AnonAltEnterpriseIdEntitlementIdFields => Request_[Entitlement],
    update: AnonAltEnterpriseIdEntitlementIdFields => Request_[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

