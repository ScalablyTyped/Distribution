package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrepareDataFunctionRawDataSlice extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var valuesOnly: js.UndefOr[scala.Boolean] = js.undefined
  var withDrilldown: js.UndefOr[scala.Boolean] = js.undefined
  var xAxisType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrepareDataFunctionRawDataSlice {
  @scala.inline
  def apply(
    prepareDataFunction: js.Function1[/* rawData */ js.Any, _] = null,
    slice: flexmonsterLib.flexmonsterMod.FlexmonsterNs.Slice = null,
    `type`: java.lang.String = null,
    valuesOnly: js.UndefOr[scala.Boolean] = js.undefined,
    withDrilldown: js.UndefOr[scala.Boolean] = js.undefined,
    xAxisType: java.lang.String = null
  ): Anon_PrepareDataFunctionRawDataSlice = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(prepareDataFunction)
    if (slice != null) __obj.updateDynamic("slice")(slice)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(valuesOnly)) __obj.updateDynamic("valuesOnly")(valuesOnly)
    if (!js.isUndefined(withDrilldown)) __obj.updateDynamic("withDrilldown")(withDrilldown)
    if (xAxisType != null) __obj.updateDynamic("xAxisType")(xAxisType)
    __obj.asInstanceOf[Anon_PrepareDataFunctionRawDataSlice]
  }
}

