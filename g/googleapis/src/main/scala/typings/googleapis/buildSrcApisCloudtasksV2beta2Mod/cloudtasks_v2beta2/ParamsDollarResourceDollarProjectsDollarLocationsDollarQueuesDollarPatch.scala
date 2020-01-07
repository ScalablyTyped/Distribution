package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Caller-specified and required in CreateQueue, after which it becomes
    * output only.  The queue name.  The queue name must have the following
    * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  *
    * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the queue's location.    The list
    * of available locations can be obtained by calling    ListLocations. For
    * more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Queue] = js.native
  /**
    * A mask used to specify which fields of the queue are being updated.  If
    * empty, then all fields will be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

