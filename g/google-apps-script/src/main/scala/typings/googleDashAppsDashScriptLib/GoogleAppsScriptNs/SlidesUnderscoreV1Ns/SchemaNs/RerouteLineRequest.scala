package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RerouteLineRequest extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object RerouteLineRequest {
  @scala.inline
  def apply(objectId: java.lang.String = null): RerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[RerouteLineRequest]
  }
}

