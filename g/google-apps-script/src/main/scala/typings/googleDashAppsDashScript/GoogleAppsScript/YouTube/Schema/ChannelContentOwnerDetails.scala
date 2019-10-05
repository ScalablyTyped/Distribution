package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentOwnerDetails extends js.Object {
  var contentOwner: js.UndefOr[String] = js.undefined
  var timeLinked: js.UndefOr[String] = js.undefined
}

object ChannelContentOwnerDetails {
  @scala.inline
  def apply(contentOwner: String = null, timeLinked: String = null): ChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    if (contentOwner != null) __obj.updateDynamic("contentOwner")(contentOwner)
    if (timeLinked != null) __obj.updateDynamic("timeLinked")(timeLinked)
    __obj.asInstanceOf[ChannelContentOwnerDetails]
  }
}

