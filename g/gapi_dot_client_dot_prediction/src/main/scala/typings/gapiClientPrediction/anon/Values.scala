package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values extends js.Object {
  /** Number of categorical values for this feature in the data. */
  var count: js.UndefOr[String] = js.undefined
  /** List of all the categories for this feature in the data set. */
  var values: js.UndefOr[js.Array[Count]] = js.undefined
}

object Values {
  @scala.inline
  def apply(count: String = null, values: js.Array[Count] = null): Values = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
}

