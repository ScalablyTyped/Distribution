package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallbackDeviceIds
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Device]
  /** Deletes a device. */
  def delete(request: Anon_AccesstokenAltBearertokenCallback): Request[js.Object]
  /** Gets details about a device. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[Device]
  /** List devices in a device registry. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackDeviceIds): Request[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: Anon_AccesstokenAltBearertokenCallback): Request[DeviceConfig]
  /** Updates a device. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: Anon_AccesstokenAltBearertoken => Request[Device],
    delete: Anon_AccesstokenAltBearertokenCallback => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallback => Request[Device],
    list: Anon_AccesstokenAltBearertokenCallbackDeviceIds => Request[ListDevicesResponse],
    modifyCloudToDeviceConfig: Anon_AccesstokenAltBearertokenCallback => Request[DeviceConfig],
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[Device],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyCloudToDeviceConfig = js.Any.fromFunction1(modifyCloudToDeviceConfig), patch = js.Any.fromFunction1(patch), states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DevicesResource]
  }
}

