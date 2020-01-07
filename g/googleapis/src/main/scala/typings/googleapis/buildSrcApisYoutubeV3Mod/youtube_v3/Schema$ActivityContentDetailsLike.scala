package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource that received a positive (like) rating.
  */
@js.native
trait Schema$ActivityContentDetailsLike extends js.Object {
  /**
    * The resourceId object contains information that identifies the rated
    * resource.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsLike {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$ActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsLike]
  }
}

