package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Topic items that match the request. */
  var topic: js.UndefOr[js.Array[Topic]] = js.undefined
}

object ListTopicResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topic: js.Array[Topic] = null): ListTopicResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicResponse]
  }
}

