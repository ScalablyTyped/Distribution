package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListQueues.
  */
@js.native
trait Schema$ListQueuesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.  To return the next page of
    * results, call ListQueues with this value as the page_token.  If the
    * next_page_token is empty, there are no more results.  The page token is
    * valid for only 2 hours.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of queues.
    */
  var queues: js.UndefOr[js.Array[Schema$Queue]] = js.native
}

object Schema$ListQueuesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, queues: js.Array[Schema$Queue] = null): Schema$ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListQueuesResponse]
  }
}

