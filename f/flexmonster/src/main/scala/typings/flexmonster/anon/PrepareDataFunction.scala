package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareDataFunction extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.undefined
  var `type`: String
}

object PrepareDataFunction {
  @scala.inline
  def apply(
    `type`: String,
    prepareDataFunction: /* rawData */ js.Any => _ = null,
    slice: typings.flexmonster.mod.Slice = null
  ): PrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareDataFunction]
  }
}

