package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /** Number of times the output label occurred in the data set. */
  var count: js.UndefOr[String] = js.undefined
  /** The output label. */
  var value: js.UndefOr[String] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: String = null, value: String = null): Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

