package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudiot.anon.Bearertoken
import typings.gapiClientCloudiot.anon.Callback
import typings.gapiClientCloudiot.anon.DeviceIds
import typings.gapiClientCloudiot.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: Bearertoken): Request[Device]
  /** Deletes a device. */
  def delete(request: Callback): Request[js.Object]
  /** Gets details about a device. */
  def get(request: Callback): Request[Device]
  /** List devices in a device registry. */
  def list(request: DeviceIds): Request[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: Callback): Request[DeviceConfig]
  /** Updates a device. */
  def patch(request: Fields): Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: Bearertoken => Request[Device],
    delete: Callback => Request[js.Object],
    get: Callback => Request[Device],
    list: DeviceIds => Request[ListDevicesResponse],
    modifyCloudToDeviceConfig: Callback => Request[DeviceConfig],
    patch: Fields => Request[Device],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyCloudToDeviceConfig = js.Any.fromFunction1(modifyCloudToDeviceConfig), patch = js.Any.fromFunction1(patch), states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesResource]
  }
}

