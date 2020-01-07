package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contentOwnerDetails object encapsulates channel data that is relevant
  * for YouTube Partners linked with the channel.
  */
@js.native
trait Schema$ChannelContentOwnerDetails extends js.Object {
  /**
    * The ID of the content owner linked to the channel.
    */
  var contentOwner: js.UndefOr[String] = js.native
  /**
    * The date and time of when the channel was linked to the content owner.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var timeLinked: js.UndefOr[String] = js.native
}

object Schema$ChannelContentOwnerDetails {
  @scala.inline
  def apply(contentOwner: String = null, timeLinked: String = null): Schema$ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    if (contentOwner != null) __obj.updateDynamic("contentOwner")(contentOwner.asInstanceOf[js.Any])
    if (timeLinked != null) __obj.updateDynamic("timeLinked")(timeLinked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelContentOwnerDetails]
  }
}

