package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePartitioning extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[RangePartitioningRange] = js.undefined
}

object RangePartitioning {
  @scala.inline
  def apply(field: java.lang.String = null, range: RangePartitioningRange = null): RangePartitioning = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[RangePartitioning]
  }
}

