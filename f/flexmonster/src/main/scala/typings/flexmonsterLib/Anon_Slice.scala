package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Slice extends js.Object {
  var slice: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice] = js.undefined
}

object Anon_Slice {
  @scala.inline
  def apply(slice: flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice = null): Anon_Slice = {
    val __obj = js.Dynamic.literal()
    if (slice != null) __obj.updateDynamic("slice")(slice)
    __obj.asInstanceOf[Anon_Slice]
  }
}

