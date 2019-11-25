package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicsResponse. */
trait IListTopicsResponse extends js.Object {
  /** ListTopicsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicsResponse topics */
  var topics: js.UndefOr[js.Array[ITopic] | Null] = js.undefined
}

object IListTopicsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, topics: js.Array[ITopic] = null): IListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicsResponse]
  }
}

