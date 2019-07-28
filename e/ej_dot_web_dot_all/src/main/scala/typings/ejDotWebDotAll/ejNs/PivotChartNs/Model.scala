package typings.ejDotWebDotAll.ejNs.PivotChartNs

import typings.ejDotWebDotAll.ejNs.PivotNs.AnalysisMode
import typings.ejDotWebDotAll.ejNs.PivotNs.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Sets the mode for the pivot chart widget to bind either the OLAP or relational datasource.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array.
    * @Default {[]}
    */
  var axes: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggers before performing export operation in the pivot chart.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.undefined
  /** Triggers before rendering multiple series with multiple axes.
    */
  var beforeSeriesRender: js.UndefOr[js.Function1[/* e */ BeforeSeriesRenderEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from the pivot chart to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Options available to configure the properties of entire series. You can also override the options for specific series by using the series collection.
    * @Default {{}}
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.undefined
  /** Specifies the CSS class to the pivot chart for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in the server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the datasource for the pivot chart widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Triggers when performing drill up/down operation in the pivot chart control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.undefined
  /** Allows you to enable the 3D view of the pivot chart.
    * @Default {false}
    */
  var enable3D: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable context menu options in the pivot chart.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Allows you to render the complete pivot chart on drill operation, when expanding and collapsing members are shown in multi-level labels.
    * @Default {false}
    */
  var enableMultiLevelLabels: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the pivot chart from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable the responsiveness of pivot chart in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** You can customize the legend items and their labels.
    * @Default {{}}
    */
  var legend: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the pivot chart starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the mode for the pivot chart widget to bind the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
  /** This is a horizontal axis that contains options to configure the axis and it is the primary x-axis for all series in the series array. To override x-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryXAxis: js.UndefOr[js.Any] = js.undefined
  /** This is a vertical axis that contains options to configure the axis. This is the primary y-axis for all the series in the series array. To override y-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryYAxis: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the pivot chart widget completes all operations at client-side after the AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when the error occurs on the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
  /** Triggers when the pivot chart successfully reaches the client-side after the AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
  /** Allows you to rotate the angle of pivot chart in 3D view.
    * @Default {0}
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /** Allows you to set the custom name for methods at service-end, when you are communicating on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Options to customize the size of the pivot chart control.
    * @Default {{}}
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /** Options for customizing the title of PivotChart.
    */
  var title: js.UndefOr[Title] = js.undefined
  /** Connects the service by using the specified URL for any server updates while operating the control in the server mode.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.undefined
  /** Options for enabling the zooming feature of the pivot chart.
    * @Default {{}}
    */
  var zooming: js.UndefOr[Zooming] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Unit = null,
    analysisMode: AnalysisMode | String = null,
    axes: js.Array[_] = null,
    beforeExport: /* e */ BeforeExportEventArgs => Unit = null,
    beforeSeriesRender: /* e */ BeforeSeriesRenderEventArgs => Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Unit = null,
    commonSeriesOptions: CommonSeriesOptions = null,
    cssClass: String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    drillSuccess: /* e */ DrillSuccessEventArgs => Unit = null,
    enable3D: js.UndefOr[Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    enableMultiLevelLabels: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    legend: js.Any = null,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    operationalMode: OperationalMode | String = null,
    primaryXAxis: js.Any = null,
    primaryYAxis: js.Any = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Unit = null,
    renderFailure: /* e */ RenderFailureEventArgs => Unit = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => Unit = null,
    rotation: Int | Double = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    size: js.Any = null,
    title: Title = null,
    url: String = null,
    zooming: Zooming = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(afterServiceInvoke))
    if (analysisMode != null) __obj.updateDynamic("analysisMode")(analysisMode.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (beforeExport != null) __obj.updateDynamic("beforeExport")(js.Any.fromFunction1(beforeExport))
    if (beforeSeriesRender != null) __obj.updateDynamic("beforeSeriesRender")(js.Any.fromFunction1(beforeSeriesRender))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(beforeServiceInvoke))
    if (commonSeriesOptions != null) __obj.updateDynamic("commonSeriesOptions")(commonSeriesOptions)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (drillSuccess != null) __obj.updateDynamic("drillSuccess")(js.Any.fromFunction1(drillSuccess))
    if (!js.isUndefined(enable3D)) __obj.updateDynamic("enable3D")(enable3D)
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu)
    if (!js.isUndefined(enableMultiLevelLabels)) __obj.updateDynamic("enableMultiLevelLabels")(enableMultiLevelLabels)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (primaryXAxis != null) __obj.updateDynamic("primaryXAxis")(primaryXAxis)
    if (primaryYAxis != null) __obj.updateDynamic("primaryYAxis")(primaryYAxis)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1(renderFailure))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1(renderSuccess))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (zooming != null) __obj.updateDynamic("zooming")(zooming)
    __obj.asInstanceOf[Model]
  }
}

