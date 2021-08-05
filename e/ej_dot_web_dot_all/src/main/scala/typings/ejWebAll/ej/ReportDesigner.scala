package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDesigner
  extends StObject
     with Widget_ {
  
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
  def selectItems(itemNames: js.Array[js.Any]): Unit = js.native
  
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
    sealed trait All
      extends StObject
         with ConfigureItems
    
    ///Shows or hides the data panel in configuration pane.
    @js.native
    sealed trait Data
      extends StObject
         with ConfigureItems
    
    ///Shows or hides the image manager panel in configuration pane.
    @js.native
    sealed trait ImageManager
      extends StObject
         with ConfigureItems
    
    ///Shows or hides the parameter panel in configuration pane.
    @js.native
    sealed trait Parameter
      extends StObject
         with ConfigureItems
    
    ///Shows or hides the properties panel in configuration pane.
    @js.native
    sealed trait Property
      extends StObject
         with ConfigureItems
  }
  
  @js.native
  sealed trait Permission extends StObject
  @JSGlobal("ej.ReportDesigner.Permission")
  @js.native
  object Permission extends StObject {
    
    ///Shows all the options in data source pane.
    @js.native
    sealed trait All
      extends StObject
         with Permission
    
    ///Shows or hides create option in data source pane.
    @js.native
    sealed trait Create
      extends StObject
         with Permission
    
    ///Shows or hides the delete option in data source pane.
    @js.native
    sealed trait Delete
      extends StObject
         with Permission
    
    ///Shows or hides the edit option in data source pane.
    @js.native
    sealed trait Edit
      extends StObject
         with Permission
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.ReportDesigner.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Snaps the selected report items to the closest gridline.
    @js.native
    sealed trait AlignGrid
      extends StObject
         with ToolbarItems
    
    ///Aligns the selected report item in the design surface.
    @js.native
    sealed trait Alignment
      extends StObject
         with ToolbarItems
    
    ///Shows all the toolbar items.
    @js.native
    sealed trait All
      extends StObject
         with ToolbarItems
    
    ///Aligns all report items to the center position of design surface in horizontal or vertical direction.
    @js.native
    sealed trait Center
      extends StObject
         with ToolbarItems
    
    ///Copies selected text or object to the clipboard.
    @js.native
    sealed trait Copy
      extends StObject
         with ToolbarItems
    
    ///Removes the selected item from the active report.
    @js.native
    sealed trait Cut
      extends StObject
         with ToolbarItems
    
    ///Deletes the selected item or text from the report.
    @js.native
    sealed trait Delete
      extends StObject
         with ToolbarItems
    
    ///Distributes selected report items at equal intervals from each other.
    @js.native
    sealed trait Distribute
      extends StObject
         with ToolbarItems
    
    ///Switches from preview to design view of the report.
    @js.native
    sealed trait EditDesign
      extends StObject
         with ToolbarItems
    
    ///Creates a new, blank report.
    @js.native
    sealed trait New
      extends StObject
         with ToolbarItems
    
    ///Displays the Open dialog box to retrieve an existing report.
    @js.native
    sealed trait Open
      extends StObject
         with ToolbarItems
    
    ///Used to change the layout order of report items in design area surface.
    @js.native
    sealed trait Order
      extends StObject
         with ToolbarItems
    
    ///Pastes the item that cut or copied into (the position of the insertion point) the report from the clipboard.
    @js.native
    sealed trait Paste
      extends StObject
         with ToolbarItems
    
    ///Previews the active report in report viewer.
    @js.native
    sealed trait Preview
      extends StObject
         with ToolbarItems
    
    ///Reverses the action of the last Undo command.
    @js.native
    sealed trait Redo
      extends StObject
         with ToolbarItems
    
    ///Saves the active report to a specified location.
    @js.native
    sealed trait Save
      extends StObject
         with ToolbarItems
    
    ///Equally size the selected report items in the design surface.
    @js.native
    sealed trait Sizing
      extends StObject
         with ToolbarItems
    
    ///Reverses the last action or deletes the last entry that is typed.
    @js.native
    sealed trait Undo
      extends StObject
         with ToolbarItems
    
    ///Contains options to show or hide `Header`, `Footer`, `Grid Lines`, `Snap To Shape` in the report design.
    @js.native
    sealed trait View
      extends StObject
         with ToolbarItems
    
    ///Used to "zoom in" to get a close-up view of a report or "zoom out" to see more of the page at a reduced size.
    @js.native
    sealed trait Zoom
      extends StObject
         with ToolbarItems
  }
  
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** Action type of AJAX call back.
      */
    var actionType: js.UndefOr[String] = js.undefined
    
    /** To pass the custom data while AJAX post back.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** AJAX headers, we can pass any custom header through this property.
      */
    var headers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Token of report designer.
      */
    var reportDesignerToken: js.UndefOr[String] = js.undefined
    
    /** Token of ReportingService.
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
  }
  object AjaxBeforeLoadEventArgs {
    
    inline def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    extension [Self <: AjaxBeforeLoadEventArgs](x: Self) {
      
      inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setReportDesignerToken(value: String): Self = StObject.set(x, "reportDesignerToken", value.asInstanceOf[js.Any])
      
      inline def setReportDesignerTokenUndefined: Self = StObject.set(x, "reportDesignerToken", js.undefined)
      
      inline def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      inline def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
    }
  }
  
  trait AjaxErrorEventArgs extends StObject
  
  trait AjaxSuccessEventArgs extends StObject
  
  trait ConfigurePaneSettings extends StObject {
    
    /** Shows or hides the grouped items in the configuration pane with the help of enum ej.ReportDesigner.ConfigureItems
      * @Default {ej.ReportDesigner.ConfigureItems.All}
      */
    var items: js.UndefOr[ConfigureItems | String] = js.undefined
    
    /** Shows or hides the configuration pane in ReportDesigner control.
      * @Default {true}
      */
    var showConfigurePane: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurePaneSettings {
    
    inline def apply(): ConfigurePaneSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurePaneSettings]
    }
    
    extension [Self <: ConfigurePaneSettings](x: Self) {
      
      inline def setItems(value: ConfigureItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setShowConfigurePane(value: Boolean): Self = StObject.set(x, "showConfigurePane", value.asInstanceOf[js.Any])
      
      inline def setShowConfigurePaneUndefined: Self = StObject.set(x, "showConfigurePane", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject
  
  trait DestroyEventArgs extends StObject
  
  trait Model extends StObject {
    
    /** This event will be triggered before AJAX loads.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered when AJAX result is failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered when AJAX result is succeeded.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
    
    /** Shows or hides the items of configuration pane in ReportDesigner control.
      */
    var configurePaneSettings: js.UndefOr[ConfigurePaneSettings] = js.undefined
    
    /** This event will be triggered when the Report Designer widget is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered when the Report Designer widget is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the locale for report designer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** This event will be triggered while initiating new data click action. You can suppress the new data creation panel and perform custom actions.
      */
    var newDataClick: js.UndefOr[js.Function1[/* e */ NewDataClickEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered while clicking open menu items.
      */
    var openReportClick: js.UndefOr[js.Function1[/* e */ OpenReportClickEventArgs, Unit]] = js.undefined
    
    /** Shows or hides the create, edit, and delete options in data source and dataset panels.
      * @Default {ej.ReportDesigner.Permission.All}
      */
    var permissionSettings: js.UndefOr[PermissionSettings] = js.undefined
    
    /** This event will be triggered while previewing the report in RDLC mode. It can be used to suppress the preview data dialog in RDLC mode.
      */
    var previewReport: js.UndefOr[js.Function1[/* e */ PreviewReportEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the list of custom data extension items.
      * @Default {[]}
      */
    var reportDataExtensions: js.UndefOr[js.Array[ReportDataExtension]] = js.undefined
    
    /** Gets or sets the list of custom report items.
      * @Default {[]}
      */
    var reportItemExtensions: js.UndefOr[js.Array[ReportItemExtension]] = js.undefined
    
    /** This event will be triggered when the report is modified.
      */
    var reportModified: js.UndefOr[js.Function1[/* e */ ReportModifiedEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered when the report is opened.
      */
    var reportOpened: js.UndefOr[js.Function1[/* e */ ReportOpenedEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the report path of server.
      * @Default {null}
      */
    var reportPath: js.UndefOr[String] = js.undefined
    
    /** This event will be triggered when the report is saved.
      */
    var reportSaved: js.UndefOr[js.Function1[/* e */ ReportSavedEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the reports server URL.
      * @Default {null}
      */
    var reportServerUrl: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the report type.
      * @Default {ej.ReportDesigner.ReportType.RDL}
      */
    var reportType: js.UndefOr[String] = js.undefined
    
    /** This event will be triggered when the save menu items are clicked.
      */
    var saveReportClick: js.UndefOr[js.Function1[/* e */ SaveReportClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the serviceAuthorizationToken to access the Report Server API services.
      * @Default {empty}
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the URL of the  WebAPI service; it will be used for processing the report.
      * @Default {null}
      */
    var serviceUrl: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the tenant name of the user groups; it will be used when integrating report designer with server.
      * @Default {null}
      */
    var tenantName: js.UndefOr[String] = js.undefined
    
    /** This event will be triggered while clicking the toolbar items.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered on rendering the Report Designer toolbar.
      */
    var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.undefined
    
    /** Defines the settings of the ReportDesigner toolbar.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ReportDesigner.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ReportDesigner.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.ReportDesigner.Model](x: Self) {
      
      inline def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      inline def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      inline def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      inline def setConfigurePaneSettings(value: ConfigurePaneSettings): Self = StObject.set(x, "configurePaneSettings", value.asInstanceOf[js.Any])
      
      inline def setConfigurePaneSettingsUndefined: Self = StObject.set(x, "configurePaneSettings", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNewDataClick(value: /* e */ NewDataClickEventArgs => Unit): Self = StObject.set(x, "newDataClick", js.Any.fromFunction1(value))
      
      inline def setNewDataClickUndefined: Self = StObject.set(x, "newDataClick", js.undefined)
      
      inline def setOpenReportClick(value: /* e */ OpenReportClickEventArgs => Unit): Self = StObject.set(x, "openReportClick", js.Any.fromFunction1(value))
      
      inline def setOpenReportClickUndefined: Self = StObject.set(x, "openReportClick", js.undefined)
      
      inline def setPermissionSettings(value: PermissionSettings): Self = StObject.set(x, "permissionSettings", value.asInstanceOf[js.Any])
      
      inline def setPermissionSettingsUndefined: Self = StObject.set(x, "permissionSettings", js.undefined)
      
      inline def setPreviewReport(value: /* e */ PreviewReportEventArgs => Unit): Self = StObject.set(x, "previewReport", js.Any.fromFunction1(value))
      
      inline def setPreviewReportUndefined: Self = StObject.set(x, "previewReport", js.undefined)
      
      inline def setReportDataExtensions(value: js.Array[ReportDataExtension]): Self = StObject.set(x, "reportDataExtensions", value.asInstanceOf[js.Any])
      
      inline def setReportDataExtensionsUndefined: Self = StObject.set(x, "reportDataExtensions", js.undefined)
      
      inline def setReportDataExtensionsVarargs(value: ReportDataExtension*): Self = StObject.set(x, "reportDataExtensions", js.Array(value :_*))
      
      inline def setReportItemExtensions(value: js.Array[ReportItemExtension]): Self = StObject.set(x, "reportItemExtensions", value.asInstanceOf[js.Any])
      
      inline def setReportItemExtensionsUndefined: Self = StObject.set(x, "reportItemExtensions", js.undefined)
      
      inline def setReportItemExtensionsVarargs(value: ReportItemExtension*): Self = StObject.set(x, "reportItemExtensions", js.Array(value :_*))
      
      inline def setReportModified(value: /* e */ ReportModifiedEventArgs => Unit): Self = StObject.set(x, "reportModified", js.Any.fromFunction1(value))
      
      inline def setReportModifiedUndefined: Self = StObject.set(x, "reportModified", js.undefined)
      
      inline def setReportOpened(value: /* e */ ReportOpenedEventArgs => Unit): Self = StObject.set(x, "reportOpened", js.Any.fromFunction1(value))
      
      inline def setReportOpenedUndefined: Self = StObject.set(x, "reportOpened", js.undefined)
      
      inline def setReportPath(value: String): Self = StObject.set(x, "reportPath", value.asInstanceOf[js.Any])
      
      inline def setReportPathUndefined: Self = StObject.set(x, "reportPath", js.undefined)
      
      inline def setReportSaved(value: /* e */ ReportSavedEventArgs => Unit): Self = StObject.set(x, "reportSaved", js.Any.fromFunction1(value))
      
      inline def setReportSavedUndefined: Self = StObject.set(x, "reportSaved", js.undefined)
      
      inline def setReportServerUrl(value: String): Self = StObject.set(x, "reportServerUrl", value.asInstanceOf[js.Any])
      
      inline def setReportServerUrlUndefined: Self = StObject.set(x, "reportServerUrl", js.undefined)
      
      inline def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
      
      inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
      
      inline def setSaveReportClick(value: /* e */ SaveReportClickEventArgs => Unit): Self = StObject.set(x, "saveReportClick", js.Any.fromFunction1(value))
      
      inline def setSaveReportClickUndefined: Self = StObject.set(x, "saveReportClick", js.undefined)
      
      inline def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      inline def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
      
      inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      inline def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
      
      inline def setTenantName(value: String): Self = StObject.set(x, "tenantName", value.asInstanceOf[js.Any])
      
      inline def setTenantNameUndefined: Self = StObject.set(x, "tenantName", js.undefined)
      
      inline def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      inline def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      inline def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = StObject.set(x, "toolbarRendering", js.Any.fromFunction1(value))
      
      inline def setToolbarRenderingUndefined: Self = StObject.set(x, "toolbarRendering", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
    }
  }
  
  trait NewDataClickEventArgs extends StObject
  
  trait OpenReportClickEventArgs extends StObject {
    
    /** Name of selected item.
      */
    var select: js.UndefOr[String] = js.undefined
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.undefined
  }
  object OpenReportClickEventArgs {
    
    inline def apply(): OpenReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenReportClickEventArgs]
    }
    
    extension [Self <: OpenReportClickEventArgs](x: Self) {
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait PermissionSettings extends StObject {
    
    /** Shows or hides the create, edit and delete options in data source pane with the help of ej.ReportDesigner.Permission enum.
      * @Default {ej.ReportDesigner.Permission.All}
      */
    var dataSource: js.UndefOr[Permission | String] = js.undefined
  }
  object PermissionSettings {
    
    inline def apply(): PermissionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionSettings]
    }
    
    extension [Self <: PermissionSettings](x: Self) {
      
      inline def setDataSource(value: Permission | String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    }
  }
  
  trait PreviewReportEventArgs extends StObject {
    
    /** Specifies whether to show or hide preview data dialog.
      */
    var cancelDataInputDialog: js.UndefOr[Boolean] = js.undefined
    
    /** Contains the required data to load the report.
      */
    var dataSets: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Contains the instance of Report Viewer component.
      */
    var reportViewer: js.UndefOr[js.Any] = js.undefined
  }
  object PreviewReportEventArgs {
    
    inline def apply(): PreviewReportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewReportEventArgs]
    }
    
    extension [Self <: PreviewReportEventArgs](x: Self) {
      
      inline def setCancelDataInputDialog(value: Boolean): Self = StObject.set(x, "cancelDataInputDialog", value.asInstanceOf[js.Any])
      
      inline def setCancelDataInputDialogUndefined: Self = StObject.set(x, "cancelDataInputDialog", js.undefined)
      
      inline def setDataSets(value: js.Array[js.Any]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
      
      inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
      
      inline def setDataSetsVarargs(value: js.Any*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
      
      inline def setReportViewer(value: js.Any): Self = StObject.set(x, "reportViewer", value.asInstanceOf[js.Any])
      
      inline def setReportViewerUndefined: Self = StObject.set(x, "reportViewer", js.undefined)
    }
  }
  
  trait ReportDataExtension extends StObject {
    
    /** Gets or sets the class name of the data extension.
      * @Default {empty}
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the name for data extension item to display in the data pane tile.
      * @Default {empty}
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the image class name to load image in data pane tile.
      * @Default {empty}
      */
    var imageClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the name of the datasource type.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ReportDataExtension {
    
    inline def apply(): ReportDataExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportDataExtension]
    }
    
    extension [Self <: ReportDataExtension](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ReportItemExtension extends StObject {
    
    /** Gets or sets the category name for the report item.
      * @Default {empty}
      */
    var category: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the class name of the report item.
      * @Default {empty}
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the name for custom report item to display in the widgets pane tile.
      * @Default {empty}
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the image class name to load image in widgets pane tile.
      * @Default {empty}
      */
    var imageClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the name for the report item.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Gets information to provide content for custom report item tooltip.
      * @Default {null}
      */
    var toolTip: js.UndefOr[js.Any] = js.undefined
  }
  object ReportItemExtension {
    
    inline def apply(): ReportItemExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportItemExtension]
    }
    
    extension [Self <: ReportItemExtension](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setToolTip(value: js.Any): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    }
  }
  
  trait ReportModifiedEventArgs extends StObject {
    
    /** Specifies whether the report is modified or not.
      */
    var isModified: js.UndefOr[Boolean] = js.undefined
    
    /** Name of Opened Report.
      */
    var reportName: js.UndefOr[String] = js.undefined
  }
  object ReportModifiedEventArgs {
    
    inline def apply(): ReportModifiedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportModifiedEventArgs]
    }
    
    extension [Self <: ReportModifiedEventArgs](x: Self) {
      
      inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
      
      inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
      
      inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    }
  }
  
  trait ReportOpenedEventArgs extends StObject {
    
    /** Specifies whether report opened from device or server.
      */
    var isServerReport: js.UndefOr[Boolean] = js.undefined
    
    /** Name of Opened Report.
      */
    var reportName: js.UndefOr[String] = js.undefined
  }
  object ReportOpenedEventArgs {
    
    inline def apply(): ReportOpenedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOpenedEventArgs]
    }
    
    extension [Self <: ReportOpenedEventArgs](x: Self) {
      
      inline def setIsServerReport(value: Boolean): Self = StObject.set(x, "isServerReport", value.asInstanceOf[js.Any])
      
      inline def setIsServerReportUndefined: Self = StObject.set(x, "isServerReport", js.undefined)
      
      inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    }
  }
  
  trait ReportSavedEventArgs extends StObject {
    
    /** Specifies whether report opened from device or server.
      */
    var isServerReport: js.UndefOr[Boolean] = js.undefined
    
    /** States whether report is downloaded from ReportServer.
      */
    var reportAction: js.UndefOr[String] = js.undefined
  }
  object ReportSavedEventArgs {
    
    inline def apply(): ReportSavedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportSavedEventArgs]
    }
    
    extension [Self <: ReportSavedEventArgs](x: Self) {
      
      inline def setIsServerReport(value: Boolean): Self = StObject.set(x, "isServerReport", value.asInstanceOf[js.Any])
      
      inline def setIsServerReportUndefined: Self = StObject.set(x, "isServerReport", js.undefined)
      
      inline def setReportAction(value: String): Self = StObject.set(x, "reportAction", value.asInstanceOf[js.Any])
      
      inline def setReportActionUndefined: Self = StObject.set(x, "reportAction", js.undefined)
    }
  }
  
  trait SaveReportClickEventArgs extends StObject {
    
    /** Name of selected item.
      */
    var select: js.UndefOr[String] = js.undefined
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.undefined
  }
  object SaveReportClickEventArgs {
    
    inline def apply(): SaveReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveReportClickEventArgs]
    }
    
    extension [Self <: SaveReportClickEventArgs](x: Self) {
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ToolbarClickEventArgs extends StObject {
    
    /** Name of clicked item.
      */
    var click: js.UndefOr[String] = js.undefined
    
    /** DOM of the clicked target.
      */
    var target: js.UndefOr[JQuery] = js.undefined
  }
  object ToolbarClickEventArgs {
    
    inline def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    extension [Self <: ToolbarClickEventArgs](x: Self) {
      
      inline def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ToolbarRenderingEventArgs extends StObject
  
  trait ToolbarSettings extends StObject {
    
    /** Shows or hides the grouped items in the toolbar with the help of enum ej.ReportDesigner.ToolbarItems.
      * @Default {ej.ReportDesigner.ToolbarItems.All}
      */
    var items: js.UndefOr[ToolbarItems | String] = js.undefined
    
    /** Shows or hides the toolbar.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the toolbar template ID.
      * @Default {empty}
      */
    var templateId: js.UndefOr[String] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    extension [Self <: ToolbarSettings](x: Self) {
      
      inline def setItems(value: ToolbarItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
}
