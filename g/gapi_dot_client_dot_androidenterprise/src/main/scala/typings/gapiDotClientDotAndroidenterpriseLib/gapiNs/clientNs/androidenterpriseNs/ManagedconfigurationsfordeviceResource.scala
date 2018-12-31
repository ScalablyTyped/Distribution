package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
}

