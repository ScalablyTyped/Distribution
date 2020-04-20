package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroiddeviceprovisioning.AnonAccesstoken
import typings.gapiClientAndroiddeviceprovisioning.AnonBearertoken
import typings.gapiClientAndroiddeviceprovisioning.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: AnonBearertoken): Request_[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: AnonBearertoken): Request_[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: AnonBearertoken): Request_[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: AnonBearertoken): Request_[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: AnonAccesstoken): Request_[Device]
  /** Update the metadata. */
  def metadata(request: AnonCallback): Request_[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: AnonBearertoken): Request_[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: AnonBearertoken): Request_[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: AnonBearertoken): Request_[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: AnonBearertoken => Request_[ClaimDeviceResponse],
    claimAsync: AnonBearertoken => Request_[Operation],
    findByIdentifier: AnonBearertoken => Request_[FindDevicesByDeviceIdentifierResponse],
    findByOwner: AnonBearertoken => Request_[FindDevicesByOwnerResponse],
    get: AnonAccesstoken => Request_[Device],
    metadata: AnonCallback => Request_[DeviceMetadata],
    unclaim: AnonBearertoken => Request_[js.Object],
    unclaimAsync: AnonBearertoken => Request_[Operation],
    updateMetadataAsync: AnonBearertoken => Request_[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
    __obj.asInstanceOf[DevicesResource]
  }
}

