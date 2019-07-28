package typings.flexmonster

import typings.flexmonster.flexmonsterMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Slice extends js.Object {
  var slice: js.UndefOr[Slice] = js.undefined
}

object Anon_Slice {
  @scala.inline
  def apply(slice: Slice = null): Anon_Slice = {
    val __obj = js.Dynamic.literal()
    if (slice != null) __obj.updateDynamic("slice")(slice)
    __obj.asInstanceOf[Anon_Slice]
  }
}

