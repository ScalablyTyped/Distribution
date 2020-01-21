package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseId
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request_[Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request_[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: AnonAltEnterpriseId): Request_[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request_[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId): Request_[ManagedConfiguration]
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request_[Unit],
    get: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request_[ManagedConfiguration],
    list: AnonAltEnterpriseId => Request_[ManagedConfigurationsForUserListResponse],
    patch: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request_[ManagedConfiguration],
    update: AnonAltEnterpriseIdFieldsKeyManagedConfigurationForUserId => Request_[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
}

