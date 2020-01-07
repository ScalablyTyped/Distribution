package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCustomersDollarConfigurationsDollarPatch extends StandardParameters {
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
  var requestBody: js.UndefOr[Schema$Configuration] = js.native
  /**
    * Required. The field mask applied to the target `Configuration` before
    * updating the fields. To learn more about using field masks, read
    * [FieldMask](/protocol-buffers/docs/reference/google.protobuf#fieldmask)
    * in the Protocol Buffers documentation.
    */
  var updateMask: js.UndefOr[String] = js.native
}

