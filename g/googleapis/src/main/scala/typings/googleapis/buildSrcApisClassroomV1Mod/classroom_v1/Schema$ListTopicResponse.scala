package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing topics.
  */
@js.native
trait Schema$ListTopicResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Topic items that match the request.
    */
  var topic: js.UndefOr[js.Array[Schema$Topic]] = js.native
}

object Schema$ListTopicResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topic: js.Array[Schema$Topic] = null): Schema$ListTopicResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTopicResponse]
  }
}

