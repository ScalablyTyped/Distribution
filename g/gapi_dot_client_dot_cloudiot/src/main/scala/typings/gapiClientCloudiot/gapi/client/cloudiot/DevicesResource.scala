package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudiot.anon.Bearertoken
import typings.gapiClientCloudiot.anon.Callback
import typings.gapiClientCloudiot.anon.DeviceIds
import typings.gapiClientCloudiot.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource = js.native
  var states: StatesResource = js.native
  /** Creates a device in a device registry. */
  def create(request: Bearertoken): Request[Device] = js.native
  /** Deletes a device. */
  def delete(request: Callback): Request[js.Object] = js.native
  /** Gets details about a device. */
  def get(request: Callback): Request[Device] = js.native
  /** List devices in a device registry. */
  def list(request: DeviceIds): Request[ListDevicesResponse] = js.native
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: Callback): Request[DeviceConfig] = js.native
  /** Updates a device. */
  def patch(request: Fields): Request[Device] = js.native
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
  @scala.inline
  implicit class DevicesResourceOps[Self <: DevicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigVersions(value: ConfigVersionsResource): Self = this.set("configVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: Bearertoken => Request[Device]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Callback => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Callback => Request[Device]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: DeviceIds => Request[ListDevicesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setModifyCloudToDeviceConfig(value: Callback => Request[DeviceConfig]): Self = this.set("modifyCloudToDeviceConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Device]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setStates(value: StatesResource): Self = this.set("states", value.asInstanceOf[js.Any])
  }
  
}

