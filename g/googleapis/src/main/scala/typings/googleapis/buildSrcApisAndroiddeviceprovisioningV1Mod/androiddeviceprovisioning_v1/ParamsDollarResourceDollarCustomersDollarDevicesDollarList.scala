package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCustomersDollarDevicesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of devices to show in a page of results. Must be
    * between 1 and 100 inclusive.
    */
  var pageSize: js.UndefOr[String] = js.native
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The customer managing the devices. An API resource name in the
    * format `customers/[CUSTOMER_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

