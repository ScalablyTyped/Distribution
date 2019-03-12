package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(
    request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForUserListResponse],
    patch: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration],
    update: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyManagedConfigurationForUserId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
}

