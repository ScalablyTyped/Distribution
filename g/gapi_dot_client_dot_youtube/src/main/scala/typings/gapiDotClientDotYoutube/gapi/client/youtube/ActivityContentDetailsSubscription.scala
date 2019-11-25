package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsSubscription extends js.Object {
  /** The resourceId object contains information that identifies the resource that the user subscribed to. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsSubscription {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsSubscription]
  }
}

