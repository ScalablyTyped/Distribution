package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var queues: js.Array[Queue]
}

object ListQueuesResponse {
  @scala.inline
  def apply(queues: js.Array[Queue], nextPageToken: String = null): ListQueuesResponse = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResponse]
  }
}

