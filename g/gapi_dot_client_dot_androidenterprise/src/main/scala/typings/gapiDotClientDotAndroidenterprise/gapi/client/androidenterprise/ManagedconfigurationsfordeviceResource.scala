package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_Alt
import typings.gapiDotClientDotAndroidenterprise.Anon_AltDeviceIdEnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: Anon_AltDeviceIdEnterpriseId): Request[Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: Anon_AltDeviceIdEnterpriseId): Request[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: Anon_Alt): Request[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: Anon_AltDeviceIdEnterpriseId): Request[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: Anon_AltDeviceIdEnterpriseId): Request[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: Anon_AltDeviceIdEnterpriseId => Request[Unit],
    get: Anon_AltDeviceIdEnterpriseId => Request[ManagedConfiguration],
    list: Anon_Alt => Request[ManagedConfigurationsForDeviceListResponse],
    patch: Anon_AltDeviceIdEnterpriseId => Request[ManagedConfiguration],
    update: Anon_AltDeviceIdEnterpriseId => Request[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

