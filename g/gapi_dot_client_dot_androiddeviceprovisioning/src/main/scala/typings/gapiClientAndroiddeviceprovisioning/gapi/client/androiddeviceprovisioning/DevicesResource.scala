package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroiddeviceprovisioning.AnonAccesstoken
import typings.gapiClientAndroiddeviceprovisioning.AnonAccesstokenAltBearertoken
import typings.gapiClientAndroiddeviceprovisioning.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: AnonAccesstokenAltBearertoken): Request_[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: AnonAccesstokenAltBearertoken): Request_[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: AnonAccesstokenAltBearertoken): Request_[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: AnonAccesstoken): Request_[Device]
  /** Update the metadata. */
  def metadata(request: AnonAccesstokenAltBearertokenCallback): Request_[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: AnonAccesstokenAltBearertoken): Request_[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: AnonAccesstokenAltBearertoken => Request_[ClaimDeviceResponse],
    claimAsync: AnonAccesstokenAltBearertoken => Request_[Operation],
    findByIdentifier: AnonAccesstokenAltBearertoken => Request_[FindDevicesByDeviceIdentifierResponse],
    findByOwner: AnonAccesstokenAltBearertoken => Request_[FindDevicesByOwnerResponse],
    get: AnonAccesstoken => Request_[Device],
    metadata: AnonAccesstokenAltBearertokenCallback => Request_[DeviceMetadata],
    unclaim: AnonAccesstokenAltBearertoken => Request_[js.Object],
    unclaimAsync: AnonAccesstokenAltBearertoken => Request_[Operation],
    updateMetadataAsync: AnonAccesstokenAltBearertoken => Request_[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
  
    __obj.asInstanceOf[DevicesResource]
  }
}

