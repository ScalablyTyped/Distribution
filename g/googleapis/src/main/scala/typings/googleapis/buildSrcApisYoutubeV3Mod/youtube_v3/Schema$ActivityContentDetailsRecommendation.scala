package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information that identifies the recommended resource.
  */
@js.native
trait Schema$ActivityContentDetailsRecommendation extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The resourceId object contains information that identifies the
    * recommended resource.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
  /**
    * The seedResourceId object contains information about the resource that
    * caused the recommendation.
    */
  var seedResourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsRecommendation {
  @scala.inline
  def apply(
    reason: String = null,
    resourceId: Schema$ResourceId = null,
    seedResourceId: Schema$ResourceId = null
  ): Schema$ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (seedResourceId != null) __obj.updateDynamic("seedResourceId")(seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsRecommendation]
  }
}

