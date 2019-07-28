package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepLabelsEntry extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object StepLabelsEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): StepLabelsEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StepLabelsEntry]
  }
}

