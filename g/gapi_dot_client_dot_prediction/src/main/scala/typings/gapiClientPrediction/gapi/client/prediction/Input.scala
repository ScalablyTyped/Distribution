package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.AnonCsvInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  /** Input to the model for a prediction. */
  var input: js.UndefOr[AnonCsvInstance] = js.undefined
}

object Input {
  @scala.inline
  def apply(input: AnonCsvInstance = null): Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

