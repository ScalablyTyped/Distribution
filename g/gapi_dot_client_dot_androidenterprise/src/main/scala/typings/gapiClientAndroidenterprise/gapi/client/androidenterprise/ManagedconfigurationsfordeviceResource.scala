package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Alt
import typings.gapiClientAndroidenterprise.anon.ManagedConfigurationForDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: ManagedConfigurationForDeviceId): Request[Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: Alt): Request[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: ManagedConfigurationForDeviceId => Request[Unit],
    get: ManagedConfigurationForDeviceId => Request[ManagedConfiguration],
    list: Alt => Request[ManagedConfigurationsForDeviceListResponse],
    patch: ManagedConfigurationForDeviceId => Request[ManagedConfiguration],
    update: ManagedConfigurationForDeviceId => Request[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

