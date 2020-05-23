package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Numeric extends js.Object {
  /** Description of the output values in the data set. */
  var numeric: js.UndefOr[Mean] = js.undefined
  /** Description of the output labels in the data set. */
  var text: js.UndefOr[js.Array[Count]] = js.undefined
}

object Numeric {
  @scala.inline
  def apply(numeric: Mean = null, text: js.Array[Count] = null): Numeric = {
    val __obj = js.Dynamic.literal()
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numeric]
  }
}

