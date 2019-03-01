package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  /** The ID of the chart. */
  var chartId: js.UndefOr[scala.Double] = js.undefined
  /** The position of the chart. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  /** The specification of the chart. */
  var spec: js.UndefOr[ChartSpec] = js.undefined
}

object EmbeddedChart {
  @scala.inline
  def apply(
    chartId: scala.Int | scala.Double = null,
    position: EmbeddedObjectPosition = null,
    spec: ChartSpec = null
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[EmbeddedChart]
  }
}

