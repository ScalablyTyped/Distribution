package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsRecommendation extends js.Object {
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var seedResourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsRecommendation {
  @scala.inline
  def apply(reason: java.lang.String = null, resourceId: ResourceId = null, seedResourceId: ResourceId = null): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (seedResourceId != null) __obj.updateDynamic("seedResourceId")(seedResourceId)
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
}

