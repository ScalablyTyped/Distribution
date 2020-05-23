package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.CsvInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /** Input to the model for a prediction. */
  var input: js.UndefOr[CsvInstance] = js.undefined
}

object Input {
  @scala.inline
  def apply(input: CsvInstance = null): Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

