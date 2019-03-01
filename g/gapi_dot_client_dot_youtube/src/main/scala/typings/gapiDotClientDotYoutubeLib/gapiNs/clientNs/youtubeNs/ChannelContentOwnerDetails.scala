package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentOwnerDetails extends js.Object {
  /** The ID of the content owner linked to the channel. */
  var contentOwner: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time of when the channel was linked to the content owner. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var timeLinked: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelContentOwnerDetails {
  @scala.inline
  def apply(contentOwner: java.lang.String = null, timeLinked: java.lang.String = null): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    if (contentOwner != null) __obj.updateDynamic("contentOwner")(contentOwner)
    if (timeLinked != null) __obj.updateDynamic("timeLinked")(timeLinked)
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
}

