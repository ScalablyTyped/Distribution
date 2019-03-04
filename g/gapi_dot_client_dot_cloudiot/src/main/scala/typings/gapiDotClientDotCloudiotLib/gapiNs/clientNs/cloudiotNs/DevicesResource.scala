package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /** Deletes a device. */
  def delete(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets details about a device. */
  def get(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /** List devices in a device registry. */
  def list(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackDeviceIds): gapiDotClientLib.gapiNs.clientNs.Request[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[DeviceConfig]
  /** Updates a device. */
  def patch(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ],
    delete: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ],
    list: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackDeviceIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDevicesResponse]
    ],
    modifyCloudToDeviceConfig: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeviceConfig]
    ],
    patch: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions, create = create, delete = delete, get = get, list = list, modifyCloudToDeviceConfig = modifyCloudToDeviceConfig, patch = patch, states = states)
  
    __obj.asInstanceOf[DevicesResource]
  }
}

