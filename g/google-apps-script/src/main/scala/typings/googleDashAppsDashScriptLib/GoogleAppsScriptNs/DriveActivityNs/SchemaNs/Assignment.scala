package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignment extends js.Object {
  var subtype: js.UndefOr[java.lang.String] = js.undefined
}

object Assignment {
  @scala.inline
  def apply(subtype: java.lang.String = null): Assignment = {
    val __obj = js.Dynamic.literal()
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[Assignment]
  }
}

