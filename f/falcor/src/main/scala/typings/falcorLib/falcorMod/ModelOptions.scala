package typings
package falcorLib.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModelOptions extends js.Object {
  var cache: js.UndefOr[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraph
  ] = js.undefined
  var collectRatio: js.UndefOr[scala.Double] = js.undefined
  var comparator: js.UndefOr[ModelComparator] = js.undefined
  var errorSelector: js.UndefOr[ModelErrorSelector] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[ModelOnChange] = js.undefined
  var source: js.UndefOr[DataSource] = js.undefined
}

