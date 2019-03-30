package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilterCriteria extends js.Object {
  var visibleValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PivotFilterCriteria {
  @scala.inline
  def apply(visibleValues: js.Array[java.lang.String] = null): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (visibleValues != null) __obj.updateDynamic("visibleValues")(visibleValues)
    __obj.asInstanceOf[PivotFilterCriteria]
  }
}

