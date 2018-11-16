package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_ManagedConfigurationForUserId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_ManagedConfigurationForUserId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_ManagedConfigurationForUserId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_ManagedConfigurationForUserId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
}

