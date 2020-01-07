package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Tags Response.
  */
@js.native
trait Schema$ListTagsResponse extends js.Object {
  /**
    * All GTM Tags of a GTM Container.
    */
  var tags: js.UndefOr[js.Array[Schema$Tag]] = js.native
}

object Schema$ListTagsResponse {
  @scala.inline
  def apply(tags: js.Array[Schema$Tag] = null): Schema$ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTagsResponse]
  }
}

