package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroiddeviceprovisioning.anon.Accesstoken
import typings.gapiClientAndroiddeviceprovisioning.anon.Bearertoken
import typings.gapiClientAndroiddeviceprovisioning.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: Bearertoken): Request[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: Bearertoken): Request[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: Bearertoken): Request[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: Bearertoken): Request[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: Accesstoken): Request[Device]
  /** Update the metadata. */
  def metadata(request: Callback): Request[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: Bearertoken): Request[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: Bearertoken): Request[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: Bearertoken): Request[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: Bearertoken => Request[ClaimDeviceResponse],
    claimAsync: Bearertoken => Request[Operation],
    findByIdentifier: Bearertoken => Request[FindDevicesByDeviceIdentifierResponse],
    findByOwner: Bearertoken => Request[FindDevicesByOwnerResponse],
    get: Accesstoken => Request[Device],
    metadata: Callback => Request[DeviceMetadata],
    unclaim: Bearertoken => Request[js.Object],
    unclaimAsync: Bearertoken => Request[Operation],
    updateMetadataAsync: Bearertoken => Request[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
    __obj.asInstanceOf[DevicesResource]
  }
}

