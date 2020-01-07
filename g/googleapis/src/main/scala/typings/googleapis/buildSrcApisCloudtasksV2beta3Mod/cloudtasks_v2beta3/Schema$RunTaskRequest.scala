package typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for forcing a task to run now using RunTask.
  */
@js.native
trait Schema$RunTaskRequest extends js.Object {
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

object Schema$RunTaskRequest {
  @scala.inline
  def apply(responseView: String = null): Schema$RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunTaskRequest]
  }
}

