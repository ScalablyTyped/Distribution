package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var queues: js.Array[Queue]
}

object ListQueuesResponse {
  @scala.inline
  def apply(queues: js.Array[Queue], nextPageToken: java.lang.String = null): ListQueuesResponse = {
    val __obj = js.Dynamic.literal(queues = queues)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListQueuesResponse]
  }
}

