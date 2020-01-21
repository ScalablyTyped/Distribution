package typings.flexmonster

import typings.flexmonster.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSlice extends js.Object {
  var slice: js.UndefOr[Slice] = js.undefined
}

object AnonSlice {
  @scala.inline
  def apply(slice: Slice = null): AnonSlice = {
    val __obj = js.Dynamic.literal()
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSlice]
  }
}

