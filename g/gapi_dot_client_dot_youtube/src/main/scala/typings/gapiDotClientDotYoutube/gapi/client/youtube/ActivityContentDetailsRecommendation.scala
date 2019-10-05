package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsRecommendation extends js.Object {
  /** The reason that the resource is recommended to the user. */
  var reason: js.UndefOr[String] = js.undefined
  /** The resourceId object contains information that identifies the recommended resource. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /** The seedResourceId object contains information about the resource that caused the recommendation. */
  var seedResourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsRecommendation {
  @scala.inline
  def apply(reason: String = null, resourceId: ResourceId = null, seedResourceId: ResourceId = null): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (seedResourceId != null) __obj.updateDynamic("seedResourceId")(seedResourceId)
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
}

