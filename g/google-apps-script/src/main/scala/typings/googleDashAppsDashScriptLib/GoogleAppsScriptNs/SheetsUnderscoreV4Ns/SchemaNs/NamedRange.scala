package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
}

object NamedRange {
  @scala.inline
  def apply(name: java.lang.String = null, namedRangeId: java.lang.String = null, range: GridRange = null): NamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[NamedRange]
  }
}

