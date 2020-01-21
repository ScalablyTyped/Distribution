package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountValues extends js.Object {
  /** Number of categorical values for this feature in the data. */
  var count: js.UndefOr[String] = js.undefined
  /** List of all the categories for this feature in the data set. */
  var values: js.UndefOr[js.Array[AnonCount]] = js.undefined
}

object AnonCountValues {
  @scala.inline
  def apply(count: String = null, values: js.Array[AnonCount] = null): AnonCountValues = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountValues]
  }
}

