package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsComment extends js.Object {
  /** The resourceId object contains information that identifies the resource associated with the comment. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsComment {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsComment = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsComment]
  }
}

