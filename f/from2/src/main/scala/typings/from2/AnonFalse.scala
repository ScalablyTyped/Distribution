package typings.from2

import typings.from2.from2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var objectMode: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(objectMode: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (objectMode != null) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

