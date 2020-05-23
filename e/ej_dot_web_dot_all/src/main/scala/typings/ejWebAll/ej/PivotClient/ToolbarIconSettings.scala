package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarIconSettings extends js.Object {
  /** Allows you to set the visibility of Add Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableAddReport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Calculated Member icon in the toolbar panel.
    * @Default {false}
    */
  var enableCalculatedMember: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Chart Types icon in the toolbar panel.
    * @Default {true}
    */
  var enableChartTypes: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of DB Manipulation icon in the toolbar panel.
    * @Default {true}
    */
  var enableDBManipulation: js.UndefOr[Boolean] = js.undefined
  /** Allows to set the visibility of Defer Update icon in the toolbar panel.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Excel Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableExcelExport: js.UndefOr[Boolean] = js.undefined
  /** Allows to set the visibility of Full Screen icon in the toolbar panel.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of MDX Query icon in the toolbar panel.
    * @Default {true}
    */
  var enableMDXQuery: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of New Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableNewReport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of PDF Export icon in the toolbar panel.
    * @Default {true}
    */
  var enablePdfExport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Remove Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRemoveReport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Rename Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRenameReport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Sort/Filter Column icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterColumn: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Sort/Filter Row icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterRow: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Toggle Axis icon in the toolbar panel.
    * @Default {true}
    */
  var enableToggleAxis: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the visibility of Word Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableWordExport: js.UndefOr[Boolean] = js.undefined
}

object ToolbarIconSettings {
  @scala.inline
  def apply(
    enableAddReport: js.UndefOr[Boolean] = js.undefined,
    enableCalculatedMember: js.UndefOr[Boolean] = js.undefined,
    enableChartTypes: js.UndefOr[Boolean] = js.undefined,
    enableDBManipulation: js.UndefOr[Boolean] = js.undefined,
    enableDeferUpdate: js.UndefOr[Boolean] = js.undefined,
    enableExcelExport: js.UndefOr[Boolean] = js.undefined,
    enableFullScreen: js.UndefOr[Boolean] = js.undefined,
    enableMDXQuery: js.UndefOr[Boolean] = js.undefined,
    enableNewReport: js.UndefOr[Boolean] = js.undefined,
    enablePdfExport: js.UndefOr[Boolean] = js.undefined,
    enableRemoveReport: js.UndefOr[Boolean] = js.undefined,
    enableRenameReport: js.UndefOr[Boolean] = js.undefined,
    enableSortOrFilterColumn: js.UndefOr[Boolean] = js.undefined,
    enableSortOrFilterRow: js.UndefOr[Boolean] = js.undefined,
    enableToggleAxis: js.UndefOr[Boolean] = js.undefined,
    enableWordExport: js.UndefOr[Boolean] = js.undefined
  ): ToolbarIconSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAddReport)) __obj.updateDynamic("enableAddReport")(enableAddReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCalculatedMember)) __obj.updateDynamic("enableCalculatedMember")(enableCalculatedMember.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableChartTypes)) __obj.updateDynamic("enableChartTypes")(enableChartTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDBManipulation)) __obj.updateDynamic("enableDBManipulation")(enableDBManipulation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeferUpdate)) __obj.updateDynamic("enableDeferUpdate")(enableDeferUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExcelExport)) __obj.updateDynamic("enableExcelExport")(enableExcelExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullScreen)) __obj.updateDynamic("enableFullScreen")(enableFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMDXQuery)) __obj.updateDynamic("enableMDXQuery")(enableMDXQuery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNewReport)) __obj.updateDynamic("enableNewReport")(enableNewReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePdfExport)) __obj.updateDynamic("enablePdfExport")(enablePdfExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRemoveReport)) __obj.updateDynamic("enableRemoveReport")(enableRemoveReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRenameReport)) __obj.updateDynamic("enableRenameReport")(enableRenameReport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSortOrFilterColumn)) __obj.updateDynamic("enableSortOrFilterColumn")(enableSortOrFilterColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSortOrFilterRow)) __obj.updateDynamic("enableSortOrFilterRow")(enableSortOrFilterRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToggleAxis)) __obj.updateDynamic("enableToggleAxis")(enableToggleAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWordExport)) __obj.updateDynamic("enableWordExport")(enableWordExport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIconSettings]
  }
}

