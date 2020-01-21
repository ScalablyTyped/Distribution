package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplanation extends js.Object {
  var explanation: js.UndefOr[String] = js.native
}

object AnonExplanation {
  @scala.inline
  def apply(explanation: String = null): AnonExplanation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExplanation]
  }
}

