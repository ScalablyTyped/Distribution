package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePartnersDevicesClaimasync extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The ID of the reseller partner.
    */
  var partnerId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClaimDevicesRequest] = js.native
}

object ParamsResourcePartnersDevicesClaimasync {
  @scala.inline
  def apply(): ParamsResourcePartnersDevicesClaimasync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesClaimasync]
  }
  @scala.inline
  implicit class ParamsResourcePartnersDevicesClaimasyncOps[Self <: ParamsResourcePartnersDevicesClaimasync] (val x: Self) extends AnyVal {
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
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaClaimDevicesRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

