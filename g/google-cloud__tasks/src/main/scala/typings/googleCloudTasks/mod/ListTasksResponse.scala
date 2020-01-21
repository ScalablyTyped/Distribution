package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var tasks: js.Array[Task]
}

object ListTasksResponse {
  @scala.inline
  def apply(tasks: js.Array[Task], nextPageToken: String = null): ListTasksResponse = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
}

