package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListTopics` method.
  */
@js.native
trait Schema$ListTopicsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more topics that match the
    * request; this value should be passed in a new `ListTopicsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting topics.
    */
  var topics: js.UndefOr[js.Array[Schema$Topic]] = js.native
}

object Schema$ListTopicsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topics: js.Array[Schema$Topic] = null): Schema$ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTopicsResponse]
  }
}

