package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slice extends js.Object {
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.undefined
}

object Slice {
  @scala.inline
  def apply(slice: typings.flexmonster.mod.Slice = null): Slice = {
    val __obj = js.Dynamic.literal()
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
}

