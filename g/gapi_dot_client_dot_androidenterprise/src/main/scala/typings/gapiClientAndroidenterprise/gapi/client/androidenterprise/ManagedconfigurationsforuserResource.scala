package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import typings.gapiClientAndroidenterprise.anon.ManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: ManagedConfigurationForUserId): Request[Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: ManagedConfigurationForUserId): Request[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: ManagedConfigurationForUserId): Request[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: ManagedConfigurationForUserId): Request[ManagedConfiguration]
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: ManagedConfigurationForUserId => Request[Unit],
    get: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    list: EnterpriseId => Request[ManagedConfigurationsForUserListResponse],
    patch: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    update: ManagedConfigurationForUserId => Request[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
}

