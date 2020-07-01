package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingState extends js.Object {
  var processingState: js.UndefOr[String] = js.native
}

object ProcessingState {
  @scala.inline
  def apply(processingState: String = null): ProcessingState = {
    val __obj = js.Dynamic.literal()
    if (processingState != null) __obj.updateDynamic("processingState")(processingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingState]
  }
}

