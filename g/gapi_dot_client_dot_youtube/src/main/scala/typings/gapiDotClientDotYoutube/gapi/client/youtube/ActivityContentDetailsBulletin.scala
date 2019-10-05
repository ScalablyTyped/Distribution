package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsBulletin extends js.Object {
  /** The resourceId object contains information that identifies the resource associated with a bulletin post. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsBulletin {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsBulletin]
  }
}

