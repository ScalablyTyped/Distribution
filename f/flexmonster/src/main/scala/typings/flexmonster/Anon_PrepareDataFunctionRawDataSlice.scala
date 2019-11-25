package typings.flexmonster

import typings.flexmonster.flexmonsterMod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunctionRawDataSlice extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var valuesOnly: js.UndefOr[Boolean] = js.undefined
  var withDrilldown: js.UndefOr[Boolean] = js.undefined
  var xAxisType: js.UndefOr[String] = js.undefined
}

object Anon_PrepareDataFunctionRawDataSlice {
  @scala.inline
  def apply(
    prepareDataFunction: /* rawData */ js.Any => _ = null,
    slice: Slice = null,
    `type`: String = null,
    valuesOnly: js.UndefOr[Boolean] = js.undefined,
    withDrilldown: js.UndefOr[Boolean] = js.undefined,
    xAxisType: String = null
  ): Anon_PrepareDataFunctionRawDataSlice = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1(prepareDataFunction))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valuesOnly)) __obj.updateDynamic("valuesOnly")(valuesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(withDrilldown)) __obj.updateDynamic("withDrilldown")(withDrilldown.asInstanceOf[js.Any])
    if (xAxisType != null) __obj.updateDynamic("xAxisType")(xAxisType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrepareDataFunctionRawDataSlice]
  }
}

