package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

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
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    topics: js.UndefOr[Null | js.Array[ITopic]] = js.undefined
  ): IListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(topics)) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicsResponse]
  }
}

