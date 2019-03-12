package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /** Update the metadata. */
  def metadata(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ClaimDeviceResponse],
    claimAsync: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    findByIdentifier: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByDeviceIdentifierResponse],
    findByOwner: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByOwnerResponse],
    get: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Device],
    metadata: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[DeviceMetadata],
    unclaim: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    unclaimAsync: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    updateMetadataAsync: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
  
    __obj.asInstanceOf[DevicesResource]
  }
}

