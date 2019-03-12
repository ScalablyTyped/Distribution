package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunctionRawData extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrepareDataFunctionRawData {
  @scala.inline
  def apply(
    prepareDataFunction: /* rawData */ js.Any => _ = null,
    slice: flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice = null,
    `type`: java.lang.String = null
  ): Anon_PrepareDataFunctionRawData = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_PrepareDataFunctionRawData]
  }
}

