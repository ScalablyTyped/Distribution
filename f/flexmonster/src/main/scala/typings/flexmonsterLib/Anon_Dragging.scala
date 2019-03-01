package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dragging extends js.Object {
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  var drillThroughMaxRows: js.UndefOr[scala.Double] = js.undefined
  var grandTotalsPosition: js.UndefOr[java.lang.String] = js.undefined
  var showAutoCalculationBar: js.UndefOr[scala.Boolean] = js.undefined
  var showFilter: js.UndefOr[scala.Boolean] = js.undefined
  var showGrandTotals: js.UndefOr[java.lang.String] = js.undefined
  var showHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var showHierarchies: js.UndefOr[scala.Boolean] = js.undefined
  var showHierarchyCaptions: js.UndefOr[scala.Boolean] = js.undefined
  var showReportFiltersArea: js.UndefOr[scala.Boolean] = js.undefined
  var showTotals: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dragging {
  @scala.inline
  def apply(
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    drillThroughMaxRows: scala.Int | scala.Double = null,
    grandTotalsPosition: java.lang.String = null,
    showAutoCalculationBar: js.UndefOr[scala.Boolean] = js.undefined,
    showFilter: js.UndefOr[scala.Boolean] = js.undefined,
    showGrandTotals: java.lang.String = null,
    showHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    showHierarchies: js.UndefOr[scala.Boolean] = js.undefined,
    showHierarchyCaptions: js.UndefOr[scala.Boolean] = js.undefined,
    showReportFiltersArea: js.UndefOr[scala.Boolean] = js.undefined,
    showTotals: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Dragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (drillThroughMaxRows != null) __obj.updateDynamic("drillThroughMaxRows")(drillThroughMaxRows.asInstanceOf[js.Any])
    if (grandTotalsPosition != null) __obj.updateDynamic("grandTotalsPosition")(grandTotalsPosition)
    if (!js.isUndefined(showAutoCalculationBar)) __obj.updateDynamic("showAutoCalculationBar")(showAutoCalculationBar)
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter)
    if (showGrandTotals != null) __obj.updateDynamic("showGrandTotals")(showGrandTotals)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (!js.isUndefined(showHierarchies)) __obj.updateDynamic("showHierarchies")(showHierarchies)
    if (!js.isUndefined(showHierarchyCaptions)) __obj.updateDynamic("showHierarchyCaptions")(showHierarchyCaptions)
    if (!js.isUndefined(showReportFiltersArea)) __obj.updateDynamic("showReportFiltersArea")(showReportFiltersArea)
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Dragging]
  }
}

