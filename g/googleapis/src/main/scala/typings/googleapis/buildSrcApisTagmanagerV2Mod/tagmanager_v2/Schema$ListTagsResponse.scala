package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Tags Response.
  */
@js.native
trait Schema$ListTagsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Tags of a GTM Container.
    */
  var tag: js.UndefOr[js.Array[Schema$Tag]] = js.native
}

object Schema$ListTagsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tag: js.Array[Schema$Tag] = null): Schema$ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTagsResponse]
  }
}

