package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTaskRequest extends js.Object {
  /**
    * The response_view specifies which subset of the Task will be
    * returned.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because
    * of its large size or because of the sensitivity of data that it
    * contains.
    *
    * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
    * [Google IAM](/iam/) permission on the
    * Task.name resource.
    */
  var responseView: js.UndefOr[String] = js.undefined
}

object RunTaskRequest {
  @scala.inline
  def apply(responseView: String = null): RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (responseView != null) __obj.updateDynamic("responseView")(responseView)
    __obj.asInstanceOf[RunTaskRequest]
  }
}

