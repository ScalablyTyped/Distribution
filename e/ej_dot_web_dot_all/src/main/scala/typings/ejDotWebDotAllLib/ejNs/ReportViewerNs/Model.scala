package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires before the ajax request process started.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** Fires when ajax request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Fires when ajax post call succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
    * @Default {true}
    */
  var autoRender: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the list of data sources for the RDLC report.
    * @Default {[]}
    */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
  /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, scala.Unit]] = js.undefined
  /** Enables and disables the data source credential block scroller.
    * @Default {true}
    */
  var enableDatasourceBlockScroller: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables and disables the drop-down parameter search.
    * @Default {false}
    */
  var enableDropDownSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables and disables the Error Notification bar.
    * @Default {true}
    */
  var enableNotificationBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the page cache of report.
    * @Default {false}
    */
  var enablePageCache: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables and disables the PageVirtualization.
    * @Default {false}
    */
  var enablePageVirtualization: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables and disables the parameter block scroller.
    * @Default {true}
    */
  var enableParameterBlockScroller: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
    */
  var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
    */
  var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, scala.Unit]] = js.undefined
  /** Specifies the export settings.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
    */
  var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, scala.Unit]] = js.undefined
  /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the locale for report viewer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the page settings.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Gets or sets the list of parameters associated with the report.
    * @Default {[]}
    */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Enables and disables the print mode.
    * @Default {false}
    */
  var printMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the print option of the report.
    * @Default {ej.ReportViewer.PrintOptions.Default}
    */
  var printOptions: js.UndefOr[PrintOptions | java.lang.String] = js.undefined
  /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
    */
  var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, scala.Unit]] = js.undefined
  /** Specifies the processing mode of the report.
    * @Default {ej.ReportViewer.ProcessingMode.Remote}
    */
  var processingMode: js.UndefOr[ProcessingMode | java.lang.String] = js.undefined
  /** Specifies the render layout.
    * @Default {ej.ReportViewer.RenderMode.Default}
    */
  var renderMode: js.UndefOr[RenderMode | java.lang.String] = js.undefined
  /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
    */
  var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, scala.Unit]] = js.undefined
  /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
    */
  var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
    */
  var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, scala.Unit]] = js.undefined
  /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
    */
  var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, scala.Unit]] = js.undefined
  /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
    */
  var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the path of the report file.
    * @Default {empty}
    */
  var reportPath: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
    */
  var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the reports server URL.
    * @Default {empty}
    */
  var reportServerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the report Web API service URL.
    * @Default {empty}
    */
  var reportServiceUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the token for authorizing reporting service url to process the reports.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
    * viewing error detail, you can make use of the showError event.
    */
  var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, scala.Unit]] = js.undefined
  /** Render the ReportViewer height based on the report content size.
    * @Default {false}
    */
  var sizeToReportContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
    */
  var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, scala.Unit]] = js.undefined
  /** This event will be triggered on rendering the Report Viewer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Fires when click the View Report Button.
    */
  var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the zoom factor for report viewer.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => scala.Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    autoRender: js.UndefOr[scala.Boolean] = js.undefined,
    dataSources: js.Array[DataSource] = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    drillThrough: /* e */ DrillThroughEventArgs => scala.Unit = null,
    enableDatasourceBlockScroller: js.UndefOr[scala.Boolean] = js.undefined,
    enableDropDownSearch: js.UndefOr[scala.Boolean] = js.undefined,
    enableNotificationBar: js.UndefOr[scala.Boolean] = js.undefined,
    enablePageCache: js.UndefOr[scala.Boolean] = js.undefined,
    enablePageVirtualization: js.UndefOr[scala.Boolean] = js.undefined,
    enableParameterBlockScroller: js.UndefOr[scala.Boolean] = js.undefined,
    exportItemClick: /* e */ ExportItemClickEventArgs => scala.Unit = null,
    exportProgressChanged: /* e */ ExportProgressChangedEventArgs => scala.Unit = null,
    exportSettings: ExportSettings = null,
    hyperlink: /* e */ HyperlinkEventArgs => scala.Unit = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    pageSettings: PageSettings = null,
    parameters: js.Array[Parameter] = null,
    printMode: js.UndefOr[scala.Boolean] = js.undefined,
    printOptions: PrintOptions | java.lang.String = null,
    printProgressChanged: /* e */ PrintProgressChangedEventArgs => scala.Unit = null,
    processingMode: ProcessingMode | java.lang.String = null,
    renderMode: RenderMode | java.lang.String = null,
    renderingBegin: /* e */ RenderingBeginEventArgs => scala.Unit = null,
    renderingComplete: /* e */ RenderingCompleteEventArgs => scala.Unit = null,
    reportError: /* e */ ReportErrorEventArgs => scala.Unit = null,
    reportExport: /* e */ ReportExportEventArgs => scala.Unit = null,
    reportLoaded: /* e */ ReportLoadedEventArgs => scala.Unit = null,
    reportPath: java.lang.String = null,
    reportPrint: /* e */ ReportPrintEventArgs => scala.Unit = null,
    reportServerUrl: java.lang.String = null,
    reportServiceUrl: java.lang.String = null,
    serviceAuthorizationToken: java.lang.String = null,
    showError: /* e */ ShowErrorEventArgs => scala.Unit = null,
    sizeToReportContent: js.UndefOr[scala.Boolean] = js.undefined,
    toolBarItemClick: /* e */ ToolBarItemClickEventArgs => scala.Unit = null,
    toolbarRendering: /* e */ ToolbarRenderingEventArgs => scala.Unit = null,
    toolbarSettings: ToolbarSettings = null,
    viewReportClick: /* e */ ViewReportClickEventArgs => scala.Unit = null,
    zoomFactor: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender)
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(js.Any.fromFunction1(drillThrough))
    if (!js.isUndefined(enableDatasourceBlockScroller)) __obj.updateDynamic("enableDatasourceBlockScroller")(enableDatasourceBlockScroller)
    if (!js.isUndefined(enableDropDownSearch)) __obj.updateDynamic("enableDropDownSearch")(enableDropDownSearch)
    if (!js.isUndefined(enableNotificationBar)) __obj.updateDynamic("enableNotificationBar")(enableNotificationBar)
    if (!js.isUndefined(enablePageCache)) __obj.updateDynamic("enablePageCache")(enablePageCache)
    if (!js.isUndefined(enablePageVirtualization)) __obj.updateDynamic("enablePageVirtualization")(enablePageVirtualization)
    if (!js.isUndefined(enableParameterBlockScroller)) __obj.updateDynamic("enableParameterBlockScroller")(enableParameterBlockScroller)
    if (exportItemClick != null) __obj.updateDynamic("exportItemClick")(js.Any.fromFunction1(exportItemClick))
    if (exportProgressChanged != null) __obj.updateDynamic("exportProgressChanged")(js.Any.fromFunction1(exportProgressChanged))
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(js.Any.fromFunction1(hyperlink))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (!js.isUndefined(printMode)) __obj.updateDynamic("printMode")(printMode)
    if (printOptions != null) __obj.updateDynamic("printOptions")(printOptions.asInstanceOf[js.Any])
    if (printProgressChanged != null) __obj.updateDynamic("printProgressChanged")(js.Any.fromFunction1(printProgressChanged))
    if (processingMode != null) __obj.updateDynamic("processingMode")(processingMode.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderingBegin != null) __obj.updateDynamic("renderingBegin")(js.Any.fromFunction1(renderingBegin))
    if (renderingComplete != null) __obj.updateDynamic("renderingComplete")(js.Any.fromFunction1(renderingComplete))
    if (reportError != null) __obj.updateDynamic("reportError")(js.Any.fromFunction1(reportError))
    if (reportExport != null) __obj.updateDynamic("reportExport")(js.Any.fromFunction1(reportExport))
    if (reportLoaded != null) __obj.updateDynamic("reportLoaded")(js.Any.fromFunction1(reportLoaded))
    if (reportPath != null) __obj.updateDynamic("reportPath")(reportPath)
    if (reportPrint != null) __obj.updateDynamic("reportPrint")(js.Any.fromFunction1(reportPrint))
    if (reportServerUrl != null) __obj.updateDynamic("reportServerUrl")(reportServerUrl)
    if (reportServiceUrl != null) __obj.updateDynamic("reportServiceUrl")(reportServiceUrl)
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken)
    if (showError != null) __obj.updateDynamic("showError")(js.Any.fromFunction1(showError))
    if (!js.isUndefined(sizeToReportContent)) __obj.updateDynamic("sizeToReportContent")(sizeToReportContent)
    if (toolBarItemClick != null) __obj.updateDynamic("toolBarItemClick")(js.Any.fromFunction1(toolBarItemClick))
    if (toolbarRendering != null) __obj.updateDynamic("toolbarRendering")(js.Any.fromFunction1(toolbarRendering))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (viewReportClick != null) __obj.updateDynamic("viewReportClick")(js.Any.fromFunction1(viewReportClick))
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

