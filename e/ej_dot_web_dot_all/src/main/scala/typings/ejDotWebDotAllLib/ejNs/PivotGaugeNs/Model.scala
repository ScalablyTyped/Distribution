package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Sets the mode for the PivotGauge widget for binding either OLAP or Relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String] = js.undefined
  /** Triggers before populating the pivot engine on operating in client mode.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, scala.Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotGauge to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Sets the number of columns to arrange the Pivot Gauges.
    * @Default {0}
    */
  var columnsCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the CSS class to PivotGauge to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
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
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to view PivotGauge from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables tooltip visibility in PivotGauge.
    * @Default {false}
    */
  var enableTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the frame details of PivotGauge here.
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Allows the user to enable PivotGaugeâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to change the format of the label values in PivotGauge.
    * @Default {null}
    */
  var labelFormatSettings: js.UndefOr[LabelFormatSettings] = js.undefined
  /** Triggers when PivotGauge started loading at client-side.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the mode for the PivotGauge widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String] = js.undefined
  /** Triggers when PivotGauge widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when PivotGauge successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit]] = js.undefined
  /** Sets the number of rows to arrange the Pivot Gauges.
    * @Default {0}
    */
  var rowsCount: js.UndefOr[scala.Double] = js.undefined
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
  var showHeaderLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** Connects the service using the specified URL for any server updates on server mode operation.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => scala.Unit = null,
    analysisMode: ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String = null,
    beforePivotEnginePopulate: /* e */ BeforePivotEnginePopulateEventArgs => scala.Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => scala.Unit = null,
    columnsCount: scala.Int | scala.Double = null,
    cssClass: java.lang.String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    frame: Frame = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    labelFormatSettings: LabelFormatSettings = null,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    operationalMode: ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String = null,
    renderComplete: /* e */ RenderCompleteEventArgs => scala.Unit = null,
    renderFailure: /* e */ RenderFailureEventArgs => scala.Unit = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => scala.Unit = null,
    rowsCount: scala.Int | scala.Double = null,
    scales: js.Any = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showHeaderLabel: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
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

