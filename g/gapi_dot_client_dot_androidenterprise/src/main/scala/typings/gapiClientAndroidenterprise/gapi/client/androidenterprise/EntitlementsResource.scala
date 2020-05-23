package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import typings.gapiClientAndroidenterprise.anon.EntitlementId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: EntitlementId): Request[Unit]
  /** Retrieves details of an entitlement. */
  def get(request: EntitlementId): Request[Entitlement]
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[EntitlementsListResponse]
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: typings.gapiClientAndroidenterprise.anon.Install): Request[Entitlement]
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: typings.gapiClientAndroidenterprise.anon.Install): Request[Entitlement]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: EntitlementId => Request[Unit],
    get: EntitlementId => Request[Entitlement],
    list: EnterpriseId => Request[EntitlementsListResponse],
    patch: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement],
    update: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EntitlementsResource]
  }
}

