package typings.flexmonster

import typings.flexmonster.flexmonsterMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunction extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var `type`: String
}

object Anon_PrepareDataFunction {
  @scala.inline
  def apply(`type`: String, prepareDataFunction: /* rawData */ js.Any => _ = null, slice: Slice = null): Anon_PrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice)
    __obj.asInstanceOf[Anon_PrepareDataFunction]
  }
}

