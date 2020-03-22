package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollapseAll extends js.Object {
  var collapseAll: js.UndefOr[String] = js.undefined
  var dataNotAvailable: js.UndefOr[String] = js.undefined
  var expandAll: js.UndefOr[String] = js.undefined
  var exportToExcel: js.UndefOr[String] = js.undefined
  var grandTotal: js.UndefOr[String] = js.undefined
  var noData: js.UndefOr[String] = js.undefined
  var removeAllSorting: js.UndefOr[String] = js.undefined
  var showFieldChooser: js.UndefOr[String] = js.undefined
  var sortColumnBySummary: js.UndefOr[String] = js.undefined
  var sortRowBySummary: js.UndefOr[String] = js.undefined
  var total: js.UndefOr[String] = js.undefined
}

object AnonCollapseAll {
  @scala.inline
  def apply(
    collapseAll: String = null,
    dataNotAvailable: String = null,
    expandAll: String = null,
    exportToExcel: String = null,
    grandTotal: String = null,
    noData: String = null,
    removeAllSorting: String = null,
    showFieldChooser: String = null,
    sortColumnBySummary: String = null,
    sortRowBySummary: String = null,
    total: String = null
  ): AnonCollapseAll = {
    val __obj = js.Dynamic.literal()
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(collapseAll.asInstanceOf[js.Any])
    if (dataNotAvailable != null) __obj.updateDynamic("dataNotAvailable")(dataNotAvailable.asInstanceOf[js.Any])
    if (expandAll != null) __obj.updateDynamic("expandAll")(expandAll.asInstanceOf[js.Any])
    if (exportToExcel != null) __obj.updateDynamic("exportToExcel")(exportToExcel.asInstanceOf[js.Any])
    if (grandTotal != null) __obj.updateDynamic("grandTotal")(grandTotal.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (removeAllSorting != null) __obj.updateDynamic("removeAllSorting")(removeAllSorting.asInstanceOf[js.Any])
    if (showFieldChooser != null) __obj.updateDynamic("showFieldChooser")(showFieldChooser.asInstanceOf[js.Any])
    if (sortColumnBySummary != null) __obj.updateDynamic("sortColumnBySummary")(sortColumnBySummary.asInstanceOf[js.Any])
    if (sortRowBySummary != null) __obj.updateDynamic("sortRowBySummary")(sortRowBySummary.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollapseAll]
  }
}

