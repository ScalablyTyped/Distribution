package typings.ejWebAll.ej.PivotChart

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the mode for the pivot chart widget to bind either the OLAP or relational datasource.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array.
    * @Default {[]}
    */
  var axes: js.UndefOr[js.Array[_]] = js.native
  /** Triggers before performing export operation in the pivot chart.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
  /** Triggers before rendering multiple series with multiple axes.
    */
  var beforeSeriesRender: js.UndefOr[js.Function1[/* e */ BeforeSeriesRenderEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from the pivot chart to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Options available to configure the properties of entire series. You can also override the options for specific series by using the series collection.
    * @Default {{}}
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.native
  /** Specifies the CSS class to the pivot chart for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in the server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the datasource for the pivot chart widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Triggers when performing drill up/down operation in the pivot chart control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
  /** Allows you to enable the 3D view of the pivot chart.
    * @Default {false}
    */
  var enable3D: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable context menu options in the pivot chart.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Allows you to render the complete pivot chart on drill operation, when expanding and collapsing members are shown in multi-level labels.
    * @Default {false}
    */
  var enableMultiLevelLabels: js.UndefOr[Boolean] = js.native
  /** Allows you to view the pivot chart from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Allows you to enable the responsiveness of pivot chart in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** You can customize the legend items and their labels.
    * @Default {{}}
    */
  var legend: js.UndefOr[js.Any] = js.native
  /** Triggers when the pivot chart starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the pivot chart widget to bind the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** This is a horizontal axis that contains options to configure the axis and it is the primary x-axis for all series in the series array. To override x-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryXAxis: js.UndefOr[js.Any] = js.native
  /** This is a vertical axis that contains options to configure the axis. This is the primary y-axis for all the series in the series array. To override y-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryYAxis: js.UndefOr[js.Any] = js.native
  /** Triggers when the pivot chart widget completes all operations at client-side after the AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when the error occurs on the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when the pivot chart successfully reaches the client-side after the AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Allows you to rotate the angle of pivot chart in 3D view.
    * @Default {0}
    */
  var rotation: js.UndefOr[Double] = js.native
  /** Allows you to set the custom name for methods at service-end, when you are communicating on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Options to customize the size of the pivot chart control.
    * @Default {{}}
    */
  var size: js.UndefOr[js.Any] = js.native
  /** Options for customizing the title of PivotChart.
    */
  var title: js.UndefOr[Title] = js.native
  /** Connects the service by using the specified URL for any server updates while operating the control in the server mode.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
  /** Options for enabling the zooming feature of the pivot chart.
    * @Default {{}}
    */
  var zooming: js.UndefOr[Zooming] = js.native
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
    def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = this.set("afterServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterServiceInvoke: Self = this.set("afterServiceInvoke", js.undefined)
    @scala.inline
    def setAnalysisMode(value: AnalysisMode | String): Self = this.set("analysisMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalysisMode: Self = this.set("analysisMode", js.undefined)
    @scala.inline
    def setAxesVarargs(value: js.Any*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[_]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = this.set("beforeExport", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeExport: Self = this.set("beforeExport", js.undefined)
    @scala.inline
    def setBeforeSeriesRender(value: /* e */ BeforeSeriesRenderEventArgs => Unit): Self = this.set("beforeSeriesRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSeriesRender: Self = this.set("beforeSeriesRender", js.undefined)
    @scala.inline
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
    @scala.inline
    def setCommonSeriesOptions(value: CommonSeriesOptions): Self = this.set("commonSeriesOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonSeriesOptions: Self = this.set("commonSeriesOptions", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = this.set("drillSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrillSuccess: Self = this.set("drillSuccess", js.undefined)
    @scala.inline
    def setEnable3D(value: Boolean): Self = this.set("enable3D", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable3D: Self = this.set("enable3D", js.undefined)
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    @scala.inline
    def setEnableMultiLevelLabels(value: Boolean): Self = this.set("enableMultiLevelLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMultiLevelLabels: Self = this.set("enableMultiLevelLabels", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableXHRCredentials(value: Boolean): Self = this.set("enableXHRCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableXHRCredentials: Self = this.set("enableXHRCredentials", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOperationalMode(value: OperationalMode | String): Self = this.set("operationalMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalMode: Self = this.set("operationalMode", js.undefined)
    @scala.inline
    def setPrimaryXAxis(value: js.Any): Self = this.set("primaryXAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryXAxis: Self = this.set("primaryXAxis", js.undefined)
    @scala.inline
    def setPrimaryYAxis(value: js.Any): Self = this.set("primaryYAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryYAxis: Self = this.set("primaryYAxis", js.undefined)
    @scala.inline
    def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = this.set("renderComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderComplete: Self = this.set("renderComplete", js.undefined)
    @scala.inline
    def setRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = this.set("renderFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderFailure: Self = this.set("renderFailure", js.undefined)
    @scala.inline
    def setRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = this.set("renderSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderSuccess: Self = this.set("renderSuccess", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setServiceMethodSettings(value: ServiceMethodSettings): Self = this.set("serviceMethodSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceMethodSettings: Self = this.set("serviceMethodSettings", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: Title): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setZooming(value: Zooming): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

