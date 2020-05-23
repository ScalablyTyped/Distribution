package typings.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedAttributesSinceTimestamp extends js.Object {
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed attribute reports work. */
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.undefined
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed metrics reports work. */
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.undefined
  /** Inclusive date in YYYY-MM-DD format. */
  var endDate: js.UndefOr[String] = js.undefined
  /** Inclusive date in YYYY-MM-DD format. */
  var startDate: js.UndefOr[String] = js.undefined
}

object ChangedAttributesSinceTimestamp {
  @scala.inline
  def apply(
    changedAttributesSinceTimestamp: String = null,
    changedMetricsSinceTimestamp: String = null,
    endDate: String = null,
    startDate: String = null
  ): ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    if (changedAttributesSinceTimestamp != null) __obj.updateDynamic("changedAttributesSinceTimestamp")(changedAttributesSinceTimestamp.asInstanceOf[js.Any])
    if (changedMetricsSinceTimestamp != null) __obj.updateDynamic("changedMetricsSinceTimestamp")(changedMetricsSinceTimestamp.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedAttributesSinceTimestamp]
  }
}

