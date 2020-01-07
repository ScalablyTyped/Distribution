package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListTopics method.
  */
@js.native
trait Schema$ListTopicsResponse extends js.Object {
  /**
    * If not empty, indicates that there are more topics that match the
    * request, and this value should be passed to the next
    * &lt;code&gt;ListTopicsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting topics.
    */
  var topic: js.UndefOr[js.Array[Schema$Topic]] = js.native
}

object Schema$ListTopicsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topic: js.Array[Schema$Topic] = null): Schema$ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTopicsResponse]
  }
}

