package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLeakPreventionChange extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataLeakPreventionChange {
  @scala.inline
  def apply(`type`: java.lang.String = null): DataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataLeakPreventionChange]
  }
}

