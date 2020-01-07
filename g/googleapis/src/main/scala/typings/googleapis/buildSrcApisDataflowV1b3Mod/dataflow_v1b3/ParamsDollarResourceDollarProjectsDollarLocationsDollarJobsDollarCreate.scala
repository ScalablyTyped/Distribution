package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field is now in the Job message.
    */
  var replaceJobId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Job] = js.native
  /**
    * The level of information requested in response.
    */
  var view: js.UndefOr[String] = js.native
}

