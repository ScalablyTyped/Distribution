package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsFavorite extends js.Object {
  /** The resourceId object contains information that identifies the resource that was marked as a favorite. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsFavorite {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsFavorite]
  }
}

