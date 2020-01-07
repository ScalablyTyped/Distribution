package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList extends StandardParameters {
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression language,
    * as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning
    * `AccessLevels` in the format they were defined.
    */
  var accessLevelFormat: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of Access Levels to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for the next batch of Access Level instances. Defaults to
    * the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the access policy to list Access Levels from.
    * Format: `accessPolicies/{policy_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

