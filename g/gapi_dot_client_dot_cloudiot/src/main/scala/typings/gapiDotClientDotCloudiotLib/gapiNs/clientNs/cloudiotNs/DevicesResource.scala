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

