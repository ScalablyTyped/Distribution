package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRichMediaEvents extends js.Object {
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CustomRichMediaEvents {
  @scala.inline
  def apply(filteredEventIds: js.Array[DimensionValue] = null, kind: java.lang.String = null): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (filteredEventIds != null) __obj.updateDynamic("filteredEventIds")(filteredEventIds)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
}

