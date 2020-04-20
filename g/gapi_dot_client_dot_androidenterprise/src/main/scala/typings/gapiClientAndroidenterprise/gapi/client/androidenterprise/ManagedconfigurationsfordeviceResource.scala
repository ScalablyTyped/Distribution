package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAlt
import typings.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: AnonManagedConfigurationForDeviceId): Request_[Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: AnonAlt): Request_[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: AnonManagedConfigurationForDeviceId => Request_[Unit],
    get: AnonManagedConfigurationForDeviceId => Request_[ManagedConfiguration],
    list: AnonAlt => Request_[ManagedConfigurationsForDeviceListResponse],
    patch: AnonManagedConfigurationForDeviceId => Request_[ManagedConfiguration],
    update: AnonManagedConfigurationForDeviceId => Request_[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

