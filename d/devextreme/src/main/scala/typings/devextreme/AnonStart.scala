package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AnonStart {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): AnonStart = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

