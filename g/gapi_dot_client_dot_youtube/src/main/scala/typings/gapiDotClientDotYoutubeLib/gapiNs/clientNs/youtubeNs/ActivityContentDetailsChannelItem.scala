package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsChannelItem extends js.Object {
  /** The resourceId object contains information that identifies the resource that was added to the channel. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsChannelItem {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsChannelItem = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsChannelItem]
  }
}

