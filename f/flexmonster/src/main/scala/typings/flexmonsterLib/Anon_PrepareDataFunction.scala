package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunction extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice] = js.undefined
  var `type`: java.lang.String
}

object Anon_PrepareDataFunction {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    prepareDataFunction: js.Function1[/* rawData */ js.Any, _] = null,
    slice: flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice = null
  ): Anon_PrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(prepareDataFunction)
    if (slice != null) __obj.updateDynamic("slice")(slice)
    __obj.asInstanceOf[Anon_PrepareDataFunction]
  }
}

