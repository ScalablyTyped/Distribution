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
    claim: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ClaimDeviceResponse]
    ],
    claimAsync: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    findByIdentifier: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByDeviceIdentifierResponse]
    ],
    findByOwner: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[FindDevicesByOwnerResponse]
    ],
    get: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Device]
    ],
    metadata: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeviceMetadata]
    ],
    unclaim: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    unclaimAsync: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    updateMetadataAsync: js.Function1[
      gapiDotClientDotAndroiddeviceprovisioningLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("claim")(claim)
    __obj.updateDynamic("claimAsync")(claimAsync)
    __obj.updateDynamic("findByIdentifier")(findByIdentifier)
    __obj.updateDynamic("findByOwner")(findByOwner)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("unclaim")(unclaim)
    __obj.updateDynamic("unclaimAsync")(unclaimAsync)
    __obj.updateDynamic("updateMetadataAsync")(updateMetadataAsync)
    __obj.asInstanceOf[DevicesResource]
  }
}

