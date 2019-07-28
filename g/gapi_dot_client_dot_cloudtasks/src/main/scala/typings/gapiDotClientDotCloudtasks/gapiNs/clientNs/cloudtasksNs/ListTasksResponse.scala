package typings.gapiDotClientDotCloudtasks.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    *
    * To return the next page of results, call
    * CloudTasks.ListTasks with this value as the
    * ListTasksRequest.page_token.
    *
    * If the next_page_token is empty, there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of tasks. */
  var tasks: js.UndefOr[js.Array[Task]] = js.undefined
}

object ListTasksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tasks: js.Array[Task] = null): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[ListTasksResponse]
  }
}

