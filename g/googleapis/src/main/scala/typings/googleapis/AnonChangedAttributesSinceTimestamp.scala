package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangedAttributesSinceTimestamp extends js.Object {
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.native
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
}

object AnonChangedAttributesSinceTimestamp {
  @scala.inline
  def apply(
    changedAttributesSinceTimestamp: String = null,
    changedMetricsSinceTimestamp: String = null,
    endDate: String = null,
    startDate: String = null
  ): AnonChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    if (changedAttributesSinceTimestamp != null) __obj.updateDynamic("changedAttributesSinceTimestamp")(changedAttributesSinceTimestamp.asInstanceOf[js.Any])
    if (changedMetricsSinceTimestamp != null) __obj.updateDynamic("changedMetricsSinceTimestamp")(changedMetricsSinceTimestamp.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedAttributesSinceTimestamp]
  }
}

