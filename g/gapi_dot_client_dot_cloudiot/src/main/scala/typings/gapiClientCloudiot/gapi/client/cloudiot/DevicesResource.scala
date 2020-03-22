package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudiot.AnonBearertoken
import typings.gapiClientCloudiot.AnonCallback
import typings.gapiClientCloudiot.AnonDeviceIds
import typings.gapiClientCloudiot.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: AnonBearertoken): Request_[Device]
  /** Deletes a device. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets details about a device. */
  def get(request: AnonCallback): Request_[Device]
  /** List devices in a device registry. */
  def list(request: AnonDeviceIds): Request_[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: AnonCallback): Request_[DeviceConfig]
  /** Updates a device. */
  def patch(request: AnonFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: AnonBearertoken => Request_[Device],
    delete: AnonCallback => Request_[js.Object],
    get: AnonCallback => Request_[Device],
    list: AnonDeviceIds => Request_[ListDevicesResponse],
    modifyCloudToDeviceConfig: AnonCallback => Request_[DeviceConfig],
    patch: AnonFields => Request_[Device],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyCloudToDeviceConfig = js.Any.fromFunction1(modifyCloudToDeviceConfig), patch = js.Any.fromFunction1(patch), states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DevicesResource]
  }
}

