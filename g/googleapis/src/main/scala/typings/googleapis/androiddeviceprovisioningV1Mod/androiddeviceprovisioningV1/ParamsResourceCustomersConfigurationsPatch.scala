package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCustomersConfigurationsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. The API resource name in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by
    * the server.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConfiguration] = js.native
  /**
    * Required. The field mask applied to the target `Configuration` before
    * updating the fields. To learn more about using field masks, read
    * [FieldMask](/protocol-buffers/docs/reference/google.protobuf#fieldmask)
    * in the Protocol Buffers documentation.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceCustomersConfigurationsPatch {
  @scala.inline
  def apply(): ParamsResourceCustomersConfigurationsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersConfigurationsPatch]
  }
  @scala.inline
  implicit class ParamsResourceCustomersConfigurationsPatchOps[Self <: ParamsResourceCustomersConfigurationsPatch] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaConfiguration): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

