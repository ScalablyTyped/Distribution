package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDesigner extends Widget_ {
  
  /** Add a dataset to the report at runtime.
    * @param {any} a JSON to define a connection properties for dataset.
    * @returns {void}
    */
  def addDataSet(dataset: js.Any): Unit = js.native
  
  /** Add a datasource to the report at runtime.
    * @param {any} a JSON to define a connection properties for datasource.
    * @returns {void}
    */
  def addDataSource(datasource: js.Any): Unit = js.native
  
  /** Add a report item to the report at runtime.
    * @param {any} JSON for the new report item to be added
    * @returns {void}
    */
  def addItem(item: js.Any): Unit = js.native
  
  /** Visually move the selected report item over its closest intersected report items.
    * @returns {void}
    */
  def bringForward(): Unit = js.native
  
  /** Visually move the selected report item over all other intersected report items.
    * @returns {void}
    */
  def bringToFront(): Unit = js.native
  
  /** Determines whether a copy operation is possible.
    * @returns {boolean}
    */
  def canCopy(): Boolean = js.native
  
  /** Determines whether a cut operation is possible.
    * @returns {boolean}
    */
  def canCut(): Boolean = js.native
  
  /** Determines whether a paste operation is possible.
    * @returns {boolean}
    */
  def canPaste(): Boolean = js.native
  
  /** Returns the boolean value indicating whether the user can redo the previous action in the report.
    * @returns {boolean}
    */
  def canRedo(): Boolean = js.native
  
  /** Determines whether a delete operation is possible.
    * @returns {boolean}
    */
  def canRemove(): Boolean = js.native
  
  /** Returns a boolean value indicating whether the user can undo the previous action in the report.
    * @returns {boolean}
    */
  def canUndo(): Boolean = js.native
  
  /** Clone the existing dataset in the report at runtime.
    * @param {string} Name of the existing dataset.
    * @returns {void}
    */
  def cloneDataSet(name: String): Unit = js.native
  
  /** Clone the existing datasource in the report at runtime.
    * @param {string} Name of the existing datasource.
    * @returns {void}
    */
  def cloneDataSource(name: String): Unit = js.native
  
  /** Copies the selected report item from design panel to the Report Designer internal clipboard.
    * @returns {void}
    */
  def copy(): Unit = js.native
  
  /** Cuts the selected report item from design panel to the Report Designer internal clipboard.
    * @returns {void}
    */
  def cut(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Returns the boolean value that specifies whether the report has changes or not.
    * @returns {boolean}
    */
  def hasReportChanges(): Boolean = js.native
  
  /** Returns the boolean value that specifies whether the currently processing report is a new report or not.
    * @returns {boolean}
    */
  def isNewReport(): Boolean = js.native
  
  /** Returns the boolean value that specifies whether the currently processing report is a new server report or not.
    * @returns {boolean}
    */
  def isNewServerReport(): Boolean = js.native
  
  /** Returns the boolean value that specifies whether the currently processing report is obtained from the server or local.
    * @returns {boolean}
    */
  def isServerReport(): Boolean = js.native
  
  @JSName("model")
  var model_ReportDesigner: Model = js.native
  
  /** To create a new report.
    * @returns {void}
    */
  def newReport(): Unit = js.native
  
  /** To create a new report in the server.
    * @returns {void}
    */
  def newServerReport(): Unit = js.native
  
  /** This method opens the report from the server.
    * @returns {void}
    */
  def openReport(): Unit = js.native
  
  /** This method opens the report using raw report data.
    * @returns {void}
    */
  def openReportDefinition(): Unit = js.native
  
  /** Opens the client browse dialog to browse the report.
    * @returns {void}
    */
  def openReportFromDevice(): Unit = js.native
  
  /** Opens the report designer browse dialog to browse the available reports in the reportserver.
    * @returns {void}
    */
  def openServerReportDialog(): Unit = js.native
  
  /** Pastes the selected report item from the Report Designer internal clipboard to design panel.
    * @returns {void}
    */
  def paste(): Unit = js.native
  
  /** Reverses the action of the last Undo command.
    * @returns {void}
    */
  def redo(): Unit = js.native
  
  /** Deletes the selected report item from the report.
    * @returns {void}
    */
  def remove(): Unit = js.native
  
  /** Remove a dataset from the report at runtime.
    * @param {string} Name of the dataset.
    * @returns {void}
    */
  def removeDataSet(dataset: String): Unit = js.native
  
  /** Remove a datasource from the report at runtime.
    * @param {string} Name of the datasource.
    * @returns {void}
    */
  def removeDatasource(datasource: String): Unit = js.native
  
  /** Remove the given report item from the report.
    * @param {string} Name of the report item to be removed from report
    * @returns {void}
    */
  def removeItem(itemName: String): Unit = js.native
  
  /** This method saves the report into the server.
    * @returns {void}
    */
  def saveReport(): Unit = js.native
  
  /** This method returns the report in JSON or XML format.
    * @returns {void}
    */
  def saveReportDefinition(): Unit = js.native
  
  /** Opens the report designer browse dialog to save the report into server.
    * @returns {void}
    */
  def saveServerReportDialog(): Unit = js.native
  
  /** To download the designed report.
    * @returns {void}
    */
  def saveToDevice(): Unit = js.native
  
  /** Update the selection to report items at runtime.
    * @param {any[]} Name of the report items as string array.
    * @returns {void}
    */
  def selectItems(itemNames: js.Array[_]): Unit = js.native
  
  /** Visually move the selected report item behind its closest intersected report item.
    * @returns {void}
    */
  def sendBackward(): Unit = js.native
  
  /** Visually move the selected report item behind all other intersected report items.
    * @returns {void}
    */
  def sendToBack(): Unit = js.native
  
  /** Performs switch action from viewer to designer at runtime.
    * @returns {void}
    */
  def showDesign(): Unit = js.native
  
  /** To open the new report dialog.
    * @returns {void}
    */
  def showNewReportDialog(): Unit = js.native
  
  /** To open the server browse dialog.
    * @returns {void}
    */
  def showOpenSaveReportDialog(): Unit = js.native
  
  /** Performs switch action from designer to viewer at runtime.
    * @returns {void}
    */
  def showPreview(): Unit = js.native
  
  /** Reverses the last action that was performed.
    * @returns {void}
    */
  def undo(): Unit = js.native
  
  /** Update the dataset in the report at runtime.
    * @param {string} Name of the existing dataset.
    * @param {any} a JSON to define a connection properties for dataset.
    * @returns {void}
    */
  def updateDataset(datasetName: String, dataset: js.Any): Unit = js.native
  
  /** Update the datasource in the report at runtime.
    * @param {string} Name of the existing datasource.
    * @param {any} a JSON to define a connection properties for datasource.
    * @returns {void}
    */
  def updateDatasource(datasourceName: String, datasource: js.Any): Unit = js.native
}
object ReportDesigner {
  
  @js.native
  sealed trait ConfigureItems extends StObject
  @JSGlobal("ej.ReportDesigner.ConfigureItems")
  @js.native
  object ConfigureItems extends StObject {
    
    ///Shows all the configuration pane items.
    @js.native
    sealed trait All extends ConfigureItems
    
    ///Shows or hides the data panel in configuration pane.
    @js.native
    sealed trait Data extends ConfigureItems
    
    ///Shows or hides the image manager panel in configuration pane.
    @js.native
    sealed trait ImageManager extends ConfigureItems
    
    ///Shows or hides the parameter panel in configuration pane.
    @js.native
    sealed trait Parameter extends ConfigureItems
    
    ///Shows or hides the properties panel in configuration pane.
    @js.native
    sealed trait Property extends ConfigureItems
  }
  
  @js.native
  sealed trait Permission extends StObject
  @JSGlobal("ej.ReportDesigner.Permission")
  @js.native
  object Permission extends StObject {
    
    ///Shows all the options in data source pane.
    @js.native
    sealed trait All extends Permission
    
    ///Shows or hides create option in data source pane.
    @js.native
    sealed trait Create extends Permission
    
    ///Shows or hides the delete option in data source pane.
    @js.native
    sealed trait Delete extends Permission
    
    ///Shows or hides the edit option in data source pane.
    @js.native
    sealed trait Edit extends Permission
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.ReportDesigner.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Snaps the selected report items to the closest gridline.
    @js.native
    sealed trait AlignGrid extends ToolbarItems
    
    ///Aligns the selected report item in the design surface.
    @js.native
    sealed trait Alignment extends ToolbarItems
    
    ///Shows all the toolbar items.
    @js.native
    sealed trait All extends ToolbarItems
    
    ///Aligns all report items to the center position of design surface in horizontal or vertical direction.
    @js.native
    sealed trait Center extends ToolbarItems
    
    ///Copies selected text or object to the clipboard.
    @js.native
    sealed trait Copy extends ToolbarItems
    
    ///Removes the selected item from the active report.
    @js.native
    sealed trait Cut extends ToolbarItems
    
    ///Deletes the selected item or text from the report.
    @js.native
    sealed trait Delete extends ToolbarItems
    
    ///Distributes selected report items at equal intervals from each other.
    @js.native
    sealed trait Distribute extends ToolbarItems
    
    ///Switches from preview to design view of the report.
    @js.native
    sealed trait EditDesign extends ToolbarItems
    
    ///Creates a new, blank report.
    @js.native
    sealed trait New extends ToolbarItems
    
    ///Displays the Open dialog box to retrieve an existing report.
    @js.native
    sealed trait Open extends ToolbarItems
    
    ///Used to change the layout order of report items in design area surface.
    @js.native
    sealed trait Order extends ToolbarItems
    
    ///Pastes the item that cut or copied into (the position of the insertion point) the report from the clipboard.
    @js.native
    sealed trait Paste extends ToolbarItems
    
    ///Previews the active report in report viewer.
    @js.native
    sealed trait Preview extends ToolbarItems
    
    ///Reverses the action of the last Undo command.
    @js.native
    sealed trait Redo extends ToolbarItems
    
    ///Saves the active report to a specified location.
    @js.native
    sealed trait Save extends ToolbarItems
    
    ///Equally size the selected report items in the design surface.
    @js.native
    sealed trait Sizing extends ToolbarItems
    
    ///Reverses the last action or deletes the last entry that is typed.
    @js.native
    sealed trait Undo extends ToolbarItems
    
    ///Contains options to show or hide `Header`, `Footer`, `Grid Lines`, `Snap To Shape` in the report design.
    @js.native
    sealed trait View extends ToolbarItems
    
    ///Used to "zoom in" to get a close-up view of a report or "zoom out" to see more of the page at a reduced size.
    @js.native
    sealed trait Zoom extends ToolbarItems
  }
  
  @js.native
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** Action type of AJAX call back.
      */
    var actionType: js.UndefOr[String] = js.native
    
    /** To pass the custom data while AJAX post back.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** AJAX headers, we can pass any custom header through this property.
      */
    var headers: js.UndefOr[js.Array[_]] = js.native
    
    /** Token of report designer.
      */
    var reportDesignerToken: js.UndefOr[String] = js.native
    
    /** Token of ReportingService.
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.native
  }
  object AjaxBeforeLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxBeforeLoadEventArgsMutableBuilder[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setReportDesignerToken(value: String): Self = StObject.set(x, "reportDesignerToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDesignerTokenUndefined: Self = StObject.set(x, "reportDesignerToken", js.undefined)
      
      @scala.inline
      def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
    }
  }
  
  @js.native
  trait AjaxErrorEventArgs extends StObject
  
  @js.native
  trait AjaxSuccessEventArgs extends StObject
  
  @js.native
  trait ConfigurePaneSettings extends StObject {
    
    /** Shows or hides the grouped items in the configuration pane with the help of enum ej.ReportDesigner.ConfigureItems
      * @Default {ej.ReportDesigner.ConfigureItems.All}
      */
    var items: js.UndefOr[ConfigureItems | String] = js.native
    
    /** Shows or hides the configuration pane in ReportDesigner control.
      * @Default {true}
      */
    var showConfigurePane: js.UndefOr[Boolean] = js.native
  }
  object ConfigurePaneSettings {
    
    @scala.inline
    def apply(): ConfigurePaneSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurePaneSettings]
    }
    
    @scala.inline
    implicit class ConfigurePaneSettingsMutableBuilder[Self <: ConfigurePaneSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: ConfigureItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setShowConfigurePane(value: Boolean): Self = StObject.set(x, "showConfigurePane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowConfigurePaneUndefined: Self = StObject.set(x, "showConfigurePane", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject
  
  @js.native
  trait DestroyEventArgs extends StObject
  
  @js.native
  trait Model extends StObject {
    
    /** This event will be triggered before AJAX loads.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
    
    /** This event will be triggered when AJAX result is failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** This event will be triggered when AJAX result is succeeded.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Shows or hides the items of configuration pane in ReportDesigner control.
      */
    var configurePaneSettings: js.UndefOr[ConfigurePaneSettings] = js.native
    
    /** This event will be triggered when the Report Designer widget is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** This event will be triggered when the Report Designer widget is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Specifies the locale for report designer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** This event will be triggered while initiating new data click action. You can suppress the new data creation panel and perform custom actions.
      */
    var newDataClick: js.UndefOr[js.Function1[/* e */ NewDataClickEventArgs, Unit]] = js.native
    
    /** This event will be triggered while clicking open menu items.
      */
    var openReportClick: js.UndefOr[js.Function1[/* e */ OpenReportClickEventArgs, Unit]] = js.native
    
    /** Shows or hides the create, edit, and delete options in data source and dataset panels.
      * @Default {ej.ReportDesigner.Permission.All}
      */
    var permissionSettings: js.UndefOr[PermissionSettings] = js.native
    
    /** This event will be triggered while previewing the report in RDLC mode. It can be used to suppress the preview data dialog in RDLC mode.
      */
    var previewReport: js.UndefOr[js.Function1[/* e */ PreviewReportEventArgs, Unit]] = js.native
    
    /** Gets or sets the list of custom data extension items.
      * @Default {[]}
      */
    var reportDataExtensions: js.UndefOr[js.Array[ReportDataExtension]] = js.native
    
    /** Gets or sets the list of custom report items.
      * @Default {[]}
      */
    var reportItemExtensions: js.UndefOr[js.Array[ReportItemExtension]] = js.native
    
    /** This event will be triggered when the report is modified.
      */
    var reportModified: js.UndefOr[js.Function1[/* e */ ReportModifiedEventArgs, Unit]] = js.native
    
    /** This event will be triggered when the report is opened.
      */
    var reportOpened: js.UndefOr[js.Function1[/* e */ ReportOpenedEventArgs, Unit]] = js.native
    
    /** Gets or sets the report path of server.
      * @Default {null}
      */
    var reportPath: js.UndefOr[String] = js.native
    
    /** This event will be triggered when the report is saved.
      */
    var reportSaved: js.UndefOr[js.Function1[/* e */ ReportSavedEventArgs, Unit]] = js.native
    
    /** Gets or sets the reports server URL.
      * @Default {null}
      */
    var reportServerUrl: js.UndefOr[String] = js.native
    
    /** Gets or sets the report type.
      * @Default {ej.ReportDesigner.ReportType.RDL}
      */
    var reportType: js.UndefOr[String] = js.native
    
    /** This event will be triggered when the save menu items are clicked.
      */
    var saveReportClick: js.UndefOr[js.Function1[/* e */ SaveReportClickEventArgs, Unit]] = js.native
    
    /** Gets or sets the serviceAuthorizationToken to access the Report Server API services.
      * @Default {empty}
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.native
    
    /** Gets or sets the URL of the  WebAPI service; it will be used for processing the report.
      * @Default {null}
      */
    var serviceUrl: js.UndefOr[String] = js.native
    
    /** Gets or sets the tenant name of the user groups; it will be used when integrating report designer with server.
      * @Default {null}
      */
    var tenantName: js.UndefOr[String] = js.native
    
    /** This event will be triggered while clicking the toolbar items.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
    
    /** This event will be triggered on rendering the Report Designer toolbar.
      */
    var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.native
    
    /** Defines the settings of the ReportDesigner toolbar.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.ReportDesigner.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ReportDesigner.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.ReportDesigner.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setConfigurePaneSettings(value: ConfigurePaneSettings): Self = StObject.set(x, "configurePaneSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurePaneSettingsUndefined: Self = StObject.set(x, "configurePaneSettings", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNewDataClick(value: /* e */ NewDataClickEventArgs => Unit): Self = StObject.set(x, "newDataClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewDataClickUndefined: Self = StObject.set(x, "newDataClick", js.undefined)
      
      @scala.inline
      def setOpenReportClick(value: /* e */ OpenReportClickEventArgs => Unit): Self = StObject.set(x, "openReportClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenReportClickUndefined: Self = StObject.set(x, "openReportClick", js.undefined)
      
      @scala.inline
      def setPermissionSettings(value: PermissionSettings): Self = StObject.set(x, "permissionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionSettingsUndefined: Self = StObject.set(x, "permissionSettings", js.undefined)
      
      @scala.inline
      def setPreviewReport(value: /* e */ PreviewReportEventArgs => Unit): Self = StObject.set(x, "previewReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewReportUndefined: Self = StObject.set(x, "previewReport", js.undefined)
      
      @scala.inline
      def setReportDataExtensions(value: js.Array[ReportDataExtension]): Self = StObject.set(x, "reportDataExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDataExtensionsUndefined: Self = StObject.set(x, "reportDataExtensions", js.undefined)
      
      @scala.inline
      def setReportDataExtensionsVarargs(value: ReportDataExtension*): Self = StObject.set(x, "reportDataExtensions", js.Array(value :_*))
      
      @scala.inline
      def setReportItemExtensions(value: js.Array[ReportItemExtension]): Self = StObject.set(x, "reportItemExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportItemExtensionsUndefined: Self = StObject.set(x, "reportItemExtensions", js.undefined)
      
      @scala.inline
      def setReportItemExtensionsVarargs(value: ReportItemExtension*): Self = StObject.set(x, "reportItemExtensions", js.Array(value :_*))
      
      @scala.inline
      def setReportModified(value: /* e */ ReportModifiedEventArgs => Unit): Self = StObject.set(x, "reportModified", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportModifiedUndefined: Self = StObject.set(x, "reportModified", js.undefined)
      
      @scala.inline
      def setReportOpened(value: /* e */ ReportOpenedEventArgs => Unit): Self = StObject.set(x, "reportOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportOpenedUndefined: Self = StObject.set(x, "reportOpened", js.undefined)
      
      @scala.inline
      def setReportPath(value: String): Self = StObject.set(x, "reportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportPathUndefined: Self = StObject.set(x, "reportPath", js.undefined)
      
      @scala.inline
      def setReportSaved(value: /* e */ ReportSavedEventArgs => Unit): Self = StObject.set(x, "reportSaved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportSavedUndefined: Self = StObject.set(x, "reportSaved", js.undefined)
      
      @scala.inline
      def setReportServerUrl(value: String): Self = StObject.set(x, "reportServerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportServerUrlUndefined: Self = StObject.set(x, "reportServerUrl", js.undefined)
      
      @scala.inline
      def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
      
      @scala.inline
      def setSaveReportClick(value: /* e */ SaveReportClickEventArgs => Unit): Self = StObject.set(x, "saveReportClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveReportClickUndefined: Self = StObject.set(x, "saveReportClick", js.undefined)
      
      @scala.inline
      def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
      
      @scala.inline
      def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
      
      @scala.inline
      def setTenantName(value: String): Self = StObject.set(x, "tenantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantNameUndefined: Self = StObject.set(x, "tenantName", js.undefined)
      
      @scala.inline
      def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      @scala.inline
      def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = StObject.set(x, "toolbarRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarRenderingUndefined: Self = StObject.set(x, "toolbarRendering", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
    }
  }
  
  @js.native
  trait NewDataClickEventArgs extends StObject
  
  @js.native
  trait OpenReportClickEventArgs extends StObject {
    
    /** Name of selected item.
      */
    var select: js.UndefOr[String] = js.native
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.native
  }
  object OpenReportClickEventArgs {
    
    @scala.inline
    def apply(): OpenReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenReportClickEventArgs]
    }
    
    @scala.inline
    implicit class OpenReportClickEventArgsMutableBuilder[Self <: OpenReportClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait PermissionSettings extends StObject {
    
    /** Shows or hides the create, edit and delete options in data source pane with the help of ej.ReportDesigner.Permission enum.
      * @Default {ej.ReportDesigner.Permission.All}
      */
    var dataSource: js.UndefOr[Permission | String] = js.native
  }
  object PermissionSettings {
    
    @scala.inline
    def apply(): PermissionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionSettings]
    }
    
    @scala.inline
    implicit class PermissionSettingsMutableBuilder[Self <: PermissionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSource(value: Permission | String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    }
  }
  
  @js.native
  trait PreviewReportEventArgs extends StObject {
    
    /** Specifies whether to show or hide preview data dialog.
      */
    var cancelDataInputDialog: js.UndefOr[Boolean] = js.native
    
    /** Contains the required data to load the report.
      */
    var dataSets: js.UndefOr[js.Array[_]] = js.native
    
    /** Contains the instance of Report Viewer component.
      */
    var reportViewer: js.UndefOr[js.Any] = js.native
  }
  object PreviewReportEventArgs {
    
    @scala.inline
    def apply(): PreviewReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewReportEventArgs]
    }
    
    @scala.inline
    implicit class PreviewReportEventArgsMutableBuilder[Self <: PreviewReportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelDataInputDialog(value: Boolean): Self = StObject.set(x, "cancelDataInputDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelDataInputDialogUndefined: Self = StObject.set(x, "cancelDataInputDialog", js.undefined)
      
      @scala.inline
      def setDataSets(value: js.Array[_]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
      
      @scala.inline
      def setDataSetsVarargs(value: js.Any*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
      
      @scala.inline
      def setReportViewer(value: js.Any): Self = StObject.set(x, "reportViewer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportViewerUndefined: Self = StObject.set(x, "reportViewer", js.undefined)
    }
  }
  
  @js.native
  trait ReportDataExtension extends StObject {
    
    /** Gets or sets the class name of the data extension.
      * @Default {empty}
      */
    var className: js.UndefOr[String] = js.native
    
    /** Gets or sets the name for data extension item to display in the data pane tile.
      * @Default {empty}
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Gets or sets the image class name to load image in data pane tile.
      * @Default {empty}
      */
    var imageClass: js.UndefOr[String] = js.native
    
    /** Gets or sets the name of the datasource type.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.native
  }
  object ReportDataExtension {
    
    @scala.inline
    def apply(): ReportDataExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportDataExtension]
    }
    
    @scala.inline
    implicit class ReportDataExtensionMutableBuilder[Self <: ReportDataExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait ReportItemExtension extends StObject {
    
    /** Gets or sets the category name for the report item.
      * @Default {empty}
      */
    var category: js.UndefOr[String] = js.native
    
    /** Gets or sets the class name of the report item.
      * @Default {empty}
      */
    var className: js.UndefOr[String] = js.native
    
    /** Gets or sets the name for custom report item to display in the widgets pane tile.
      * @Default {empty}
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Gets or sets the image class name to load image in widgets pane tile.
      * @Default {empty}
      */
    var imageClass: js.UndefOr[String] = js.native
    
    /** Gets or sets the name for the report item.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Gets information to provide content for custom report item tooltip.
      * @Default {null}
      */
    var toolTip: js.UndefOr[js.Any] = js.native
  }
  object ReportItemExtension {
    
    @scala.inline
    def apply(): ReportItemExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportItemExtension]
    }
    
    @scala.inline
    implicit class ReportItemExtensionMutableBuilder[Self <: ReportItemExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setToolTip(value: js.Any): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  @js.native
  trait ReportModifiedEventArgs extends StObject {
    
    /** Specifies whether the report is modified or not.
      */
    var isModified: js.UndefOr[Boolean] = js.native
    
    /** Name of Opened Report.
      */
    var reportName: js.UndefOr[String] = js.native
  }
  object ReportModifiedEventArgs {
    
    @scala.inline
    def apply(): ReportModifiedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportModifiedEventArgs]
    }
    
    @scala.inline
    implicit class ReportModifiedEventArgsMutableBuilder[Self <: ReportModifiedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    }
  }
  
  @js.native
  trait ReportOpenedEventArgs extends StObject {
    
    /** Specifies whether report opened from device or server.
      */
    var isServerReport: js.UndefOr[Boolean] = js.native
    
    /** Name of Opened Report.
      */
    var reportName: js.UndefOr[String] = js.native
  }
  object ReportOpenedEventArgs {
    
    @scala.inline
    def apply(): ReportOpenedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOpenedEventArgs]
    }
    
    @scala.inline
    implicit class ReportOpenedEventArgsMutableBuilder[Self <: ReportOpenedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsServerReport(value: Boolean): Self = StObject.set(x, "isServerReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerReportUndefined: Self = StObject.set(x, "isServerReport", js.undefined)
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    }
  }
  
  @js.native
  trait ReportSavedEventArgs extends StObject {
    
    /** Specifies whether report opened from device or server.
      */
    var isServerReport: js.UndefOr[Boolean] = js.native
    
    /** States whether report is downloaded from ReportServer.
      */
    var reportAction: js.UndefOr[String] = js.native
  }
  object ReportSavedEventArgs {
    
    @scala.inline
    def apply(): ReportSavedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportSavedEventArgs]
    }
    
    @scala.inline
    implicit class ReportSavedEventArgsMutableBuilder[Self <: ReportSavedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsServerReport(value: Boolean): Self = StObject.set(x, "isServerReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerReportUndefined: Self = StObject.set(x, "isServerReport", js.undefined)
      
      @scala.inline
      def setReportAction(value: String): Self = StObject.set(x, "reportAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportActionUndefined: Self = StObject.set(x, "reportAction", js.undefined)
    }
  }
  
  @js.native
  trait SaveReportClickEventArgs extends StObject {
    
    /** Name of selected item.
      */
    var select: js.UndefOr[String] = js.native
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.native
  }
  object SaveReportClickEventArgs {
    
    @scala.inline
    def apply(): SaveReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveReportClickEventArgs]
    }
    
    @scala.inline
    implicit class SaveReportClickEventArgsMutableBuilder[Self <: SaveReportClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarClickEventArgs extends StObject {
    
    /** Name of clicked item.
      */
    var click: js.UndefOr[String] = js.native
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.native
  }
  object ToolbarClickEventArgs {
    
    @scala.inline
    def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    @scala.inline
    implicit class ToolbarClickEventArgsMutableBuilder[Self <: ToolbarClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarRenderingEventArgs extends StObject
  
  @js.native
  trait ToolbarSettings extends StObject {
    
    /** Shows or hides the grouped items in the toolbar with the help of enum ej.ReportDesigner.ToolbarItems.
      * @Default {ej.ReportDesigner.ToolbarItems.All}
      */
    var items: js.UndefOr[ToolbarItems | String] = js.native
    
    /** Shows or hides the toolbar.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.native
    
    /** Specifies the toolbar template ID.
      * @Default {empty}
      */
    var templateId: js.UndefOr[String] = js.native
  }
  object ToolbarSettings {
    
    @scala.inline
    def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit class ToolbarSettingsMutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: ToolbarItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
}
