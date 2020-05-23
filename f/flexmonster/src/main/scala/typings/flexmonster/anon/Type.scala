package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    prepareDataFunction: /* rawData */ js.Any => _ = null,
    slice: typings.flexmonster.mod.Slice = null,
    `type`: String = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

