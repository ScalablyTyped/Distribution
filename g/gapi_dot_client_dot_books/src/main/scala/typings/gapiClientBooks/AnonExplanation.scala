package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExplanation extends js.Object {
  /** A text explaining why this volume is recommended. */
  var explanation: js.UndefOr[String] = js.undefined
}

object AnonExplanation {
  @scala.inline
  def apply(explanation: String = null): AnonExplanation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExplanation]
  }
}

