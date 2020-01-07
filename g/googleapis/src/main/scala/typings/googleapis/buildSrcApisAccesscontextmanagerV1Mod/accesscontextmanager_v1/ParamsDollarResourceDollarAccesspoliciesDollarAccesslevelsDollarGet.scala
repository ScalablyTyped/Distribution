package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet extends StandardParameters {
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression Language
    * rather than as `BasicLevels`. Defaults to AS_DEFINED, where Access Levels
    * are returned as `BasicLevels` or `CustomLevels` based on how they were
    * created. If set to CEL, all Access Levels are returned as `CustomLevels`.
    * In the CEL case, `BasicLevels` are translated to equivalent
    * `CustomLevels`.
    */
  var accessLevelFormat: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Resource name for the Access Level.  Format:
    * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
    */
  var name: js.UndefOr[String] = js.native
}

