package typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing tasks using ListTasks.
  */
@js.native
trait Schema$ListTasksResponse extends js.Object {
  /**
    * A token to retrieve next page of results.  To return the next page of
    * results, call ListTasks with this value as the page_token.  If the
    * next_page_token is empty, there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of tasks.
    */
  var tasks: js.UndefOr[js.Array[Schema$Task]] = js.native
}

object Schema$ListTasksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tasks: js.Array[Schema$Task] = null): Schema$ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTasksResponse]
  }
}

