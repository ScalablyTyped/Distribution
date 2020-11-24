package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires before the ajax request process started.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  
  /** Fires when ajax request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  
  /** Fires when ajax post call succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  
  /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
    * @Default {true}
    */
  var autoRender: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets the list of data sources for the RDLC report.
    * @Default {[]}
    */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.native
  
  /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
  
  /** Enables and disables the data source credential block scroller.
    * @Default {true}
    */
  var enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.native
  
  /** Enables and disables the drop-down parameter search.
    * @Default {false}
    */
  var enableDropDownSearch: js.UndefOr[Boolean] = js.native
  
  /** Enables and disables the Error Notification bar.
    * @Default {true}
    */
  var enableNotificationBar: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the page cache of report.
    * @Default {false}
    */
  var enablePageCache: js.UndefOr[Boolean] = js.native
  
  /** Enables and disables the PageVirtualization.
    * @Default {false}
    */
  var enablePageVirtualization: js.UndefOr[Boolean] = js.native
  
  /** Enables and disables the parameter block scroller.
    * @Default {true}
    */
  var enableParameterBlockScroller: js.UndefOr[Boolean] = js.native
  
  /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
    */
  var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, Unit]] = js.native
  
  /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
    */
  var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, Unit]] = js.native
  
  /** Specifies the export settings.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  
  /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
    */
  var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, Unit]] = js.native
  
  /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Specifies the locale for report viewer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the page settings.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  
  /** Specifies the parameter settings.
    */
  var parameterSettings: js.UndefOr[ParameterSettings] = js.native
  
  /** Fires when the dependent parameter value is the parameter block. You can add custom user interface, loading indicator and modify the default progress text, using the
    * ParameterUpdateStateChange event.
    */
  var parameterUpdateStateChange: js.UndefOr[js.Function1[/* e */ ParameterUpdateStateChangeEventArgs, Unit]] = js.native
  
  /** Gets or sets the list of parameters associated with the report.
    * @Default {[]}
    */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** Enables and disables the print mode.
    * @Default {false}
    */
  var printMode: js.UndefOr[Boolean] = js.native
  
  /** Specifies the print option of the report.
    * @Default {ej.ReportViewer.PrintOptions.Default}
    */
  var printOption: js.UndefOr[PrintOptions | String] = js.native
  
  /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
    */
  var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, Unit]] = js.native
  
  /** Specifies the processing mode of the report.
    * @Default {ej.ReportViewer.ProcessingMode.Remote}
    */
  var processingMode: js.UndefOr[ProcessingMode | String] = js.native
  
  /** Specifies the render layout.
    * @Default {ej.ReportViewer.RenderMode.Default}
    */
  var renderMode: js.UndefOr[RenderMode | String] = js.native
  
  /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
    */
  var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, Unit]] = js.native
  
  /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
    */
  var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, Unit]] = js.native
  
  /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
    */
  var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, Unit]] = js.native
  
  /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
    */
  var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, Unit]] = js.native
  
  /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
    */
  var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, Unit]] = js.native
  
  /** Gets or sets the path of the report file.
    * @Default {empty}
    */
  var reportPath: js.UndefOr[String] = js.native
  
  /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
    */
  var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, Unit]] = js.native
  
  /** Gets or sets the reports server URL.
    * @Default {empty}
    */
  var reportServerUrl: js.UndefOr[String] = js.native
  
  /** Specifies the report Web API service URL.
    * @Default {empty}
    */
  var reportServiceUrl: js.UndefOr[String] = js.native
  
  /** Specifies the token for authorizing reporting service url to process the reports.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
  
  /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
    * viewing error detail, you can make use of the showError event.
    */
  var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, Unit]] = js.native
  
  /** Gets or sets the showExceptionsInDialog for report viewer.
    * @Default {false}
    */
  var showExceptionsInDialog: js.UndefOr[Boolean] = js.native
  
  /** Render the ReportViewer height based on the report content size.
    * @Default {false}
    */
  var sizeToReportContent: js.UndefOr[Boolean] = js.native
  
  /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
    */
  var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, Unit]] = js.native
  
  /** This event will be triggered on rendering the Report Viewer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.native
  
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  
  /** Fires when click the View Report Button.
    */
  var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, Unit]] = js.native
  
  /** Gets or sets the zoom factor for report viewer.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
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
    def setAutoRender(value: Boolean): Self = this.set("autoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRender: Self = this.set("autoRender", js.undefined)
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("dataSources", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: js.Array[DataSource]): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = this.set("drillThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillThrough: Self = this.set("drillThrough", js.undefined)
    
    @scala.inline
    def setEnableDatasourceBlockScroller(value: Boolean): Self = this.set("enableDatasourceBlockScroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDatasourceBlockScroller: Self = this.set("enableDatasourceBlockScroller", js.undefined)
    
    @scala.inline
    def setEnableDropDownSearch(value: Boolean): Self = this.set("enableDropDownSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDropDownSearch: Self = this.set("enableDropDownSearch", js.undefined)
    
    @scala.inline
    def setEnableNotificationBar(value: Boolean): Self = this.set("enableNotificationBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNotificationBar: Self = this.set("enableNotificationBar", js.undefined)
    
    @scala.inline
    def setEnablePageCache(value: Boolean): Self = this.set("enablePageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePageCache: Self = this.set("enablePageCache", js.undefined)
    
    @scala.inline
    def setEnablePageVirtualization(value: Boolean): Self = this.set("enablePageVirtualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePageVirtualization: Self = this.set("enablePageVirtualization", js.undefined)
    
    @scala.inline
    def setEnableParameterBlockScroller(value: Boolean): Self = this.set("enableParameterBlockScroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableParameterBlockScroller: Self = this.set("enableParameterBlockScroller", js.undefined)
    
    @scala.inline
    def setExportItemClick(value: /* e */ ExportItemClickEventArgs => Unit): Self = this.set("exportItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExportItemClick: Self = this.set("exportItemClick", js.undefined)
    
    @scala.inline
    def setExportProgressChanged(value: /* e */ ExportProgressChangedEventArgs => Unit): Self = this.set("exportProgressChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExportProgressChanged: Self = this.set("exportProgressChanged", js.undefined)
    
    @scala.inline
    def setExportSettings(value: ExportSettings): Self = this.set("exportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSettings: Self = this.set("exportSettings", js.undefined)
    
    @scala.inline
    def setHyperlink(value: /* e */ HyperlinkEventArgs => Unit): Self = this.set("hyperlink", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPageSettings(value: PageSettings): Self = this.set("pageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSettings: Self = this.set("pageSettings", js.undefined)
    
    @scala.inline
    def setParameterSettings(value: ParameterSettings): Self = this.set("parameterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterSettings: Self = this.set("parameterSettings", js.undefined)
    
    @scala.inline
    def setParameterUpdateStateChange(value: /* e */ ParameterUpdateStateChangeEventArgs => Unit): Self = this.set("parameterUpdateStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParameterUpdateStateChange: Self = this.set("parameterUpdateStateChange", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Parameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPrintMode(value: Boolean): Self = this.set("printMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMode: Self = this.set("printMode", js.undefined)
    
    @scala.inline
    def setPrintOption(value: PrintOptions | String): Self = this.set("printOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintOption: Self = this.set("printOption", js.undefined)
    
    @scala.inline
    def setPrintProgressChanged(value: /* e */ PrintProgressChangedEventArgs => Unit): Self = this.set("printProgressChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrintProgressChanged: Self = this.set("printProgressChanged", js.undefined)
    
    @scala.inline
    def setProcessingMode(value: ProcessingMode | String): Self = this.set("processingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingMode: Self = this.set("processingMode", js.undefined)
    
    @scala.inline
    def setRenderMode(value: RenderMode | String): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    
    @scala.inline
    def setRenderingBegin(value: /* e */ RenderingBeginEventArgs => Unit): Self = this.set("renderingBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderingBegin: Self = this.set("renderingBegin", js.undefined)
    
    @scala.inline
    def setRenderingComplete(value: /* e */ RenderingCompleteEventArgs => Unit): Self = this.set("renderingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderingComplete: Self = this.set("renderingComplete", js.undefined)
    
    @scala.inline
    def setReportError(value: /* e */ ReportErrorEventArgs => Unit): Self = this.set("reportError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportError: Self = this.set("reportError", js.undefined)
    
    @scala.inline
    def setReportExport(value: /* e */ ReportExportEventArgs => Unit): Self = this.set("reportExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportExport: Self = this.set("reportExport", js.undefined)
    
    @scala.inline
    def setReportLoaded(value: /* e */ ReportLoadedEventArgs => Unit): Self = this.set("reportLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportLoaded: Self = this.set("reportLoaded", js.undefined)
    
    @scala.inline
    def setReportPath(value: String): Self = this.set("reportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportPath: Self = this.set("reportPath", js.undefined)
    
    @scala.inline
    def setReportPrint(value: /* e */ ReportPrintEventArgs => Unit): Self = this.set("reportPrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReportPrint: Self = this.set("reportPrint", js.undefined)
    
    @scala.inline
    def setReportServerUrl(value: String): Self = this.set("reportServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportServerUrl: Self = this.set("reportServerUrl", js.undefined)
    
    @scala.inline
    def setReportServiceUrl(value: String): Self = this.set("reportServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportServiceUrl: Self = this.set("reportServiceUrl", js.undefined)
    
    @scala.inline
    def setServiceAuthorizationToken(value: String): Self = this.set("serviceAuthorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAuthorizationToken: Self = this.set("serviceAuthorizationToken", js.undefined)
    
    @scala.inline
    def setShowError(value: /* e */ ShowErrorEventArgs => Unit): Self = this.set("showError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShowError: Self = this.set("showError", js.undefined)
    
    @scala.inline
    def setShowExceptionsInDialog(value: Boolean): Self = this.set("showExceptionsInDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowExceptionsInDialog: Self = this.set("showExceptionsInDialog", js.undefined)
    
    @scala.inline
    def setSizeToReportContent(value: Boolean): Self = this.set("sizeToReportContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeToReportContent: Self = this.set("sizeToReportContent", js.undefined)
    
    @scala.inline
    def setToolBarItemClick(value: /* e */ ToolBarItemClickEventArgs => Unit): Self = this.set("toolBarItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolBarItemClick: Self = this.set("toolBarItemClick", js.undefined)
    
    @scala.inline
    def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = this.set("toolbarRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolbarRendering: Self = this.set("toolbarRendering", js.undefined)
    
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    
    @scala.inline
    def setViewReportClick(value: /* e */ ViewReportClickEventArgs => Unit): Self = this.set("viewReportClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteViewReportClick: Self = this.set("viewReportClick", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
}
