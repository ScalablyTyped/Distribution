package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePositionedObjectRequest extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object DeletePositionedObjectRequest {
  @scala.inline
  def apply(objectId: java.lang.String = null): DeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[DeletePositionedObjectRequest]
  }
}

