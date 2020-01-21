package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentOwnerDetails extends js.Object {
  /** The ID of the content owner linked to the channel. */
  var contentOwner: js.UndefOr[String] = js.undefined
  /** The date and time of when the channel was linked to the content owner. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var timeLinked: js.UndefOr[String] = js.undefined
}

object ChannelContentOwnerDetails {
  @scala.inline
  def apply(contentOwner: String = null, timeLinked: String = null): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    if (contentOwner != null) __obj.updateDynamic("contentOwner")(contentOwner.asInstanceOf[js.Any])
    if (timeLinked != null) __obj.updateDynamic("timeLinked")(timeLinked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
}

