package typings.gapiDotClientDotPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  /** Number of times the output label occurred in the data set. */
  var count: js.UndefOr[String] = js.undefined
  /** The output label. */
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: String = null, value: String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

