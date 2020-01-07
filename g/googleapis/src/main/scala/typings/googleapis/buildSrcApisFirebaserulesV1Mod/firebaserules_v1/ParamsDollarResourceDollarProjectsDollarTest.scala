package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarTest extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Tests may either provide `source` or a `Ruleset` resource name.  For
    * tests against `source`, the resource name must refer to the project:
    * Format: `projects/{project_id}`  For tests against a `Ruleset`, this must
    * be the `Ruleset` resource name: Format:
    * `projects/{project_id}/rulesets/{ruleset_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$TestRulesetRequest] = js.native
}

