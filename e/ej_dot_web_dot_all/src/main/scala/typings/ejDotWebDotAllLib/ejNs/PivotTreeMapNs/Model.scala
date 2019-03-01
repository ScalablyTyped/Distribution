package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotTreeMap to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the CSS class to PivotTreeMap to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the PivotTreeMap widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Triggers when drill up/down happens in PivotTreeMap control. And it returns the outer HTML of PivotTreeMap control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, scala.Unit]] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to enable PivotTreeMapâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when PivotTreeMap starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the mode for the PivotTreeMap widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String] = js.undefined
  /** Triggers when PivotTreeMap widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when PivotTreeMap successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to set custom name for the methods at service-end, communicated on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit] = null,
    beforeServiceInvoke: js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    drillSuccess: js.Function1[/* e */ DrillSuccessEventArgs, scala.Unit] = null,
    enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    operationalMode: ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String = null,
    renderComplete: js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit] = null,
    renderFailure: js.Function1[/* e */ RenderFailureEventArgs, scala.Unit] = null,
    renderSuccess: js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit] = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    url: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(afterServiceInvoke)
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(beforeServiceInvoke)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (drillSuccess != null) __obj.updateDynamic("drillSuccess")(drillSuccess)
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (load != null) __obj.updateDynamic("load")(load)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(renderComplete)
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(renderFailure)
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(renderSuccess)
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Model]
  }
}

