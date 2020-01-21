package typings.from2

import typings.from2.from2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectMode extends js.Object {
  var objectMode: js.UndefOr[`true`] = js.undefined
}

object AnonObjectMode {
  @scala.inline
  def apply(objectMode: `true` = null): AnonObjectMode = {
    val __obj = js.Dynamic.literal()
    if (objectMode != null) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectMode]
  }
}

