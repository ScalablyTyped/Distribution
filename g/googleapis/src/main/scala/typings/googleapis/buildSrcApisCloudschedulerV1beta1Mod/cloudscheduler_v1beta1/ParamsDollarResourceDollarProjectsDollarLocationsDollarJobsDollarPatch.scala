package typings.googleapis.buildSrcApisCloudschedulerV1beta1Mod.cloudscheduler_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optionally caller-specified in CreateJob, after which it becomes output
    * only.  The job name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.  * `PROJECT_ID`
    * can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons
    * (:), or periods (.).    For more information, see    [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the job's location.    The list
    * of available locations can be obtained by calling    ListLocations. For
    * more information, see https://cloud.google.com/about/locations/. *
    * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), or underscores (_). The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Job] = js.native
  /**
    * A  mask used to specify which fields of the job are being updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

