package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBeaconsDollarDiagnosticsDollarList extends StandardParameters {
  /**
    * Requests only beacons that have the given alert. For example, to find
    * beacons that have low batteries use `alert_filter=LOW_BATTERY`.
    */
  var alertFilter: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon that the diagnostics are for.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum number of results to return. Defaults to 10.
    * Maximum 1000. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Requests results that occur after the `page_token`, obtained from the
    * response to a previous request. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Requests only diagnostic records for the given project id. If not set,
    * then the project making the request will be used for looking up
    * diagnostic records. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

