package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarIconSettings extends js.Object {
  
  /** Allows you to set the visibility of Add Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableAddReport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Calculated Member icon in the toolbar panel.
    * @Default {false}
    */
  var enableCalculatedMember: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Chart Types icon in the toolbar panel.
    * @Default {true}
    */
  var enableChartTypes: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of DB Manipulation icon in the toolbar panel.
    * @Default {true}
    */
  var enableDBManipulation: js.UndefOr[Boolean] = js.native
  
  /** Allows to set the visibility of Defer Update icon in the toolbar panel.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Excel Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableExcelExport: js.UndefOr[Boolean] = js.native
  
  /** Allows to set the visibility of Full Screen icon in the toolbar panel.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of MDX Query icon in the toolbar panel.
    * @Default {true}
    */
  var enableMDXQuery: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of New Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableNewReport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of PDF Export icon in the toolbar panel.
    * @Default {true}
    */
  var enablePdfExport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Remove Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRemoveReport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Rename Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRenameReport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Sort/Filter Column icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterColumn: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Sort/Filter Row icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterRow: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Toggle Axis icon in the toolbar panel.
    * @Default {true}
    */
  var enableToggleAxis: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the visibility of Word Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableWordExport: js.UndefOr[Boolean] = js.native
}
object ToolbarIconSettings {
  
  @scala.inline
  def apply(): ToolbarIconSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarIconSettings]
  }
  
  @scala.inline
  implicit class ToolbarIconSettingsOps[Self <: ToolbarIconSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableAddReport(value: Boolean): Self = this.set("enableAddReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAddReport: Self = this.set("enableAddReport", js.undefined)
    
    @scala.inline
    def setEnableCalculatedMember(value: Boolean): Self = this.set("enableCalculatedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculatedMember: Self = this.set("enableCalculatedMember", js.undefined)
    
    @scala.inline
    def setEnableChartTypes(value: Boolean): Self = this.set("enableChartTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableChartTypes: Self = this.set("enableChartTypes", js.undefined)
    
    @scala.inline
    def setEnableDBManipulation(value: Boolean): Self = this.set("enableDBManipulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDBManipulation: Self = this.set("enableDBManipulation", js.undefined)
    
    @scala.inline
    def setEnableDeferUpdate(value: Boolean): Self = this.set("enableDeferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeferUpdate: Self = this.set("enableDeferUpdate", js.undefined)
    
    @scala.inline
    def setEnableExcelExport(value: Boolean): Self = this.set("enableExcelExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExcelExport: Self = this.set("enableExcelExport", js.undefined)
    
    @scala.inline
    def setEnableFullScreen(value: Boolean): Self = this.set("enableFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFullScreen: Self = this.set("enableFullScreen", js.undefined)
    
    @scala.inline
    def setEnableMDXQuery(value: Boolean): Self = this.set("enableMDXQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMDXQuery: Self = this.set("enableMDXQuery", js.undefined)
    
    @scala.inline
    def setEnableNewReport(value: Boolean): Self = this.set("enableNewReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNewReport: Self = this.set("enableNewReport", js.undefined)
    
    @scala.inline
    def setEnablePdfExport(value: Boolean): Self = this.set("enablePdfExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePdfExport: Self = this.set("enablePdfExport", js.undefined)
    
    @scala.inline
    def setEnableRemoveReport(value: Boolean): Self = this.set("enableRemoveReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRemoveReport: Self = this.set("enableRemoveReport", js.undefined)
    
    @scala.inline
    def setEnableRenameReport(value: Boolean): Self = this.set("enableRenameReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRenameReport: Self = this.set("enableRenameReport", js.undefined)
    
    @scala.inline
    def setEnableSortOrFilterColumn(value: Boolean): Self = this.set("enableSortOrFilterColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSortOrFilterColumn: Self = this.set("enableSortOrFilterColumn", js.undefined)
    
    @scala.inline
    def setEnableSortOrFilterRow(value: Boolean): Self = this.set("enableSortOrFilterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSortOrFilterRow: Self = this.set("enableSortOrFilterRow", js.undefined)
    
    @scala.inline
    def setEnableToggleAxis(value: Boolean): Self = this.set("enableToggleAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableToggleAxis: Self = this.set("enableToggleAxis", js.undefined)
    
    @scala.inline
    def setEnableWordExport(value: Boolean): Self = this.set("enableWordExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWordExport: Self = this.set("enableWordExport", js.undefined)
  }
}
