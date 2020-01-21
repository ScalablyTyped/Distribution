package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProcessingState extends js.Object {
  var processingState: js.UndefOr[String] = js.undefined
}

object AnonProcessingState {
  @scala.inline
  def apply(processingState: String = null): AnonProcessingState = {
    val __obj = js.Dynamic.literal()
    if (processingState != null) __obj.updateDynamic("processingState")(processingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcessingState]
  }
}

