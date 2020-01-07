package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a resource which was added to a channel.
  */
@js.native
trait Schema$ActivityContentDetailsChannelItem extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that was added to the channel.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$ActivityContentDetailsChannelItem {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$ActivityContentDetailsChannelItem = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsChannelItem]
  }
}

