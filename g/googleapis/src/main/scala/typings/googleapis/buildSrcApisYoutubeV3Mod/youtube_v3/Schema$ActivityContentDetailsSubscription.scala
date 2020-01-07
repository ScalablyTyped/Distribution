package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a channel that a user subscribed to.
  */
@js.native
trait Schema$ActivityContentDetailsSubscription extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that the user subscribed to.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsSubscription {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$ActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsSubscription]
  }
}

