package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePartnersDevicesMetadata extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Required. The owner of the newly set metadata. Set this to the partner
    * ID.
    */
  var metadataOwnerId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeviceMetadataRequest] = js.native
}

object ParamsResourcePartnersDevicesMetadata {
  @scala.inline
  def apply(): ParamsResourcePartnersDevicesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesMetadata]
  }
  @scala.inline
  implicit class ParamsResourcePartnersDevicesMetadataOps[Self <: ParamsResourcePartnersDevicesMetadata] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setMetadataOwnerId(value: String): Self = this.set("metadataOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataOwnerId: Self = this.set("metadataOwnerId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaUpdateDeviceMetadataRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

