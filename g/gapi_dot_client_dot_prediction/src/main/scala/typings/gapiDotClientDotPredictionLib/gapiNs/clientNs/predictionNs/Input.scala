package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /** Input to the model for a prediction. */
  var input: js.UndefOr[gapiDotClientDotPredictionLib.Anon_CsvInstance] = js.undefined
}

object Input {
  @scala.inline
  def apply(input: gapiDotClientDotPredictionLib.Anon_CsvInstance = null): Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[Input]
  }
}

