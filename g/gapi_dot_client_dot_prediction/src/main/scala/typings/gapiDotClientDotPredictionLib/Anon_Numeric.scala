package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Numeric extends js.Object {
  /** Description of the output values in the data set. */
  var numeric: js.UndefOr[Anon_CountMean] = js.undefined
  /** Description of the output labels in the data set. */
  var text: js.UndefOr[js.Array[Anon_Count]] = js.undefined
}

object Anon_Numeric {
  @scala.inline
  def apply(numeric: Anon_CountMean = null, text: js.Array[Anon_Count] = null): Anon_Numeric = {
    val __obj = js.Dynamic.literal()
    if (numeric != null) __obj.updateDynamic("numeric")(numeric)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Numeric]
  }
}

