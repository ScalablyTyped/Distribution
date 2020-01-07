package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ProcessingState extends js.Object {
  var processingState: js.UndefOr[String] = js.native
}

object Anon_ProcessingState {
  @scala.inline
  def apply(processingState: String = null): Anon_ProcessingState = {
    val __obj = js.Dynamic.literal()
    if (processingState != null) __obj.updateDynamic("processingState")(processingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProcessingState]
  }
}

