package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentOwnerDetails extends js.Object {
  var contentOwner: js.UndefOr[java.lang.String] = js.undefined
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

