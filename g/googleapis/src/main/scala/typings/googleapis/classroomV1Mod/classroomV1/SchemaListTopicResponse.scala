package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing topics.
  */
@js.native
trait SchemaListTopicResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Topic items that match the request.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.native
}

object SchemaListTopicResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topic: js.Array[SchemaTopic] = null): SchemaListTopicResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTopicResponse]
  }
}

