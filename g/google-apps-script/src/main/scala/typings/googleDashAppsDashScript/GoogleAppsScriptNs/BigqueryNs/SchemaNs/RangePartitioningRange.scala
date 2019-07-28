package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePartitioningRange extends js.Object {
  var end: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object RangePartitioningRange {
  @scala.inline
  def apply(end: String = null, interval: String = null, start: String = null): RangePartitioningRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[RangePartitioningRange]
  }
}

