package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlideResponse extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateSlideResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): CreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateSlideResponse]
  }
}

