package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilterValueRange extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  var majorDimension: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object DataFilterValueRange {
  @scala.inline
  def apply(
    dataFilter: DataFilter = null,
    majorDimension: java.lang.String = null,
    values: js.Array[js.Array[_]] = null
  ): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataFilterValueRange]
  }
}

