package typings
package gapiDotClientDotDoubleclicksearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedAttributesSinceTimestamp extends js.Object {
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed attribute reports work. */
  var changedAttributesSinceTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed metrics reports work. */
  var changedMetricsSinceTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** Inclusive date in YYYY-MM-DD format. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Inclusive date in YYYY-MM-DD format. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChangedAttributesSinceTimestamp {
  @scala.inline
  def apply(
    changedAttributesSinceTimestamp: java.lang.String = null,
    changedMetricsSinceTimestamp: java.lang.String = null,
    endDate: java.lang.String = null,
    startDate: java.lang.String = null
  ): Anon_ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    if (changedAttributesSinceTimestamp != null) __obj.updateDynamic("changedAttributesSinceTimestamp")(changedAttributesSinceTimestamp)
    if (changedMetricsSinceTimestamp != null) __obj.updateDynamic("changedMetricsSinceTimestamp")(changedMetricsSinceTimestamp)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_ChangedAttributesSinceTimestamp]
  }
}

