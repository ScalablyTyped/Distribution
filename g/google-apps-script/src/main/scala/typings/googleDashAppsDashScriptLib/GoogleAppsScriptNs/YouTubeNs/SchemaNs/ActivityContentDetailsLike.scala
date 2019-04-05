package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsLike extends js.Object {
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsLike {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsLike]
  }
}

