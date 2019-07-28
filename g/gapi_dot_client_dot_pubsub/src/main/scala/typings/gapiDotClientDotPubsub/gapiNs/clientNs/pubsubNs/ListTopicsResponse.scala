package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more topics that match the
    * request; this value should be passed in a new `ListTopicsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The resulting topics. */
  var topics: js.UndefOr[js.Array[Topic]] = js.undefined
}

object ListTopicsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topics: js.Array[Topic] = null): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[ListTopicsResponse]
  }
}

