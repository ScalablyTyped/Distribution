package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroiddeviceprovisioning.anon.Accesstoken
import typings.gapiClientAndroiddeviceprovisioning.anon.Bearertoken
import typings.gapiClientAndroiddeviceprovisioning.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: Bearertoken): Request[ClaimDeviceResponse] = js.native
  /** Claim devices asynchronously. */
  def claimAsync(request: Bearertoken): Request[Operation] = js.native
  /** Find devices by device identifier. */
  def findByIdentifier(request: Bearertoken): Request[FindDevicesByDeviceIdentifierResponse] = js.native
  /** Find devices by ownership. */
  def findByOwner(request: Bearertoken): Request[FindDevicesByOwnerResponse] = js.native
  /** Get a device. */
  def get(request: Accesstoken): Request[Device] = js.native
  /** Update the metadata. */
  def metadata(request: Callback): Request[DeviceMetadata] = js.native
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: Bearertoken): Request[js.Object] = js.native
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: Bearertoken): Request[Operation] = js.native
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: Bearertoken): Request[Operation] = js.native
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
    def setClaim(value: Bearertoken => Request[ClaimDeviceResponse]): Self = this.set("claim", js.Any.fromFunction1(value))
    @scala.inline
    def setClaimAsync(value: Bearertoken => Request[Operation]): Self = this.set("claimAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setFindByIdentifier(value: Bearertoken => Request[FindDevicesByDeviceIdentifierResponse]): Self = this.set("findByIdentifier", js.Any.fromFunction1(value))
    @scala.inline
    def setFindByOwner(value: Bearertoken => Request[FindDevicesByOwnerResponse]): Self = this.set("findByOwner", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Device]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setMetadata(value: Callback => Request[DeviceMetadata]): Self = this.set("metadata", js.Any.fromFunction1(value))
    @scala.inline
    def setUnclaim(value: Bearertoken => Request[js.Object]): Self = this.set("unclaim", js.Any.fromFunction1(value))
    @scala.inline
    def setUnclaimAsync(value: Bearertoken => Request[Operation]): Self = this.set("unclaimAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMetadataAsync(value: Bearertoken => Request[Operation]): Self = this.set("updateMetadataAsync", js.Any.fromFunction1(value))
  }
  
}

