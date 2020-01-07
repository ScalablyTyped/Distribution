package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPartnersDollarCustomersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results to be returned. If not specified or 0, all
    * the records are returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results returned by the server.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the reseller partner.
    */
  var partnerId: js.UndefOr[String] = js.native
}

