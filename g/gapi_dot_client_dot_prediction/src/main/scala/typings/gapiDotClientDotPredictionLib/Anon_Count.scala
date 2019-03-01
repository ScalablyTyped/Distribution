package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  /** Number of times the output label occurred in the data set. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** The output label. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: java.lang.String = null, value: java.lang.String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Count]
  }
}

