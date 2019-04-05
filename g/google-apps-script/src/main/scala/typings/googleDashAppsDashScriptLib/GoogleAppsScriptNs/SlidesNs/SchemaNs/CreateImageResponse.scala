package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageResponse extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateImageResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateImageResponse]
  }
}

