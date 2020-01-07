package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a channel bulletin post.
  */
@js.native
trait Schema$ActivityContentDetailsBulletin extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * associated with a bulletin post.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsBulletin {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$ActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsBulletin]
  }
}

