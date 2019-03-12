package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfigurationsForDeviceListResponse],
    patch: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration],
    update: gapiDotClientDotAndroidenterpriseLib.Anon_AltDeviceIdEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

