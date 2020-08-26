package typings.ejWebAll.ej.PivotGauge

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the mode for the PivotGauge widget for binding either OLAP or Relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  /** Triggers before populating the pivot engine on operating in client mode.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotGauge to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the number of columns to arrange the Pivot Gauges.
    * @Default {0}
    */
  var columnsCount: js.UndefOr[Double] = js.native
  /** Specifies the CSS class to PivotGauge to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end on operating in server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the data source for the PivotGauge widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Enables/disables the animation of pointer in PivotGauge.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Allows the user to view PivotGauge from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables/disables tooltip visibility in PivotGauge.
    * @Default {false}
    */
  var enableTooltip: js.UndefOr[Boolean] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Specify the frame details of PivotGauge here.
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.native
  /** Allows the user to enable PivotGaugeâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Allows the user to change the format of the label values in PivotGauge.
    * @Default {null}
    */
  var labelFormatSettings: js.UndefOr[LabelFormatSettings] = js.native
  /** Triggers when PivotGauge started loading at client-side.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the PivotGauge widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** Triggers when PivotGauge widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when PivotGauge successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Sets the number of rows to arrange the Pivot Gauges.
    * @Default {0}
    */
  var rowsCount: js.UndefOr[Double] = js.native
  /** Sets the scale values such as pointers, indicators, etc... for PivotGauge.
    * @Default {{}}
    */
  var scales: js.UndefOr[js.Any] = js.native
  /** Allows the user to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Enables/disables the header labels in PivotGauge.
    * @Default {true}
    */
  var showHeaderLabel: js.UndefOr[Boolean] = js.native
  /** Connects the service using the specified URL for any server updates on server mode operation.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
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
    def setBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = this.set("beforePivotEnginePopulate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforePivotEnginePopulate: Self = this.set("beforePivotEnginePopulate", js.undefined)
    @scala.inline
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
    @scala.inline
    def setColumnsCount(value: Double): Self = this.set("columnsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsCount: Self = this.set("columnsCount", js.undefined)
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
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableTooltip(value: Boolean): Self = this.set("enableTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTooltip: Self = this.set("enableTooltip", js.undefined)
    @scala.inline
    def setEnableXHRCredentials(value: Boolean): Self = this.set("enableXHRCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableXHRCredentials: Self = this.set("enableXHRCredentials", js.undefined)
    @scala.inline
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLabelFormatSettings(value: LabelFormatSettings): Self = this.set("labelFormatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormatSettings: Self = this.set("labelFormatSettings", js.undefined)
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
    def setRowsCount(value: Double): Self = this.set("rowsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsCount: Self = this.set("rowsCount", js.undefined)
    @scala.inline
    def setScales(value: js.Any): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setServiceMethodSettings(value: ServiceMethodSettings): Self = this.set("serviceMethodSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceMethodSettings: Self = this.set("serviceMethodSettings", js.undefined)
    @scala.inline
    def setShowHeaderLabel(value: Boolean): Self = this.set("showHeaderLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaderLabel: Self = this.set("showHeaderLabel", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

