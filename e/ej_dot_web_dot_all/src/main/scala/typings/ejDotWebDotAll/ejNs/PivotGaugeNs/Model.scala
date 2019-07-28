package typings.ejDotWebDotAll.ejNs.PivotGaugeNs

import typings.ejDotWebDotAll.ejNs.PivotNs.AnalysisMode
import typings.ejDotWebDotAll.ejNs.PivotNs.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Sets the mode for the PivotGauge widget for binding either OLAP or Relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
  /** Triggers before populating the pivot engine on operating in client mode.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotGauge to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Sets the number of columns to arrange the Pivot Gauges.
    * @Default {0}
    */
  var columnsCount: js.UndefOr[Double] = js.undefined
  /** Specifies the CSS class to PivotGauge to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object utilized to pass additional information between client-end and service-end on operating in server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the PivotGauge widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Enables/disables the animation of pointer in PivotGauge.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to view PivotGauge from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables tooltip visibility in PivotGauge.
    * @Default {false}
    */
  var enableTooltip: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
  /** Specify the frame details of PivotGauge here.
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Allows the user to enable PivotGaugeâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to change the format of the label values in PivotGauge.
    * @Default {null}
    */
  var labelFormatSettings: js.UndefOr[LabelFormatSettings] = js.undefined
  /** Triggers when PivotGauge started loading at client-side.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the mode for the PivotGauge widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
  /** Triggers when PivotGauge widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
  /** Triggers when PivotGauge successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
  /** Sets the number of rows to arrange the Pivot Gauges.
    * @Default {0}
    */
  var rowsCount: js.UndefOr[Double] = js.undefined
  /** Sets the scale values such as pointers, indicators, etc... for PivotGauge.
    * @Default {{}}
    */
  var scales: js.UndefOr[js.Any] = js.undefined
  /** Allows the user to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Enables/disables the header labels in PivotGauge.
    * @Default {true}
    */
  var showHeaderLabel: js.UndefOr[Boolean] = js.undefined
  /** Connects the service using the specified URL for any server updates on server mode operation.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Unit = null,
    analysisMode: AnalysisMode | String = null,
    beforePivotEnginePopulate: /* e */ BeforePivotEnginePopulateEventArgs => Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Unit = null,
    columnsCount: Int | Double = null,
    cssClass: String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableTooltip: js.UndefOr[Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[Boolean] = js.undefined,
    frame: Frame = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    labelFormatSettings: LabelFormatSettings = null,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    operationalMode: OperationalMode | String = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Unit = null,
    renderFailure: /* e */ RenderFailureEventArgs => Unit = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => Unit = null,
    rowsCount: Int | Double = null,
    scales: js.Any = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showHeaderLabel: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(afterServiceInvoke))
    if (analysisMode != null) __obj.updateDynamic("analysisMode")(analysisMode.asInstanceOf[js.Any])
    if (beforePivotEnginePopulate != null) __obj.updateDynamic("beforePivotEnginePopulate")(js.Any.fromFunction1(beforePivotEnginePopulate))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(beforeServiceInvoke))
    if (columnsCount != null) __obj.updateDynamic("columnsCount")(columnsCount.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableTooltip)) __obj.updateDynamic("enableTooltip")(enableTooltip)
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (labelFormatSettings != null) __obj.updateDynamic("labelFormatSettings")(labelFormatSettings)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1(renderFailure))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1(renderSuccess))
    if (rowsCount != null) __obj.updateDynamic("rowsCount")(rowsCount.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings)
    if (!js.isUndefined(showHeaderLabel)) __obj.updateDynamic("showHeaderLabel")(showHeaderLabel)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Model]
  }
}

