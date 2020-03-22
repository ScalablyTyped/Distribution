package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounterLabel extends js.Object {
  var counterLabel: js.UndefOr[String] = js.undefined
}

object AnonCounterLabel {
  @scala.inline
  def apply(counterLabel: String = null): AnonCounterLabel = {
    val __obj = js.Dynamic.literal()
    if (counterLabel != null) __obj.updateDynamic("counterLabel")(counterLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounterLabel]
  }
}

