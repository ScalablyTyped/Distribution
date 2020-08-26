package typings.ejWebAll.ej.PivotTreeMap

import typings.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotTreeMap to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Specifies the CSS class to PivotTreeMap to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the data source for the PivotTreeMap widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Triggers when drill up/down happens in PivotTreeMap control. And it returns the outer HTML of PivotTreeMap control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Allows the user to enable PivotTreeMapâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers when PivotTreeMap starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the PivotTreeMap widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** Triggers when PivotTreeMap widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when PivotTreeMap successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Allows the user to set custom name for the methods at service-end, communicated on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Connects the service using the specified URL for any server updates.
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
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
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
    def setEnableXHRCredentials(value: Boolean): Self = this.set("enableXHRCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableXHRCredentials: Self = this.set("enableXHRCredentials", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
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
    def setServiceMethodSettings(value: ServiceMethodSettings): Self = this.set("serviceMethodSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceMethodSettings: Self = this.set("serviceMethodSettings", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

