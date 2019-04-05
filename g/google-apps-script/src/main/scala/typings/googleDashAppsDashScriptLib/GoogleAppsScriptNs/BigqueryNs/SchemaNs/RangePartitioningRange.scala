package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePartitioningRange extends js.Object {
  var end: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object RangePartitioningRange {
  @scala.inline
  def apply(end: java.lang.String = null, interval: java.lang.String = null, start: java.lang.String = null): RangePartitioningRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[RangePartitioningRange]
  }
}

