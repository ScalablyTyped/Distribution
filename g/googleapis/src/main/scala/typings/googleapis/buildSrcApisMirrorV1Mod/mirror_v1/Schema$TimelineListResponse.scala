package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of timeline items. This is the response from the server to GET
  * requests on the timeline collection.
  */
@js.native
trait Schema$TimelineListResponse extends js.Object {
  /**
    * Items in the timeline.
    */
  var items: js.UndefOr[js.Array[Schema$TimelineItem]] = js.native
  /**
    * The type of resource. This is always mirror#timeline.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The next page token. Provide this as the pageToken parameter in the
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$TimelineListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$TimelineItem] = null, kind: String = null, nextPageToken: String = null): Schema$TimelineListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimelineListResponse]
  }
}

