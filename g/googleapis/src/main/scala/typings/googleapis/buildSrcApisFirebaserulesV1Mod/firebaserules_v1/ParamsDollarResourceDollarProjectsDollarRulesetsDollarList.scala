package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarRulesetsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * `Ruleset` filter. The list method supports filters with restrictions on
    * `Ruleset.name`.  Filters on `Ruleset.create_time` should use the `date`
    * function which parses strings that conform to the RFC 3339 date/time
    * specifications.  Example: `create_time > date("2017-01-01T00:00:00Z") AND
    * name=UUID-*`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Resource name for the project.  Format: `projects/{project_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is
    * just a hint and the service may choose to load less than `page_size` due
    * to the size of the output. To traverse all of the releases, caller should
    * iterate until the `page_token` is empty.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for loading the next batch of `Ruleset` instances.
    */
  var pageToken: js.UndefOr[String] = js.native
}

