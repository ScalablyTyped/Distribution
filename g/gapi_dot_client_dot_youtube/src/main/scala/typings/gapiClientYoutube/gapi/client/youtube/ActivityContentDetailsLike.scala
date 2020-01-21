package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsLike extends js.Object {
  /** The resourceId object contains information that identifies the rated resource. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsLike {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsLike]
  }
}

