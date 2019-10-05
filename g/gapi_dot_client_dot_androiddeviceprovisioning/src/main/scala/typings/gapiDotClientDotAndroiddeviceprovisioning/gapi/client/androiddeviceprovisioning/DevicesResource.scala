package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_Accesstoken
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: Anon_AccesstokenAltBearertoken): Request[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: Anon_AccesstokenAltBearertoken): Request[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: Anon_AccesstokenAltBearertoken): Request[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: Anon_AccesstokenAltBearertoken): Request[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: Anon_Accesstoken): Request[Device]
  /** Update the metadata. */
  def metadata(request: Anon_AccesstokenAltBearertokenCallback): Request[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: Anon_AccesstokenAltBearertoken): Request[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: Anon_AccesstokenAltBearertoken): Request[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: Anon_AccesstokenAltBearertoken => Request[ClaimDeviceResponse],
    claimAsync: Anon_AccesstokenAltBearertoken => Request[Operation],
    findByIdentifier: Anon_AccesstokenAltBearertoken => Request[FindDevicesByDeviceIdentifierResponse],
    findByOwner: Anon_AccesstokenAltBearertoken => Request[FindDevicesByOwnerResponse],
    get: Anon_Accesstoken => Request[Device],
    metadata: Anon_AccesstokenAltBearertokenCallback => Request[DeviceMetadata],
    unclaim: Anon_AccesstokenAltBearertoken => Request[js.Object],
    unclaimAsync: Anon_AccesstokenAltBearertoken => Request[Operation],
    updateMetadataAsync: Anon_AccesstokenAltBearertoken => Request[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
  
    __obj.asInstanceOf[DevicesResource]
  }
}

