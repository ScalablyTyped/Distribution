package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var originalObject: js.UndefOr[TargetReference] = js.undefined
}

object Copy {
  @scala.inline
  def apply(originalObject: TargetReference = null): Copy = {
    val __obj = js.Dynamic.literal()
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject)
    __obj.asInstanceOf[Copy]
  }
}

