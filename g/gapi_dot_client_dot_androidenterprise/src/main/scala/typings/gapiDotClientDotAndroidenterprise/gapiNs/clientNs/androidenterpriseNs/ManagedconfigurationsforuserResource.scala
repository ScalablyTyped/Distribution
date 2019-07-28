package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseId
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request[Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: Anon_AltEnterpriseId): Request[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request[ManagedConfiguration]
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request[Unit],
    get: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request[ManagedConfiguration],
    list: Anon_AltEnterpriseId => Request[ManagedConfigurationsForUserListResponse],
    patch: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request[ManagedConfiguration],
    update: Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
}

