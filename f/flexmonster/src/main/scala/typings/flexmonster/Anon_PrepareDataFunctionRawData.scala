package typings.flexmonster

import typings.flexmonster.flexmonsterMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunctionRawData extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_PrepareDataFunctionRawData {
  @scala.inline
  def apply(prepareDataFunction: /* rawData */ js.Any => _ = null, slice: Slice = null, `type`: String = null): Anon_PrepareDataFunctionRawData = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrepareDataFunctionRawData]
  }
}

