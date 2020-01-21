package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAlt
import typings.gapiClientAndroidenterprise.AnonAltDeviceIdEnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: AnonAltDeviceIdEnterpriseId): Request_[Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: AnonAltDeviceIdEnterpriseId): Request_[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: AnonAlt): Request_[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: AnonAltDeviceIdEnterpriseId): Request_[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: AnonAltDeviceIdEnterpriseId): Request_[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: AnonAltDeviceIdEnterpriseId => Request_[Unit],
    get: AnonAltDeviceIdEnterpriseId => Request_[ManagedConfiguration],
    list: AnonAlt => Request_[ManagedConfigurationsForDeviceListResponse],
    patch: AnonAltDeviceIdEnterpriseId => Request_[ManagedConfiguration],
    update: AnonAltDeviceIdEnterpriseId => Request_[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

