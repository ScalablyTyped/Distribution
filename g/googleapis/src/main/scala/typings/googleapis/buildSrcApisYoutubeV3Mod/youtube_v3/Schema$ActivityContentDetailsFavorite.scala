package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a video that was marked as a favorite video.
  */
@js.native
trait Schema$ActivityContentDetailsFavorite extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that was marked as a favorite.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsFavorite {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$ActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsFavorite]
  }
}

