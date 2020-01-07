package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCompaniesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  Set to true if the companies request must have open jobs.
    * Defaults to false.  If true, at most page_size of companies are fetched,
    * among which only those with open jobs are returned.
    */
  var mustHaveOpenJobs: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The maximum number of companies to be returned, at most 100.
    * Default is 100 if a non-positive number is provided.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting indicator from which to return results.
    */
  var pageToken: js.UndefOr[String] = js.native
}

