package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumeric extends js.Object {
  /** Description of the output values in the data set. */
  var numeric: js.UndefOr[AnonCountMean] = js.undefined
  /** Description of the output labels in the data set. */
  var text: js.UndefOr[js.Array[AnonCount]] = js.undefined
}

object AnonNumeric {
  @scala.inline
  def apply(numeric: AnonCountMean = null, text: js.Array[AnonCount] = null): AnonNumeric = {
    val __obj = js.Dynamic.literal()
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumeric]
  }
}

