package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
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
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = this.set("ajaxBeforeLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAjaxBeforeLoad: Self = this.set("ajaxBeforeLoad", js.undefined)
    
    @scala.inline
    def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = this.set("ajaxError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    
    @scala.inline
    def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = this.set("ajaxSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAjaxSuccess: Self = this.set("ajaxSuccess", js.undefined)
    
    @scala.inline
    def setConfigurePaneSettings(value: ConfigurePaneSettings): Self = this.set("configurePaneSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurePaneSettings: Self = this.set("configurePaneSettings", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNewDataClick(value: /* e */ NewDataClickEventArgs => Unit): Self = this.set("newDataClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNewDataClick: Self = this.set("newDataClick", js.undefined)
    
    @scala.inline
    def setOpenReportClick(value: /* e */ OpenReportClickEventArgs => Unit): Self = this.set("openReportClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpenReportClick: Self = this.set("openReportClick", js.undefined)
    
    @scala.inline
    def setPermissionSettings(value: PermissionSettings): Self = this.set("permissionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSettings: Self = this.set("permissionSettings", js.undefined)
    
    @scala.inline
    def setPreviewReport(value: /* e */ PreviewReportEventArgs => Unit): Self = this.set("previewReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreviewReport: Self = this.set("previewReport", js.undefined)
    
    @scala.inline
    def setReportDataExtensionsVarargs(value: ReportDataExtension*): Self = this.set("reportDataExtensions", js.Array(value :_*))
    
    @scala.inline
    def setReportDataExtensions(value: js.Array[ReportDataExtension]): Self = this.set("reportDataExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDataExtensions: Self = this.set("reportDataExtensions", js.undefined)
    
    @scala.inline
    def setReportItemExtensionsVarargs(value: ReportItemExtension*): Self = this.set("reportItemExtensions", js.Array(value :_*))
    
    @scala.inline
    def setReportItemExtensions(value: js.Array[ReportItemExtension]): Self = this.set("reportItemExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportItemExtensions: Self = this.set("reportItemExtensions", js.undefined)
    
    @scala.inline
    def setReportModified(value: /* e */ ReportModifiedEventArgs => Unit): Self = this.set("reportModified", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportModified: Self = this.set("reportModified", js.undefined)
    
    @scala.inline
    def setReportOpened(value: /* e */ ReportOpenedEventArgs => Unit): Self = this.set("reportOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportOpened: Self = this.set("reportOpened", js.undefined)
    
    @scala.inline
    def setReportPath(value: String): Self = this.set("reportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportPath: Self = this.set("reportPath", js.undefined)
    
    @scala.inline
    def setReportSaved(value: /* e */ ReportSavedEventArgs => Unit): Self = this.set("reportSaved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportSaved: Self = this.set("reportSaved", js.undefined)
    
    @scala.inline
    def setReportServerUrl(value: String): Self = this.set("reportServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportServerUrl: Self = this.set("reportServerUrl", js.undefined)
    
    @scala.inline
    def setReportType(value: String): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportType: Self = this.set("reportType", js.undefined)
    
    @scala.inline
    def setSaveReportClick(value: /* e */ SaveReportClickEventArgs => Unit): Self = this.set("saveReportClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveReportClick: Self = this.set("saveReportClick", js.undefined)
    
    @scala.inline
    def setServiceAuthorizationToken(value: String): Self = this.set("serviceAuthorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAuthorizationToken: Self = this.set("serviceAuthorizationToken", js.undefined)
    
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUrl: Self = this.set("serviceUrl", js.undefined)
    
    @scala.inline
    def setTenantName(value: String): Self = this.set("tenantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantName: Self = this.set("tenantName", js.undefined)
    
    @scala.inline
    def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = this.set("toolbarClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolbarClick: Self = this.set("toolbarClick", js.undefined)
    
    @scala.inline
    def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = this.set("toolbarRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolbarRendering: Self = this.set("toolbarRendering", js.undefined)
    
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
  }
}
