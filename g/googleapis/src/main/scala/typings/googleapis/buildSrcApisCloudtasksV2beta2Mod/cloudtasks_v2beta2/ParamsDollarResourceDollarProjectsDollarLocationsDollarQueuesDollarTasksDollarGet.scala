package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The task name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
}

