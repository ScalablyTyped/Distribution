package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarJobsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The filter string specifies the jobs to be enumerated.
    * Supported operator: =, AND  The fields eligible for filtering are:  *
    * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  *
    * companyName = "companies/123" * companyName = "companies/123" AND
    * requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional.  If set to `true`, only Job.name, Job.requisition_id and
    * Job.language_code will be returned.  A typical use case is to synchronize
    * job repositories.  Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If ids_only is set to true, the maximum allowed page size is 1000.
    * Otherwise, the maximum allowed page size is 100.  Default is 100 if empty
    * or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
}

