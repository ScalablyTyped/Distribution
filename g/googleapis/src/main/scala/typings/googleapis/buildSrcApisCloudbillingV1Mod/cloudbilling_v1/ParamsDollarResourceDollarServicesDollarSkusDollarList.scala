package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarServicesDollarSkusDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time. Optional. If not specified
    * USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Requested page size. Defaults to 5000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus` call. If
    * unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the service. Example: "services/DA34-426B-A397"
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var startTime: js.UndefOr[String] = js.native
}

