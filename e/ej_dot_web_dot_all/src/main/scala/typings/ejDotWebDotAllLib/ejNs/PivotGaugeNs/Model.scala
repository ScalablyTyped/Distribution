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

