package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertoken
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallbackDeviceIds
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[Device]
  /** Deletes a device. */
  def delete(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /** Gets details about a device. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Device]
  /** List devices in a device registry. */
  def list(request: AnonAccesstokenAltBearertokenCallbackDeviceIds): Request_[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: AnonAccesstokenAltBearertokenCallback): Request_[DeviceConfig]
  /** Updates a device. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: AnonAccesstokenAltBearertoken => Request_[Device],
    delete: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Device],
    list: AnonAccesstokenAltBearertokenCallbackDeviceIds => Request_[ListDevicesResponse],
    modifyCloudToDeviceConfig: AnonAccesstokenAltBearertokenCallback => Request_[DeviceConfig],
    patch: AnonAccesstokenAltBearertokenCallbackFields => Request_[Device],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyCloudToDeviceConfig = js.Any.fromFunction1(modifyCloudToDeviceConfig), patch = js.Any.fromFunction1(patch), states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DevicesResource]
  }
}

