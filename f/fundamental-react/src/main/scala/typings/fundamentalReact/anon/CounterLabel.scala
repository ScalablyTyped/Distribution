package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterLabel extends js.Object {
  var counterLabel: js.UndefOr[String] = js.undefined
}

object CounterLabel {
  @scala.inline
  def apply(counterLabel: String = null): CounterLabel = {
    val __obj = js.Dynamic.literal()
    if (counterLabel != null) __obj.updateDynamic("counterLabel")(counterLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterLabel]
  }
}

