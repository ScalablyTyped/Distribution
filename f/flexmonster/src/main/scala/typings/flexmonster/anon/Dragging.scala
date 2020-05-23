package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dragging extends js.Object {
  var dragging: js.UndefOr[Boolean] = js.undefined
  var drillThroughMaxRows: js.UndefOr[Double] = js.undefined
  var grandTotalsPosition: js.UndefOr[String] = js.undefined
  var showAutoCalculationBar: js.UndefOr[Boolean] = js.undefined
  var showEmptyValues: js.UndefOr[Boolean] = js.undefined
  var showFilter: js.UndefOr[Boolean] = js.undefined
  var showGrandTotals: js.UndefOr[String] = js.undefined
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  var showHierarchies: js.UndefOr[Boolean] = js.undefined
  var showHierarchyCaptions: js.UndefOr[Boolean] = js.undefined
  var showReportFiltersArea: js.UndefOr[Boolean] = js.undefined
  var showTotals: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Dragging {
  @scala.inline
  def apply(
    dragging: js.UndefOr[Boolean] = js.undefined,
    drillThroughMaxRows: js.UndefOr[Double] = js.undefined,
    grandTotalsPosition: String = null,
    showAutoCalculationBar: js.UndefOr[Boolean] = js.undefined,
    showEmptyValues: js.UndefOr[Boolean] = js.undefined,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    showGrandTotals: String = null,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    showHierarchies: js.UndefOr[Boolean] = js.undefined,
    showHierarchyCaptions: js.UndefOr[Boolean] = js.undefined,
    showReportFiltersArea: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): Dragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drillThroughMaxRows)) __obj.updateDynamic("drillThroughMaxRows")(drillThroughMaxRows.get.asInstanceOf[js.Any])
    if (grandTotalsPosition != null) __obj.updateDynamic("grandTotalsPosition")(grandTotalsPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showAutoCalculationBar)) __obj.updateDynamic("showAutoCalculationBar")(showAutoCalculationBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyValues)) __obj.updateDynamic("showEmptyValues")(showEmptyValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.get.asInstanceOf[js.Any])
    if (showGrandTotals != null) __obj.updateDynamic("showGrandTotals")(showGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHierarchies)) __obj.updateDynamic("showHierarchies")(showHierarchies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHierarchyCaptions)) __obj.updateDynamic("showHierarchyCaptions")(showHierarchyCaptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showReportFiltersArea)) __obj.updateDynamic("showReportFiltersArea")(showReportFiltersArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dragging]
  }
}

